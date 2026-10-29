/**
 * Clase auxiliar estática que gestiona la asignación inicial y modificación de los atributos del personaje.
 * 
 * RESPONSABILIDAD ÚNICA:
 * - Permitir al jugador distribuir 10 puntos entre los tres atributos principales (fuerza, resistencia, velocidad) de forma interactiva.
 * - Crear el objeto Personaje con los valores finales elegidos por el jugador.
 * - Proporcionar métodos genéricos para aumentar o reducir atributos (aunque solo se usan en asignación inicial en esta versión).
 * 
 * Se utiliza:
 * - En ControladorPartida.iniciarNuevaPartida() → después de elegir nombre y género.
 * - Es el único punto donde el jugador distribuye atributos (no hay progresión posterior ni niveles).
 * 
 * Cumple requisito indirecto:
 * - Lógica de asignación de atributos encapsulada y reutilizable.
 * - Uso de métodos estáticos para simplicidad y acceso directo sin instanciar.
 * - Interacción con el usuario mediante Validaciones (cumple requisito de control de entradas).
 * 
 * Relación con otras clases:
 * - Crea objeto Personaje (lo devuelve para asignarlo a Partida).
 * - Llamada desde ControladorPartida.iniciarNuevaPartida().
 * - El Personaje resultante se pasa a Partida y se usa en Combatir y Juego.
 * - Usa Validaciones para leer entradas seguras.
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package modelo;

import utils.Validaciones;

public class Atributos {
	/**
	 * Método estático para aumentar la fuerza del personaje.
	 * 
	 * FUNCIONAMIENTO:
	 * - Suma la cantidad indicada al valor actual de fuerza.
	 * - No valida límites superiores (puede superar valores iniciales).
	 * 
	 * Uso actual:
	 * - No se usa en el flujo principal (preparado para bonos, eventos o expansiones).
	 * 
	 * @param p personaje al que aumentar fuerza
	 * @param cantidad cantidad de puntos a sumar (debe ser positivo)
	 */
	public static void aumentarFuerza(Personaje p, short cantidad) {
		p.setFuerza((short) (p.getFuerza() + cantidad));
	}
	/**
	 * Método estático para aumentar la resistencia del personaje.
	 * 
	 * FUNCIONAMIENTO:
	 * - Suma la cantidad indicada al valor actual de resistencia.
	 * 
	 * Uso actual:
	 * - No usado en flujo principal (preparado para bonos o recuperación).
	 * 
	 * @param p personaje al que aumentar resistencia
	 * @param cantidad cantidad de puntos a sumar
	 */
	public static void aumentarResistencia(Personaje p, short cantidad) {
		p.setResistencia((short) (p.getResistencia() + cantidad));
	}
	/**
	 * Método estático para aumentar la velocidad del personaje.
	 * 
	 * FUNCIONAMIENTO:
	 * - Suma la cantidad indicada al valor actual de velocidad.
	 * 
	 * Uso actual:
	 * - No usado (preparado para mejoras de agilidad o velocidad).
	 * 
	 * @param p personaje al que aumentar velocidad
	 * @param cantidad cantidad de puntos a sumar
	 */
	public static void aumentarAgilidad(Personaje p, short cantidad) {
		p.setVelocidad((short) (p.getVelocidad() + cantidad));
	}
	/**
	 * Método estático para reducir la fuerza del personaje.
	 * 
	 * FUNCIONAMIENTO:
	 * - Resta la cantidad indicada al valor actual de fuerza.
	 * - No valida límites inferiores (puede quedar negativo si no se controla).
	 * 
	 * Uso actual:
	 * - No usado (preparado para penalizaciones o efectos de combate).
	 * 
	 * @param p personaje al que reducir fuerza
	 * @param cantidad cantidad de puntos a restar
	 */
	public static void reducirFuerza(Personaje p, short cantidad) {
		p.setFuerza((short) (p.getFuerza() - cantidad));
	}
	/**
	 * Método estático para reducir la resistencia del personaje.
	 * 
	 * FUNCIONAMIENTO:
	 * - Resta la cantidad indicada al valor actual de resistencia.
	 * 
	 * Uso actual:
	 * - No usado (preparado para daño o efectos).
	 * 
	 * @param p personaje al que reducir resistencia
	 * @param cantidad cantidad de puntos a restar
	 */
	public static void reducirResistencia(Personaje p, short cantidad) {
		p.setResistencia((short) (p.getResistencia() - cantidad));
	}
	/**
	 * Método estático para reducir la velocidad del personaje.
	 * 
	 * FUNCIONAMIENTO:
	 * - Resta la cantidad indicada al valor actual de velocidad.
	 * 
	 * Uso actual:
	 * - No usado (preparado para ralentizaciones o efectos).
	 * 
	 * @param p personaje al que reducir velocidad
	 * @param cantidad cantidad de puntos a restar
	 */
	public static void reducirAgilidad(Personaje p, short cantidad) {
		p.setVelocidad((short) (p.getVelocidad() - cantidad));
	}
	/**
	 * Método estático que muestra los atributos actuales del personaje.
	 * 
	 * FUNCIONAMIENTO:
	 * - Llama directamente al método mostrar() del personaje.
	 * 
	 * Uso actual:
	 * - No usado en el flujo principal (preparado para depuración o menús).
	 * 
	 * @param p personaje cuyos atributos se mostrarán
	 */
	public static void mostrarAtributos(Personaje p) {
		p.mostrar();
	}
	/**
	 * Método estático principal que permite al jugador distribuir 10 puntos entre los tres atributos.
	 * 
	 * FUNCIONAMIENTO DETALLADO:
	 * 1. Inicializa atributos base en 5 (fuerza, resistencia, velocidad) y puntosRestantes = 10.
	 * 2. Muestra estado inicial y opciones disponibles.
	 * 3. Bucle do-while hasta que puntosRestantes < 0 (se fuerza salida con opción 0):
	 *    - Muestra puntos restantes y estado actual.
	 *    - Muestra menú: 0=Empezar, 1=Fuerza, 2=Resistencia, 3=Velocidad, 4=Reiniciar.
	 *    - Lee opción validada (0-4).
	 *    - Si se elige 0 → termina personalización.
	 *    - Si se elige 1,2,3 y hay puntos restantes:
	 *      - Pide cantidad (1 a puntosRestantes).
	 *      - Añade cantidad al atributo elegido.
	 *      - Resta cantidad de puntosRestantes.
	 *    - Si no hay puntos → mensaje de insuficiencia.
	 *    - Opción 4 → reinicia todo a base (5,5,5 y 10 puntos).
	 * 4. Al terminar bucle: crea Personaje con valores finales.
	 * 5. Asigna característica "Neutral" (hardcodeada).
	 * 6. Devuelve el personaje creado.
	 * 
	 * Uso principal:
	 * - Llamado en ControladorPartida.iniciarNuevaPartida().
	 * - Crea el personaje inicial del jugador con atributos personalizados.
	 * 
	 * @param genero género elegido por el jugador ("hombre", "mujer", "desconocido")
	 * @param nombrePersonaje nombre del personaje
	 * @return Personaje creado con atributos distribuidos y valores válidos
	 */
	public static Personaje asignarPuntos(String genero, String nombrePersonaje) {
		// Característica principal eliminada por completo

		// Valores base iniciales (todos empiezan en 5)
		short fuerza = 5;
		short resistencia = 5;
		short velocidad = 5;
		short puntosRestantes = 10;
		short stat = 1;// Opción del menú (1=fuerza, 2=resistencia, 3=velocidad, 0=empezar, 4=reiniciar)
		short cantidad = 0;// Cantidad de puntos a gastar en un atributo

		System.out.println("\nAtributos base: Fuerza=5, Resistencia=5, Velocidad=5");
		System.out.println("Tienes 10 puntos para distribuir.");

		do {
			// Muestra estado actual en cada iteración
			System.out.println("\nPuntos restantes: " + puntosRestantes);
			System.out.println("Estadisticas Actuales: Fuerza: " + fuerza + ", Resistencia: " + resistencia
					+ ", Velocidad: " + velocidad + "\n");
			// Menú de opciones
			System.out
			.println("0. Empezar\n" + "1. Fuerza\n" + "2. Resistencia\n" + "3. Velocidad\n" + "4. Reiniciar\n");
			// Si quedan puntos (o no) lee opción válida entre 0 y 4
			if (puntosRestantes >= 0) {
				stat = Validaciones.obtenerOpcionValida("Selecciona un atributo a modificar: ", (short) 0, (short) 4);
				// Solo pide cantidad si se eligió un atributo (1,2,3) y quedan puntos
				if (stat != 4 && stat != 0 && puntosRestantes != 0 && puntosRestantes > 0) {
					cantidad = Validaciones.obtenerOpcionValida("¿Cuántos puntos gastar (1-" + puntosRestantes + ")? ",
							(short) 1, puntosRestantes);
				}
			}
			// Procesamiento según opción elegida
			switch (stat) {
			case 0:// Empezar → termina personalización
				puntosRestantes = -1;// Fuerza salida del bucle
				System.out.println("Ha finalizado la personalizacion de las estadisticas");
				break;
			case 1:// Fuerza
				if (puntosRestantes > 0) {
					fuerza += cantidad;
					puntosRestantes -= cantidad;
				} else {
					System.out.println("Puntos insuficientes");
				}
				break;
			case 2:// Resistencia
				if (puntosRestantes > 0) {
					resistencia += cantidad;
					puntosRestantes -= cantidad;
				} else {
					System.out.println("Puntos insuficientes");
				}
				break;
			case 3:// Velocidad
				if (puntosRestantes > 0) {
					velocidad += cantidad;
					puntosRestantes -= cantidad;
				} else {
					System.out.println("Puntos insuficientes");
				}
				break;
			case 4:// Reiniciar → vuelve a valores base
				fuerza = 5;
				resistencia = 5;
				velocidad = 5;
				puntosRestantes = 10;
				break;
			default:
				System.out.println("¡Opción invalida! intente de nuevo");
				break;
			}
		} while (puntosRestantes >= 0);
		// Crea el personaje con valores finales
		Personaje heroe = new Personaje(nombrePersonaje, genero, fuerza, resistencia, velocidad);
		// Característica hardcodeada (eliminada la personalización dinámica)
		heroe.setCaracteristica("Neutral");
		return heroe;
	}
}