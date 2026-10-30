/**
 * Clase que representa una escena individual dentro de la narrativa del juego.
 * 
 * RESPONSABILIDADES PRINCIPALES:
 * - Almacenar la descripción narrativa que se muestra al jugador (texto principal de la escena).
 * - Mantener una lista de opciones/respuestas posibles que el jugador puede elegir (menus).
 * 
 * Se instancia:
 * - En ControladorEscena.inicializarEscenas() para cada escena leída del JSON.
 * - Se guarda en el mapa de escenas de Juego (clave = ID de escena).
 * 
 * Cumple requisitos indirectos:
 * - Relación 1:N con Respuestas (lista Vector para menus).
 * - Uso de lista distinta (Vector en este caso).
 * - Parte clave de la gestión de escenas y flujo narrativo.
 * 
 * Relación con otras clases:
 * - 1 Escena → * Respuestas (lista menus).
 * - Usada en Juego.jugarPartida() para:
 *   - Obtener descripción y personalizarla con género.
 *   - Mostrar opciones y obtener clave de la elegida.
 *   - Avanzar a la siguiente escena según clave.
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package modelo;

import java.util.Vector;
import java.util.List;

public class Escena extends EntidadJuego {
	/**
	 * Descripción narrativa principal de la escena.
	 * - Se muestra con efecto typewriter en Juego.jugarPartida().
	 * - Se personaliza con Utilidades.cambiarGenero() según género del personaje.
	 * - Procede del JSON (campo "TEXTO" de cada escena).
	 */
	private String descripcion;
	/**
	 * Lista de opciones/respuestas disponibles en esta escena.
	 * - Tipo: Vector<Respuestas> → elegido porque es sincronizado y seguro para acceso concurrente (aunque en este proyecto no hay hilos, es buena práctica).
	 * - Cada Respuestas contiene texto visible y clave de siguiente escena.
	 * - Inicializada en constructor como Vector vacío.
	 */
	private List<Respuestas> menus = new Vector<>();
	/**
	 * Constructor por defecto (sin parámetros).
	 * 
	 * Uso:
	 * - Serialización futura.
	 * - Inicializaciones genéricas o de prueba.
	 * 
	 * Inicializa:
	 * - descripcion = null (se asigna después).
	 * - menus = Vector vacío.
	 */
	public Escena() {
		super();
		this.menus = new Vector<>();
	}
	/**
	 * Constructor completo (el más utilizado).
	 * 
	 * Uso principal:
	 * - En ControladorEscena.inicializarEscenas() al leer cada escena del JSON.
	 * - Crea la Escena directamente con su descripción.
	 * 
	 * @param nombre nombre de la escena (no usado en lógica, solo para referencia)
	 * @param descripcion texto narrativo que se muestra al jugador
	 */
	public Escena(String nombre, String descripcion) {
		super(nombre);
		this.descripcion = descripcion;
		this.menus = new Vector<>();// Inicializa lista vacía de opciones
	}

	public Escena(String nombre) {
		super(nombre);
		this.menus = new Vector<>();
	}


	// Getters y Setters
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Respuestas> getMenus() {
		return menus;
	}

	public void setMenus(List<Respuestas> menus) {
		this.menus = menus;
	}
}