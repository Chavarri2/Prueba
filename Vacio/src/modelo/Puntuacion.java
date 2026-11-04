/**
 * Clase que representa la puntuación obtenida al finalizar una partida.
 * 
 * RESPONSABILIDADES PRINCIPALES:
 * - Almacenar la referencia al usuario que jugó la partida.
 * - Guardar la cantidad de puntos calculados.
 * - Almacenar un comentario descriptivo (ej: victoria o derrota).

 * Se instancia:
 * - En Partida.getPuntuacion() al finalizar cada partida.
 * - Se muestra en consola al terminar el juego (Juego.jugarPartida).
 * - Se usa para mostrar ranking y máximo histórico (Vista.mostrarPuntuaciones).
 * 
 * Cumple requisito indirecto:
 * - Gestión de puntuaciones (parte de la gestión de partidas y usuarios).
 * - Objeto simple que encapsula resultado final y se asocia a Usuario.
 * 
 * Relación con otras clases:
 * - 1 Puntuacion → 1 Usuario (referencia).
 * - Creada por Partida (Partida.getPuntuacion()).
 * - Usada en Vista para mostrar historial y máximo.
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package modelo;

public class Puntuacion {
	/**
	 * Referencia al usuario que realizó la partida.
	 * Permite asociar la puntuación al jugador concreto.
	 */
	private Usuario usuario;

	/**
	 * Puntos totales obtenidos en la partida.
	 * Calculados en Partida.getPuntuacion():
	 * - Base: 10 puntos por cada turno.
	 * - Bono: +300 si resultado = GANASTE.
	 */
	private Short puntos;

	/**
	 * Comentario descriptivo asociado a la puntuación.
	 * Ejemplos:
	 * - "¡Victoria! Has escapado del limbo con éxito."
	 * - "Derrota en el limbo."
	 * Se genera automáticamente en Partida.getPuntuacion().
	 */
	private String comentario;

	/**
	 * Constructor por defecto (sin parámetros).
	 * 
	 * Uso:
	 * - Serialización futura (si se guarda puntuaciones en JSON/XML).
	 * - Inicializaciones genéricas o de prueba.
	 * 
	 * Deja todos los atributos en null/0.
	 */
	public Puntuacion() {
		// Constructor vacío → permite crear objeto y setear valores después
	}

	/**
	 * Constructor intermedio (usuario + puntos).
	 * 
	 * Uso:
	 * - Creación rápida cuando no se necesita comentario.
	 * - Tests o casos donde el comentario se añade después.
	 * 
	 * @param usuario jugador que obtuvo esta puntuación
	 * @param puntos cantidad de puntos calculada
	 */
	public Puntuacion(Usuario usuario, Short puntos) {
		this.usuario = usuario;
		this.puntos = puntos;
		// comentario queda null (se puede setear después si se necesita)
	}
	/**
	 * Constructor completo (el más utilizado).
	 * 
	 * Uso principal:
	 * - Creado automáticamente en Partida.getPuntuacion().
	 * - Se genera al finalizar cada partida con todos los datos.
	 * 
	 * @param usuario jugador que realizó la partida
	 * @param puntos puntos totales calculados
	 * @param comentario texto descriptivo (victoria/derrota)
	 */
	public Puntuacion(Usuario usuario, Short puntos, String comentario) {
		this.usuario = usuario;
		this.puntos = puntos;
		this.comentario = comentario;
	}

	// Getters y Setters
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Short getPuntos() {
		return puntos;
	}

	public void setPuntos(Short puntos) {
		this.puntos = puntos;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}