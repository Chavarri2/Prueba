/**
 * Controlador exclusivo de la creación del personaje y la partida inicial.
 * 
 * RESPONSABILIDAD ÚNICA:
 * - Solicitar nombre y género del personaje con validación.
 * - Permitir al jugador distribuir 10 puntos entre fuerza, resistencia y velocidad.
 * - Crear el objeto Personaje con los valores finales elegidos.
 * - Instanciar la Partida asociando el usuario actual y el personaje creado.
 * 
 * Se utiliza:
 * - Llamado una sola vez por partida desde Juego.playJuego().
 * - No tiene estado interno → todos los métodos son estáticos.
 * 
 * Cumple requisito indirecto:
 * - Gestión de partidas (creación de Partida).
 * - Interacción con usuario para atributos (encapsulada).
 * - Uso de Validaciones para entradas seguras.
 * 
 * Relación con otras clases:
 * - Llamado desde Juego.playJuego().
 * - Usa Atributos.asignarPuntos() para distribución.
 * - Usa Validaciones y LeerScanner para lectura de entradas.
 * - Crea Personaje y Partida.
 * - Asocia Partida al usuario actual (InstanciaJuego).
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package controlador;

import modelo.Atributos;
import modelo.InstanciaJuego;
import modelo.Partida;
import modelo.Personaje;
import utils.LeerScanner;

public class ControladorPartida {
	/**
	 * Método principal y único: inicia la creación de una nueva partida.
	 * 
	 * FUNCIONAMIENTO DETALLADO:
	 * 1. Muestra encabezado de creación de personaje.
	 * 2. Lee nombre del personaje (sin validación estricta en esta versión → podría mejorarse).
	 * 3. Lee género con validación estricta (bucle hasta que sea "hombre", "mujer" o "desconocido").
	 * 4. Llama a Atributos.asignarPuntos() para distribuir 10 puntos entre atributos.
	 * 5. Crea objeto Personaje con nombre, género y atributos finales.
	 * 6. Instancia nueva Partida asociando usuario actual (de InstanciaJuego) y personaje.
	 * 7. Muestra mensaje de inicio y estado inicial del personaje.
	 * 8. Devuelve la Partida creada (se asigna como partidaActual en Juego).
	 * 
	 * Uso principal:
	 * - Llamado desde Juego.playJuego() después de seleccionar/crear usuario.
	 * 
	 * @param instancia contenedor global (necesario para obtener usuarioActual)
	 * @return la Partida recién creada (la que se usará en todo el juego)
	 */
	public static Partida iniciarNuevaPartida(InstanciaJuego instancia) { 
		System.out.println("\n--- Creación de personaje ---"); 

		// Lectura del nombre del personaje (sin validación estricta en esta versión)
		String nombrePersonaje = LeerScanner.leerString("Nombre del personaje: "); 

		// Validación estricta de género (bucle infinito hasta que sea correcto)
		String genero = null; 
		while (true) { 
			genero = LeerScanner.leerString("Género (Hombre / Mujer / Desconocido): ").trim().toLowerCase(); 
			if (genero.equals("hombre") || genero.equals("mujer") || genero.equals("desconocido")) { 
				break; // Género válido → sale del bucle
			} 
			System.out.println("Género no válido. Solo se permite: Hombre, Mujer o Desconocido."); 
		} 
		// Distribución de 10 puntos entre atributos (fuerza, resistencia, velocidad)
		// Llama a Atributos.asignarPuntos() → método estático que maneja interacción
		Personaje heroe = Atributos.asignarPuntos(genero, nombrePersonaje); 

		// Creación de la partida: asocia usuario actual + personaje
		Partida partida = new Partida(instancia.getUsuarioActual(), heroe); 

		// Mensaje de confirmación y muestra inicial del personaje
		System.out.println("\nPartida iniciada. Prepárate para entrar al Limbo...\n"); 
		heroe.mostrar(); // Muestra atributos finales del personaje
		return partida; // Devuelve la partida creada (se asigna como partidaActual en Juego)
	}

}
