/**
 * Clase que gestiona TODO el sistema de combate por turnos del juego.
 *
 * RESPONSABILIDADES PRINCIPALES:
 * - Simular un combate entre el personaje del jugador y un enemigo predefinido.
 * - Determinar orden de turnos según velocidad de cada participante.
 * - Permitir al jugador elegir entre atacar (daño alto) o defender (reducción de daño recibido).
 * - Calcular daño infligido y recibido con modificadores temporales.
 * - Guardar y restaurar atributos originales del jugador al terminar combate.
 * - Devolver true (victoria) o false (derrota) según el resultado.
 *
 * Se instancia:
 * - En Juego.jugarPartida() cuando la clave siguiente es "combate".
 * - Se crea un nuevo objeto Combatir cada vez que hay combate (no se reutiliza estado).
 *
 * Cumple requisito indirecto:
 * - Lógica compleja encapsulada en una clase dedicada (modularidad).
 * - Uso de atributos modificados temporalmente (guardado/restaurado).
 * - Sistema por turnos basado en velocidad (mecánica estratégica).
 *
 * Relación con otras clases:
 * - Recibe Personaje del jugador (modifica atributos temporalmente).
 * - Llamado desde Juego cuando se activa combate.
 * - Influye en resultado final (victoria → siguiente clave positiva, derrota → final malo).
 *
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import utils.Validaciones;

public class Combatir {
	/**
	 * Generador de números aleatorios usado para:
	 * - Decidir acciones del enemigo (atacar o defender).
	 * - Generar atributos aleatorios del enemigo (en crearEnemigo).
	 * 
	 * Instanciado una sola vez como atributo de clase (no se crea en cada combate).
	 */
	private Random random = new Random();
	/**
	 * Lista temporal que guarda los atributos originales del jugador antes del combate.
	 * Índices:
	 * 0 → velocidad
	 * 1 → fuerza
	 * 2 → resistencia
	 * 
	 * Se usa para restaurar valores exactos al terminar (resetearPersonaje).
	 * Se limpia automáticamente al crear nueva instancia de Combatir.
	 */
	List<Short> atributos= new ArrayList<Short>();
	/**
	 * Guarda los tres atributos principales del jugador antes de iniciar el combate.
	 * 
	 * FUNCIONAMIENTO:
	 * - Añade velocidad, fuerza y resistencia a la lista atributos (en ese orden).
	 * - Se llama automáticamente al inicio de batalla().
	 * 
	 * @param personaje el jugador (se leen sus atributos actuales)
	 */
	public void guardarAtributos (Personaje personaje) {
		atributos.add(personaje.getVelocidad());
		atributos.add(personaje.getFuerza());
		atributos.add(personaje.getResistencia());
	}
	/**
	 * Restaura los atributos originales del jugador al finalizar el combate.
	 * 
	 * FUNCIONAMIENTO:
	 * - Lee los valores guardados en atributos (índice 0 = velocidad, 1 = fuerza, 2 = resistencia).
	 * - Los asigna de nuevo al personaje.
	 * - Se llama al final de batalla() (importante para que no queden modificadores permanentes).
	 * 
	 * @param personaje el jugador (se modifican sus atributos)
	 */
	public void resetearPersonaje (Personaje personaje) {
		personaje.setVelocidad(atributos.get(0));
		personaje.setFuerza(atributos.get(1));
		personaje.setResistencia(atributos.get(2));
	}
	/**
	 * Método principal que ejecuta un combate completo entre el jugador y un enemigo.
	 *
	 * FUNCIONAMIENTO DETALLADO:
	 * 1. Guarda atributos originales del jugador (guardarAtributos).
	 * 2. Crea enemigo con atributos aleatorios (crearEnemigo).
	 * 3. Muestra inicio de combate y estado inicial del enemigo.
	 * 4. Bucle mientras ambos tengan resistencia > 0:
	 *    - Muestra estado actual de vida.
	 *    - Muestra opciones al jugador (1. Atacar, 2. Defender).
	 *    - Lee elección validada del jugador.
	 *    - Genera acción aleatoria del enemigo (1 o 2).
	 *    - Ejecuta turno completo (turno).
	 * 5. Al terminar el bucle:
	 *    - Restaura atributos originales del jugador (resetearPersonaje).
	 *    - Devuelve true si enemigo tiene resistencia <= 0 (victoria), false si no (derrota).
	 *
	 * Uso principal:
	 * - Llamado en Juego.jugarPartida() cuando clave = "combate".
	 * - Enemigo generado con atributos aleatorios cada vez (variedad).
	 *
	 * @param jugador Personaje del jugador (se modifica temporalmente durante combate)
	 * @param nombreEnemigo nombre del enemigo (ej: "Aurelia")
	 * @param generoEnemigo género del enemigo (para personalización futura si se expande)
	 * @param caracteristicaEnemigo rasgo del enemigo (solo descriptivo)
	 * @return true si el jugador gana (enemigo a 0 resistencia), false si pierde
	 */
	public boolean batalla (Personaje jugador, String nombreEnemigo, String generoEnemigo, String caracteristicaEnemigo) {

		guardarAtributos(jugador);// Guarda estado original antes de cualquier cambio
		Personaje enemigo = crearEnemigo(nombreEnemigo, generoEnemigo, caracteristicaEnemigo);

		System.out.println("\n¡Combate iniciado contra " + enemigo.getNombre() + "!");
		enemigo.mostrar();// Muestra atributos del enemigo al inicio

		while (jugador.getResistencia() > 0 && enemigo.getResistencia() > 0) {

			System.out.println("\nTu turno: Vida=" + jugador.getResistencia() + " | Enemigo Vida=" + enemigo.getResistencia());
			System.out.println("1. Atacar");
			System.out.println("2. Defender");

			short accionJugador = Validaciones.obtenerOpcionValida("Elige acción: ", (short) 1, (short) 2);
			// Acción del enemigo: aleatoria (1 o 2)
			short accionEnemigo = (short) (random.nextInt(2) + 1);

			turno(jugador, enemigo, accionJugador,accionEnemigo);
		}

		resetearPersonaje(jugador);// Restaura atributos originales (muy importante)

		return enemigo.getResistencia()<=0;// Victoria si enemigo llega a 0 o menos
	}
	/**
	 * Crea un enemigo con atributos aleatorios (dentro de rango razonable).
	 * 
	 * FUNCIONAMIENTO:
	 * - Fuerza, resistencia y velocidad: entre 5 y 14 (Math.random() * 10 + 5).
	 * - Crea objeto Personaje con nombre, género, característica y atributos aleatorios.
	 * 
	 * Uso:
	 * - Llamado dentro de batalla() para generar enemigo fresco cada combate.
	 * 
	 * @param nombre nombre del enemigo (ej: "Aurelia")
	 * @param genero género (para posible uso futuro)
	 * @param caracteristica rasgo descriptivo (solo narrativo)
	 * @return Personaje enemigo listo para combatir
	 */
	public Personaje crearEnemigo(String nombre, String genero, String caracteristica) {
		// Estadísticas aleatorias del enemigo (rango 5-14)
		short fuerza = (short) (Math.random() * 10 + 5);
		short resistencia = (short) (Math.random() * 10 + 5);
		short velocidad = (short) (Math.random() * 10 + 5);

		Personaje enemigo = new Personaje(nombre, genero, caracteristica, fuerza, resistencia, velocidad);
		return enemigo;
	}
	/**
	 * Ejecuta el intercambio de golpes entre atacante y defensor.
	 * Aplica modificadores según acción elegida.
	 * 
	 * FUNCIONAMIENTO:
	 * - Si atacante ataca (1) y defensor ataca (1): atacante gana +1 fuerza, daño = fuerza/2.
	 * - Si atacante ataca (1): daño = fuerza/2, atacante gana +1 fuerza.
	 * - Si atacante defiende (2): no hace daño, gana +1 velocidad.
	 * - Aplica daño al defensor.
	 * - Muestra mensaje de acción y daño.
	 * 
	 * @param accionJugador acción del atacante (1 = atacar, 2 = defender)
	 * @param atacante quien ataca en este golpe
	 * @param defensor quien recibe el golpe
	 * @param accionDefensor acción del defensor (para caso mutuo ataque)
	 */
	public void golpe(short accionJugador, Personaje atacante, Personaje defensor, short accionDefensor) {
		short danyo= 0;
		if (accionJugador == 1 && accionDefensor==1) {
			atacante.setFuerza((short)(atacante.getFuerza()+1));// Bono por choque de ataques
			danyo= (short) (atacante.getFuerza()/ 2);// Daño reducido
			defensor.setResistencia((short) (defensor.getResistencia() - danyo));
			atacante.setFuerza((short)(atacante.getFuerza()+1));// Bono adicional
		}
		if(accionJugador==1) {
			System.out.println(atacante.getNombre() + " ataca y hace " + danyo + " de daño");
			atacante.setFuerza((short)(atacante.getFuerza()+1));// Bono por atacar
		}else {
			System.out.println(atacante.getNombre() + " adopta postura defensiva.");
			atacante.setVelocidad((short)(atacante.getVelocidad()+1));// Bono defensivo
		}
	}
	/**
	 * Ejecuta un turno completo de combate (dos golpes posibles).
	 * 
	 * FUNCIONAMIENTO:
	 * 1. Compara velocidad para decidir quién actúa primero.
	 * 2. Asigna atacante/segundo y sus acciones.
	 * 3. Ejecuta golpe del primero.
	 * 4. Si el segundo sigue vivo → ejecuta su golpe.
	 * 
	 * @param jugador personaje del jugador
	 * @param enemigo personaje enemigo
	 * @param accionJugador acción elegida por jugador (1 o 2)
	 * @param accionEnemigo acción aleatoria del enemigo (1 o 2)
	 */
	public void turno(Personaje jugador, Personaje enemigo, short accionJugador, short accionEnemigo) {
		boolean jugadorPrimero = jugador.getVelocidad() >= enemigo.getVelocidad();

		//Asigna quien ataca primero
		Personaje primero     = jugadorPrimero ? jugador : enemigo;
		Personaje segundo     = jugadorPrimero ? enemigo : jugador;

		short accionPrimero   = jugadorPrimero ? accionJugador : accionEnemigo;
		short accionSegundo   = jugadorPrimero ? accionEnemigo : accionJugador;

		// Ejecuta golpe del primero
		golpe(accionPrimero, primero, segundo, accionSegundo);

		// Si el segundo sigue vivo: realiza su acción
		if (segundo.getResistencia() > 0) {
			golpe(accionSegundo, segundo, primero, accionPrimero);
		}
	}
}
