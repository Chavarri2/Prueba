/**
 * Clase que representa al personaje controlado por el jugador dentro del juego.
 * Hereda de EntidadJuego → obtiene ID automático y nombre.
 * Implementa la interfaz Interactuar → obliga a definir mostrar().
 * 
 * RESPONSABILIDADES PRINCIPALES:
 * - Almacenar datos del personaje: género, característica narrativa y atributos de combate.
 * - Permitir mostrar su estado actual por consola (mostrar()).
 * - Ser modificado durante el combate (atributos cambian temporalmente).
 * 
 * Se instancia:
 * - En ControladorPartida.iniciarNuevaPartida() después de distribuir puntos.
 * - Se asigna a la partida actual (Partida.personaje).
 * - Se pasa a Combatir.batalla() como jugador.
 * 
 * Cumple requisitos mínimos:
 * - Herencia de clase padre (EntidadJuego).
 * - Implementa interfaz Interactuar (junto con Respuestas).
 * - Al menos 2 constructores sobrecargados (en realidad 3).
 * 
 * Relación con otras clases:
 * - 1 Personaje → 1 Partida (atributo en Partida).
 * - Usado en Juego.jugarPartida() para mostrar estado después de cada escena.
 * - Modificado temporalmente en Combatir (guardado/restaurado).
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package modelo;

import visual.Interactuar;

public class Personaje extends EntidadJuego implements Interactuar {
	/**
	 * Género del personaje: "hombre", "mujer" o "desconocido".
	 * Se usa para personalizar textos (Utilidades.cambiarGenero: @ → a/o/e).
	 */
	private String genero;
	/**
	 * Rasgo narrativo o descripción breve (ej: "Valiente pero despistado").
	 * No afecta mecánicas, solo ambientación.
	 */
	private String caracteristica;
	/**
	 * Valor de fuerza (base 5 + puntos distribuidos).
	 * Influye en daño al atacar (Combatir).
	 */
	private short fuerza;
	/**
	 * Valor de resistencia (base 5 + puntos distribuidos).
	 * Representa vida → se reduce al recibir daño.
	 */
	private short resistencia;
	/**
	 * Valor de velocidad (base 5 + puntos distribuidos).
	 * Determina orden de turno en combate (Combatir).
	 */
	private short velocidad;

	/**
	 * Constructor vacío (sin parámetros).
	 * 
	 * Uso:
	 * - Serialización futura.
	 * - Inicializaciones genéricas o de prueba.
	 * 
	 * Inicializa atributos base (valores por defecto razonables).
	 */
	public Personaje() {
		super();// Llama constructor de EntidadJuego → genera ID
		this.genero = "Desconocido";// Valor por defecto neutro
		// Base inicial
		this.fuerza = 5;
		this.resistencia = 5;
		this.velocidad = 5;
	}
	/**
	 * Constructor completo sin característica narrativa.
	 * 
	 * Uso:
	 * - Casos donde no se necesita rasgo descriptivo.
	 * - Simplificación o tests.
	 * 
	 * @param nombre nombre del personaje
	 * @param genero "hombre", "mujer" o "desconocido"
	 * @param fuerza valor inicial de fuerza
	 * @param resistencia valor inicial de resistencia
	 * @param velocidad valor inicial de velocidad
	 */
	public Personaje(String nombre, String genero, short fuerza, short resistencia, short velocidad) {
		super(nombre); // Asigna nombre y genera ID automático
		this.genero = genero;
		this.fuerza = fuerza;
		this.resistencia = resistencia;
		this.velocidad = velocidad;
		// caracteristica queda null (no se usa en mecánicas)
	}
	/**
	 * Constructor completo con todos los atributos.
	 * 
	 * Uso principal:
	 * - Creación del personaje en ControladorPartida → Atributos.asignarPuntos().
	 * 
	 * @param nombre nombre del personaje (asignado en EntidadJuego)
	 * @param genero "hombre", "mujer" o "desconocido" (para personalizar textos)
	 * @param caracteristica rasgo narrativo (solo descriptivo)
	 * @param fuerza valor inicial de fuerza
	 * @param resistencia valor inicial de resistencia (vida)
	 * @param velocidad valor inicial de velocidad (determina turno en combate)
	 */
	public Personaje(String nombre, String genero, String caracteristica, short fuerza, short resistencia,
			short velocidad) {
		super(nombre);// Asigna nombre y genera ID automático
		this.genero = genero;
		this.caracteristica = caracteristica;
		this.fuerza = fuerza;
		this.resistencia = resistencia;
		this.velocidad = velocidad;
	}

	// Getters y Setters

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public short getFuerza() {
		return fuerza;
	}

	public void setFuerza(short fuerza) {
		this.fuerza = fuerza;
	}

	public short getResistencia() {
		return resistencia;
	}

	public void setResistencia(short resistencia) {
		this.resistencia = resistencia;
	}

	public short getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(short velocidad) {
		this.velocidad = velocidad;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	/**
	 * Implementación del método de la interfaz Interactuar.
	 * Muestra por consola toda la información del personaje.
	 *                     
	 * Uso principal:
	 * - En Juego.jugarPartida() después de cada escena (muestra estado actual).
	 * - Permite ver cambios en atributos tras combate o decisiones.
	 * 
	 * Salida típica:
	 * Personaje: [nombre], Género: [genero], Característica: [caracteristica]
	 * Atributos - Fuerza: X, Resistencia: Y, Velocidad: Z
	 */
	@Override
	public void mostrar() {
		System.out.println("Personaje: " + nombre + ", Género: " + genero + ", Característica: " + caracteristica);
		System.out.println(
				"Atributos - Fuerza: " + fuerza + ", Resistencia: " + resistencia + ", Velocidad: " + velocidad);
	}

}
