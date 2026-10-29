/**
 * Clase que gestiona el menú principal del juego y el bucle de interacción inicial.
 * 
 * RESPONSABILIDADES PRINCIPALES:
 * - Mostrar el título inicial (ASCII art desde JSON).
 * - Cargar escenas de forma preventiva (para que estén listas aunque no se inicie partida).
 * - Mostrar el menú principal con opciones (1-6) cargadas desde JSON.
 * - Permitir al usuario:
 *   - Iniciar nueva partida (llama a Juego.playJuego).
 *   - Ver partidas anteriores (historial).
 *   - Ver puntuaciones.
 *   - Pausar/reproducir música.
 *   - Salir del juego.
 * - Controlar el estado de la música (play = 1 encendida, 0 pausada).
 * 
 * Patrón singleton:
 * - Constructor privado → impide instanciación externa.
 * - Todos los métodos son estáticos → se llama directamente: Menu.menu(...).
 * 
 * Cumple requisito indirecto:
 * - Gestión de interfaz de usuario principal.
 * - Uso de JSON para textos de menú (escalabilidad).
 * - Control de multimedia (música).
 * 
 * Relación con otras clases:
 * - Llamada desde Vacio.main() → punto de entrada.
 * - Recibe InstanciaJuego (usuario y JSON), Vista (presentación), Juego (controlador de partida).
 * - Llama a ControladorUsuario (seleccionar/crear usuario).
 * - Llama a Juego.playJuego() para iniciar partida.
 * - Llama a Vista para mostrar menús, historial y puntuaciones.
 * - Controla Musica (pausar/reproducir).
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package controlador;

import modelo.InstanciaJuego;
import utils.Musica;
import utils.Validaciones;
import visual.Vista;

public class Menu {
	/**
	 * Constructor privado → impide instanciación externa (patrón singleton).
	 * 
	 * Uso:
	 * - Todos los métodos son estáticos → no se necesita crear objeto.
	 */
	private Menu() {
		// Constructor privado vacío → clase utilitaria estática
	}  
	/**
	 * Bucle principal del menú.
	 * Se ejecuta hasta que el usuario elija salir (opción 6).
	 * 
	 * FUNCIONAMIENTO DETALLADO:
	 * 1. Muestra título inicial (ASCII art desde JSON) usando Vista.
	 * 2. Precarga todas las escenas (ControladorEscena.inicializarEscenas) para que estén listas.
	 * 3. Si no hay usuario actual → pide seleccionar o crear uno (ControladorUsuario).
	 * 4. Bucle infinito while(true):
	 *    - Muestra menú principal (Vista.mostrarMenuPrincipal).
	 *    - Lee opción validada (1-6) con Validaciones.
	 *    - Switch según opción:
	 *      - 1: Inicia partida (Juego.playJuego).
	 *      - 2: Muestra historial de partidas (Vista).
	 *      - 3: Muestra puntuaciones (Vista).
	 *      - 4: Pausa música si está encendida (play=1 → Musica.pausar, play=0).
	 *      - 5: Reproduce música si está pausada (play=0 → Musica.reproducir, play=1).
	 *      - 6: Sale del bucle → termina programa con mensaje de despedida.
	 * 5. Captura cualquier excepción grave y muestra mensaje (no crashea sin control).
	 * 
	 * @param play estado inicial de música (1 = encendida, 0 = pausada)
	 * @param instancia contenedor global (usuario y JSON)
	 * @param mostrar capa de visualización por consola
	 * @param juego controlador principal del flujo del juego
	 */
	public static void menu(byte play, InstanciaJuego instancia, Vista mostrar, Juego juego) {
		try {
			// Muestra título inicial (ASCII art desde JSON)
			mostrar.mostrarTituloPrincipal();
			// Precarga escenas (se hace aquí para que estén listas aunque no se juegue aún)
			ControladorEscena.inicializarEscenas(instancia, juego.getEscenas());

			// Solo pide usuario la primera vez que se entra al menú
			if (instancia.getUsuarioActual() == null) {
				ControladorUsuario.seleccionarOcrearUsuario(instancia, juego.getUsuarios());
			}

			while (true) {
				mostrar.mostrarMenuPrincipal();// Muestra opciones 1-6 desde JSON
				short opcion = Validaciones.obtenerOpcionValida("Elige una opción: ", (short) 1, (short) 6);

				switch (opcion) {
				case 1:
					juego.playJuego(instancia);// Inicia partida completa
					break;
				case 2:
					mostrar.mostrarPartidasAnteriores();// Historial de partidas del usuario actual
					break;
				case 3:
					mostrar.mostrarPuntuaciones();// Puntuaciones y máximo
					break;
				case 4:
					if(play==1) {
						Musica.pausar();
						play=0;
					}else {
						System.out.println("La musica ya esta pausada");
					}
					break;
				case 5:
					if(play==0) {
						Musica.reproducir();
						play=1;
					}else {
						System.out.println("\nLa musica ya se esta reproduciendo\n");
					}
					break;
				case 6:
					System.out.println("\n¡Gracias por jugar a Vacío!");
					System.out.println("Hasta la próxima...");
					return;// Sale del bucle → termina programa
				default:
					System.out.println("Opción no reconocida.");
				}
			}

		} catch (Exception e) {
			System.out.println("Error grave en la ejecución del juego: " + e.getMessage());
		}
	}
}
