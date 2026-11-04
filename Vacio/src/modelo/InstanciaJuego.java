/**
 * Clase que actúa como contenedor central y global de datos durante toda la ejecución del juego.
 * 
 * RESPONSABILIDADES PRINCIPALES:
 * - Mantener una referencia única y actualizada al usuario que está jugando en este momento (usuarioActual).
 * - Almacenar el nodo raíz del archivo JSON cargado (Script.json) para que TODAS las partes del programa accedan al mismo contenido narrativo sin duplicar lecturas.
 * 
 * FUNCIONAMIENTO GENERAL:
 * - Se instancia UNA SOLA VEZ en Vacio.main() al arrancar el programa.
 * - Se pasa como parámetro a casi todas las clases importantes: Juego, Menu, Vista, ControladorUsuario, ControladorPartida, ControladorEscena.
 * - Funciona como "puente" o "contexto global" para evitar pasar múltiples parámetros en cada llamada y para centralizar datos compartidos.
 * 
 * Cumple requisito indirecto:
 * - Centraliza datos globales de forma limpia y controlada (mejor práctica de diseño).
 * - Evita variables estáticas globales (más seguro y mantenible).
 * 
 * Relación con otras clases:
 * - 1 InstanciaJuego → 1 Usuario (usuarioActual, se asigna en ControladorUsuario).
 * - 1 InstanciaJuego → 1 JsonNode (texto = Script.json cargado una sola vez).
 * - Es pasada como parámetro a:
 *   - Juego (para acceder a usuario y JSON).
 *   - Menu (para mostrar historial y puntuaciones).
 *   - Vista (para mostrar datos del usuario y menús del JSON).
 *   - Todos los controladores (para modificar usuario o leer escenas).
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package modelo;

import com.fasterxml.jackson.databind.JsonNode;

public final class InstanciaJuego {
	/**
	 * Referencia al usuario que está jugando actualmente.
	 * 
	 * Características:
	 * - null al inicio del programa (antes de seleccionar/crear usuario).
	 * - Se asigna en ControladorUsuario.seleccionarOcrearUsuario() o crearNuevoUsuario().
	 * - Nunca cambia durante una partida (solo al reiniciar o cambiar usuario desde menú).
	 * 
	 * Usos principales:
	 * - Guardar partida terminada: usuario.getPartidas().add(partidaActual).
	 * - Mostrar historial y puntuaciones del usuario actual (Vista).
	 * - Obtener datos personales (nombre, nickname) en cualquier momento.
	 */
	private Usuario usuarioActual = null;
	/**
	 * Nodo raíz del archivo Script.json una vez cargado.
	 * 
	 * Características:
	 * - Contiene toda la narrativa del juego: EVENTOS, CAP1, CAP2, OPCIONES, FINALES, MENUS, INICIO, etc.
	 * - Se carga UNA SOLA VEZ en Juego.constructor mediante Utilidades.leerArchivo().
	 * - Es de solo lectura después de cargarse (no se modifica).
	 * 
	 * Usos principales:
	 * - ControladorEscena.inicializarEscenas() → lee escenas, opciones y finales para crear objetos Escena y Respuestas.
	 * - Vista → carga textos de MENUS e INICIO para mostrar menú y título.
	 * - Indirectamente: toda la lógica narrativa del juego depende de este nodo.
	 */

	private JsonNode texto = null;
	/**
	 * Constructor por defecto (sin parámetros).
	 * 
	 * Uso principal:
	 * - Se llama en Vacio.main() para crear la instancia inicial.
	 * 
	 * Inicializa:
	 * - usuarioActual = null (se asigna después).
	 * - texto = null (se asigna en Juego.constructor).
	 */
	public InstanciaJuego() {
		// Constructor vacío → atributos quedan en null hasta que se asignen
	}

	public Usuario getUsuarioActual() {
		return usuarioActual;
	}
	public void setUsuarioActual(Usuario usuarioActual) {
		this.usuarioActual = usuarioActual;
	}
	public JsonNode getTexto() {
		return texto;
	}
	public void setTexto(JsonNode texto) {
		this.texto = texto;
	}



}
