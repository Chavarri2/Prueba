/**
 * Clase responsable de TODA la presentación por consola del juego.
 * 
 * RESPONSABILIDAD ÚNICA (SRP):
 * - Mostrar títulos ASCII y menús principales desde el JSON.
 * - Mostrar historial de partidas anteriores del usuario actual.
 * - Mostrar puntuaciones (todas las partidas + máximo histórico).
 * 
 * Se instancia una única vez desde Vacio.main() y se pasa al menú.
 * Recibe InstanciaJuego para acceder al usuario actual y al JSON cargado.
 * Usa Utilidades.jsonToList() para convertir nodos JSON en listas de strings.
 * 
 * No contiene lógica de juego → solo salida formateada por consola.
 * Cumple requisito de separar presentación (visual) de lógica (controlador/modelo).
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package visual;

import java.util.List;

import modelo.InstanciaJuego;
import modelo.Partida;
import modelo.Puntuacion;
import utils.Utilidades;

public class Vista{
	// Atributo privado
	private final InstanciaJuego instancia; // Referencia a la instancia global (no se modifica)
	/**
	 * Constructor único de la clase.
	 * Recibe la instancia global para acceder a usuarioActual y al JSON.
	 * No hace nada más que guardar la referencia.
	 * 
	 * @param instancia contenedor global del juego (usuario + JSON)
	 */
	public Vista(InstanciaJuego instancia) {
		this.instancia=instancia;
	}
	/**
	 * Muestra las puntuaciones de todas las partidas del usuario actual.
	 * 
	 * FUNCIONAMIENTO DETALLADO:
	 * 1. Obtiene la lista de partidas del usuario actual.
	 * 2. Si está vacía → mensaje informativo.
	 * 3. Para cada partida:
	 *    - Calcula su puntuación (Partida.getPuntuacion()).
	 *    - Muestra ID de partida, puntos y comentario.
	 * 4. Calcula y muestra la puntuación máxima y su partida asociada.
	 * 
	 * Se llama desde el menú principal (opción 3).
	 */
	public void mostrarPuntuaciones() {
		List<Partida> partidas = instancia.getUsuarioActual().getPartidas();
		if (partidas.isEmpty()) {
			System.out.println("\nNo hay puntuaciones registradas.");
			return;
		}

		System.out.println("\nPuntuaciones (" + partidas.size() + " partidas jugadas):");
		short maxPuntos = (short) Integer.MIN_VALUE;
		Partida partidaMax = null;

		for (Partida p : partidas) {
			Puntuacion punt = p.getPuntuacion();
			System.out.printf("Partida ID: %d | Puntos: %d | %s%n",
					p.getId(), punt.getPuntos(), punt.getComentario());

			if (punt.getPuntos() > maxPuntos) {
				maxPuntos = punt.getPuntos();
				partidaMax = p;
			}
		}

		if (partidaMax != null) {
			System.out.println("\nPuntuación máxima: " + maxPuntos + " en Partida ID: " + partidaMax.getId());
		}
	}
	/**
	 * Muestra el historial completo de partidas del usuario actual.
	 * 
	 * FUNCIONAMIENTO:
	 * 1. Obtiene lista de partidas.
	 * 2. Si vacía → mensaje.
	 * 3. Para cada partida muestra:
	 *    - Número de orden
	 *    - ID
	 *    - Turnos jugados
	 *    - Resultado (GANASTE / PERDISTE)
	 * 
	 * Se llama desde menú (opción 2).
	 */
	public void mostrarPartidasAnteriores() {
		List<Partida> partidas = instancia.getUsuarioActual().getPartidas();
		if (partidas.isEmpty()) {
			System.out.println("\nNo hay partidas anteriores.");
			return;
		}

		System.out.println("\nPartidas anteriores (" + partidas.size() + " en total):");
		for (short i = 0; i < partidas.size(); i++) {
			Partida p = partidas.get(i);
			System.out.printf("%d. ID: %d | Turnos: %d | Resultado: %s%n",
					i + 1, p.getId(), p.getTurnos(), p.getResultado());
		}
	}
	/**
	 * Muestra el menú principal del juego (opciones 1 a 6).
	 * 
	 * FUNCIONAMIENTO:
	 * - Obtiene nodo "MENU" del JSON (sección MENUS).
	 * - Convierte a lista de strings con Utilidades.jsonToList().
	 * - Imprime cada línea.
	 * 
	 * Se llama en cada iteración del bucle de menú.
	 */
	public void mostrarMenuPrincipal() {
		List<String> menu = Utilidades.jsonToList( instancia.getTexto().path("MENUS").path("MENU"));
		for(String texto: menu){
			System.out.println(texto);
		}
	}
	/**
	 * Muestra el título principal del juego (ASCII art o texto grande).
	 * 
	 * FUNCIONAMIENTO:
	 * - Obtiene nodo "INICIO" del JSON (sección MENUS).
	 * - Convierte a lista y lo imprime línea por línea.
	 * 
	 * Se llama solo una vez al entrar al menú.
	 */
	public void mostrarTituloPrincipal() {
		List<String> menu = Utilidades.jsonToList( instancia.getTexto().path("MENUS").path("INICIO"));
		for(String texto: menu){
			System.out.println(texto);
		}

	}
}
