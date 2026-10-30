/**
 * Clase que representa una partida individual completa jugada por un usuario.
 * Hereda de EntidadJuego → obtiene ID automático y nombre (aunque no se usa nombre en Partida).
 * 
 * RESPONSABILIDADES PRINCIPALES:
 * - Asociar un usuario y un personaje a esta partida.
 * - Contar turnos transcurridos.
 * - Registrar cada decisión/acción tomada por el jugador (lista de strings).
 * - Almacenar resultado final (GANASTE / PERDISTE mediante enum EstadoJuego).
 * - Calcular y devolver puntuación final (Partida.getPuntuacion()).
 * 
 * Se instancia:
 * - En ControladorPartida.iniciarNuevaPartida() → una vez por partida.
 * - Se usa como partidaActual (static en Juego) durante todo el juego.
 * - Se guarda en la lista de partidas del usuario al finalizar (Juego.jugarPartida).
 * 
 * Cumple requisitos mínimos:
 * - Herencia de clase padre (EntidadJuego).
 * - Gestión de partidas y puntuaciones.
 * - Uso de lista distinta (ArrayList para acciones).
 * - Al menos 2 constructores sobrecargados (en realidad 3).
 * 
 * Relación con otras clases:
 * - 1 Partida → 1 Usuario (dueño).
 * - 1 Partida → 1 Personaje (controlado por el jugador).
 * - 1 Partida → * String (acciones registradas).
 * - 1 Partida → 1 EstadoJuego (resultado).
 * - Genera 1 Puntuacion al finalizar.
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

public class Partida extends EntidadJuego {

	/**
	 * Referencia al usuario que está jugando esta partida.
	 * Permite asociar la partida al jugador real y guardarla en su historial.
	 */
	private Usuario usuario;

	/**
	 * Número total de turnos transcurridos en la partida.
	 * Se incrementa en 1 después de cada decisión válida (Juego.jugarPartida).
	 * Base para cálculo de puntuación (10 puntos por turno).
	 */
	private Integer turnos;

	/**
	 * Resultado final de la partida.
	 * Asignado al llegar a un final:
	 * - EstadoJuego.GANASTE (ej: final_demo)
	 * - EstadoJuego.PERDISTE (ej: final_perdido, null)
	 */
	private EstadoJuego resultado;

	/**
	 * Lista de acciones/decisiones tomadas por el jugador.
	 * - Tipo: ArrayList<String> → elegido porque se añaden secuencialmente al final (add) y se recorren linealmente.
	 * - Cada string es el texto de la opción elegida (ej: "Acercarse al río").
	 * - Se usa para mostrar resumen y cumplir requisito de "gestión de partidas".
	 */
	private List<String> acciones;

	/**
	 * Referencia al personaje creado para esta partida.
	 * Se asigna en ControladorPartida.iniciarNuevaPartida().
	 * Se muestra después de cada escena y se modifica en combate.
	 */
	private Personaje personaje;

	/**
	 * Constructor por defecto (sin parámetros).
	 * 
	 * Uso:
	 * - Serialización futura.
	 * - Inicializaciones genéricas o de prueba.
	 * 
	 * Inicializa turnos en 0 y lista de acciones vacía.
	 */
	public Partida() {
		super();// Llama constructor de EntidadJuego → genera ID automático
		this.turnos = 0;
		this.acciones = new ArrayList<>();
	}
	/**
	 * Constructor parcial (solo con usuario).
	 * 
	 * Uso:
	 * - Casos donde se crea partida antes de tener personaje definido.
	 * - Tests o inicializaciones parciales.
	 * 
	 * @param usuario jugador que inicia esta partida
	 */
	public Partida(Usuario usuario) {
		super();
		this.usuario = usuario;
		this.turnos = 0;
		this.acciones = new ArrayList<>();
	}
	/**
	 * Constructor completo (el más utilizado).
	 * 
	 * Uso principal:
	 * - Creación en ControladorPartida.iniciarNuevaPartida().
	 * - Asocia usuario y personaje al iniciar partida.
	 * 
	 * @param usuario jugador actual
	 * @param personaje personaje creado tras distribución de puntos
	 */
	public Partida(Usuario usuario, Personaje personaje) {
		super();
		this.usuario = usuario;
		this.personaje = personaje;
		this.turnos = 0;
		this.acciones = new ArrayList<>();
	}
	/**
	 * Registra una acción/decisión tomada por el jugador.
	 * 
	 * FUNCIONAMIENTO:
	 * - Comprueba que la acción no sea null ni esté vacía (trim()).
	 * - Añade el texto limpio a la lista de acciones.
	 * 
	 * Uso:
	 * - Llamado en Juego.jugarPartida() después de cada elección válida.
	 * - Permite mostrar resumen de decisiones al finalizar.
	 * 
	 * @param accion texto de la opción elegida (ej: "Huir hacia la oscuridad")
	 */
	public void registrarAcciones(String accion) {
		if (accion != null && !accion.trim().isEmpty()) {
			acciones.add(accion.trim());
		}
	}

	/**
	 * Incrementa en 1 el contador de turnos.
	 * 
	 * Uso:
	 * - Llamado en Juego.jugarPartida() después de cada decisión.
	 * - Base para cálculo de puntuación (10 puntos por turno).
	 */
	public void incrementarTurno() {
		turnos++;
	}
	/**
	 * Calcula la puntuación final de esta partida.
	 * 
	 * FÓRMULA:
	 * - Base: 10 puntos por cada turno sobrevivido.
	 * - Bono: +300 si resultado = GANASTE.
	 * 
	 * Devuelve objeto Puntuacion con:
	 * - Usuario asociado.
	 * - Puntos totales.
	 * - Comentario descriptivo (victoria o derrota).
	 * 
	 * Uso:
	 * - Llamado en Juego.jugarPartida() al finalizar.
	 * - Mostrado en consola y usado en Vista para ranking.
	 * 
	 * @return Puntuacion con puntos y comentario calculados
	 */
	public Puntuacion getPuntuacion() {
		short puntosBase = (short) (turnos * 10);
		short bonoVictoria = (short) ((resultado == EstadoJuego.GANASTE) ? 300 : 0);
		short puntosTotales = (short) (puntosBase + bonoVictoria);

		String comentario = (resultado == EstadoJuego.GANASTE)
				? "¡Victoria! Has escapado del limbo con éxito."
						: "Derrota en el limbo.";

		return new Puntuacion(usuario, puntosTotales, comentario);
	}

	// Getters y Setters

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getTurnos() {
		return turnos;
	}

	public void setTurnos(Integer turnos) {
		this.turnos = turnos;
	}

	public EstadoJuego getResultado() {
		return resultado;
	}

	public void setResultado(EstadoJuego resultado) {
		this.resultado = resultado;
	}

	public List<String> getAcciones() {
		return acciones;
	}

	public void setAcciones(List<String> acciones) {
		this.acciones = acciones;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}
}