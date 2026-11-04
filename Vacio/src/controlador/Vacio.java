/**
 * Clase principal y punto de entrada único del proyecto "Vacío".
 * 
 * RESPONSABILIDAD ÚNICA:
 * - Arrancar toda la aplicación mediante el método main().
 * - Inicializar la música de fondo.
 * - Crear la instancia central del juego (InstanciaJuego).
 * - Instanciar el controlador principal (Juego).
 * - Instanciar la capa de visualización por consola (Vista).
 * - Lanzar el menú principal interactivo (Menu.menu()).
 * 
 * No se instancia esta clase → solo se ejecuta el método main estático al lanzar el programa.
 * Es el único lugar donde se inicia la música y se crean los objetos raíz del sistema.
 * 
 * Cumple requisito mínimo explícito:
 * - "Habrá una clase principal en la que se deberá implementar al menos una clase de las creadas".
 * - Contiene el main y crea/inicia las clases principales.
 * 
 * Relación con otras clases:
 * - Crea InstanciaJuego → contenedor global (usuario + JSON).
 * - Crea Juego → controlador principal del flujo.
 * - Crea Vista → presentación por consola.
 * - Llama a Menu.menu() → bucle principal del programa.
 * - Inicia música mediante Musica.reproducir().
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-01-31
 */
package controlador;

import java.util.HashMap;
import modelo.InstanciaJuego;
import utils.Musica;
import visual.Vista;

/**
 * Punto de entrada principal de la aplicación.
 * 
 * FUNCIONAMIENTO DETALLADO:
 * 1. Define variable play = 1 (bandera para indicar que la música empieza encendida).
 * 2. Llama a Musica.reproducir() → inicia música ambiental en bucle infinito desde recursos.
 * 3. Crea InstanciaJuego → contenedor global que almacenará:
 *    - usuarioActual (inicialmente null).
 *    - texto (JsonNode de Script.json, se carga después).
 * 4. Crea objeto Juego → controlador principal del flujo del juego.
 *    - Recibe instancia y mapa vacío de escenas (se llenará después).
 * 5. Crea objeto Vista → capa de presentación por consola.
 *    - Recibe instancia para acceder a usuario y JSON.
 * 6. Llama a Menu.menu() → inicia el bucle principal del menú.
 *    - Pasa play (estado música), instancia, vista y juego.
 * 
 * @param args argumentos de línea de comandos (no utilizados en este proyecto)
 */
public class Vacio{
	public static void main(String[] args) {
		byte play = 1;// Bandera inicial: música reproduciéndose (1 = on)

		Musica.reproducir();// Inicia música ambiental en bucle infinito desde recursos

		// Creación de la instancia global que contiene:
	    // - Usuario actual (null al inicio)
	    // - JsonNode con todo el contenido narrativo (Script.json) → se carga después
		InstanciaJuego instancia = new InstanciaJuego();

		// Instancia del controlador principal del juego
	    // Recibe la instancia global y un mapa vacío de escenas (se llenará en playJuego)
		Juego juego = new Juego(instancia, new HashMap<>());

		// Capa de visualización por consola
	    // Recibe la instancia para acceder a datos como usuario y JSON
		Vista mostrar = new Vista(instancia);

		// Lanza el menú principal (bucle infinito hasta salir)
	    // Pasa estado de música, instancia global, vista y controlador principal
		Menu.menu(play, instancia, mostrar, juego);
	}
}