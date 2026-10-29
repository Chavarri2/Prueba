/**
 * Clase que representa al usuario real (la persona que juega), no al personaje dentro del juego.
 * Hereda de EntidadJuego → obtiene ID automático y nombre base (el nombre real).
 * 
 * RESPONSABILIDADES PRINCIPALES:
 * - Almacenar datos personales básicos: nombre real, nickname y edad.
 * - Mantener un historial completo de todas las partidas jugadas por este usuario (lista 1-N).
 * - Permitir añadir nuevas partidas al finalizar cada sesión de juego.
 * 
 * Se instancia:
 * - Al crear un usuario nuevo (ControladorUsuario.crearNuevoUsuario).
 * - Al seleccionar un usuario existente (ControladorUsuario.seleccionarOcrearUsuario).
 * - Se asigna como usuarioActual en InstanciaJuego para que el resto del juego sepa quién está jugando.
 * 
 * Cumple requisitos mínimos:
 * - Herencia de clase padre (EntidadJuego).
 * - Gestión de partidas y puntuaciones (a través de la lista de Partida).
 * - Al menos 2 constructores sobrecargados (en realidad 3).
 * - Uso de lista distinta (LinkedList para partidas).
 * 
 * Relación con otras clases:
 * - 1 Usuario → * Partida (lista LinkedList).
 * - Usuario es el propietario de las partidas (getPartidas().add(partidaActual) en Juego).
 * - InstanciaJuego mantiene una referencia al usuarioActual de esta clase.
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package modelo;

import java.util.LinkedList;
import java.util.List;

public class Usuario extends EntidadJuego {
	private String nickname;
	private short edad;
	/**
	 * Lista enlazada que almacena todas las partidas completadas por este usuario.
	 * - Tipo: LinkedList<Partida> → elegido porque se añaden partidas secuencialmente al final (add) y se recorren de forma lineal (mostrar historial).
	 * - No se necesita acceso aleatorio ni inserciones en medio → LinkedList es eficiente y cumple requisito de "tipos de listas distintas".
	 * - Inicializada en todos los constructores para evitar NullPointerException.
	 */
	private List<Partida> partidas = new LinkedList<>();

	/**
	 * Constructor por defecto (sin parámetros).
	 * 
	 * Uso:
	 * - Serialización futura (si se guarda usuarios en JSON/XML).
	 * - Inicializaciones genéricas o de prueba.
	 * 
	 * Inicializa:
	 * - ID automático (heredado de super()).
	 * - Lista de partidas vacía.
	 */
	public Usuario() {
		super();// Llama constructor de EntidadJuego → genera ID único
		this.partidas = new LinkedList<>();// Inicializa lista vacía
	}

	/**
	 * Constructor intermedio (solo nombre y nickname).
	 * 
	 * Uso:
	 * - Creación rápida cuando no se pide edad.
	 * - Tests o escenarios donde la edad no es relevante.
	 * 
	 * @param nombre nombre real del usuario (se pasa a super para asignarlo en EntidadJuego)
	 * @param nickname apodo o alias visible en menús y mensajes
	 */
	public Usuario(String nombre, String nickname) {
		super(nombre);// Asigna nombre y genera ID automático
		this.nickname = nickname;
		this.partidas = new LinkedList<>();// Inicializa lista vacía
	}

	/**
	 * Constructor completo (el más utilizado).
	 * 
	 * Uso principal:
	 * - Creación de usuario desde ControladorUsuario.crearNuevoUsuario().
	 * - Se llama después de validar nombre, nickname y edad.
	 * 
	 * @param nombre nombre real (validado previamente)
	 * @param nickname apodo (validado previamente)
	 * @param edad edad del usuario (validada 13-120)
	 */
	public Usuario(String nombre, String nickname, short edad) {
		super(nombre);// Asigna nombre y genera ID automático
		this.nickname = nickname;
		this.edad = edad;
		this.partidas = new LinkedList<>();// Inicializa lista vacía
	}

	// Getters y Setters

	/**
	 * Obtiene el nickname (apodo) del usuario.
	 * 
	 * @return el nickname visible en menús y mensajes
	 */
	public String getNickname() {
		return nickname;
	}
	/**
	 * Establece el nickname.
	 * 
	 * @param nickname nuevo apodo (debe validarse antes de llamar este setter)
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	/**
	 * Obtiene la edad del usuario.
	 * 
	 * @return edad (validada previamente en rango 13-120)
	 */
	public short getEdad() {
		return edad;
	}
	/**
	 * Establece la edad.
	 * 
	 * @param edad nueva edad (debe validarse antes)
	 */
	public void setEdad(short edad) {
		this.edad = edad;
	}
	/**
	 * Obtiene la lista completa de partidas jugadas por este usuario.
	 * 
	 * Uso principal:
	 * - Mostrar historial (Vista.mostrarPartidasAnteriores).
	 * - Añadir nueva partida al finalizar (Juego.jugarPartida: getPartidas().add(partidaActual)).
	 * 
	 * @return lista enlazada de Partida (modificable, se modifica directamente con add())
	 */
	public List<Partida> getPartidas() {
		return partidas;
	}
	/**
	 * Sustituye completamente la lista de partidas.
	 * 
	 * Uso raro: normalmente se añaden partidas una a una con getPartidas().add().
	 * 
	 * @param partidas nueva lista completa de partidas
	 */
	public void setPartidas(List<Partida> partidas) {
		this.partidas = partidas;
	}
}