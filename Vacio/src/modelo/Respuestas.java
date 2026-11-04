
/**
 * Clase que representa cada una de las opciones (respuestas) que el jugador puede elegir en una escena.
 * 
 * RESPONSABILIDADES PRINCIPALES:
 * - Almacenar el texto visible que se muestra al jugador (ej: "1. Huir hacia la oscuridad").
 * - Almacenar la clave de la siguiente escena (ej: "RESPUESTAINICIAL1", "combate", "final_perdido").
 * - Implementar la interfaz Interactuar → método mostrar() para imprimir el texto de la opción.
 * 
 * Se instancia:
 * - En ControladorEscena.inicializarEscenas() para cada opción leída del JSON.
 * - Se añade a la lista menus de cada objeto Escena.
 * 
 * Cumple requisitos mínimos:
 * - Implementa la interfaz Interactuar (junto con Personaje → cumple "al menos dos clases").
 * - Relación con Escena (1 Escena → * Respuestas).
 * 
 * Relación con otras clases:
 * - 1 Escena → * Respuestas (lista Vector en Escena.menus).
 * - Usada en Juego.jugarPartida() para mostrar opciones y obtener la clave siguiente.
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package modelo;

import visual.Interactuar;

public class Respuestas implements Interactuar {
	/**
	 * Texto que se muestra al jugador en la lista de opciones.
	 * Ejemplo: "1. Acercarse a la figura misteriosa".
	 */
	private String texto;
	/**
	 * Clave (ID) de la siguiente escena o acción especial.
	 * Ejemplos: "RESPUESTAINICIAL1", "combate", "final_demo", "final_perdido".
	 * Se usa para decidir qué escena cargar después de elegir esta opción.
	 */
	private String clave;
	/**
	 * Constructor por defecto (sin parámetros).
	 * 
	 * Uso:
	 * - Serialización futura (si se guarda respuestas en JSON/XML).
	 * - Inicializaciones genéricas o de prueba.
	 * 
	 * Deja texto y clave como null (se deben asignar después).
	 */
	public Respuestas() {
		// Constructor vacío → permite crear objeto y setear valores después
	}

	/**
	 * Constructor completo (el más utilizado).
	 * 
	 * Uso principal:
	 * - En ControladorEscena.inicializarEscenas() al leer cada opción del JSON.
	 * - Crea la Respuestas directamente con texto y clave leídos.
	 * 
	 * @param texto texto visible para el jugador (ej: "Huir hacia la oscuridad")
	 * @param clave ID de la siguiente escena o acción (ej: "RESPUESTAINICIAL1")
	 */
	public Respuestas(String texto, String clave) {
		this.texto = texto;
		this.clave=clave;

	}

	// Getters y Setters

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String claveSiguiente) {
		this.clave = claveSiguiente;
	}
	/**
	 * Implementación del método de la interfaz Interactuar.
	 * Muestra el texto de esta opción por consola.
	 * 
	 * Uso:
	 * - En Juego.jugarPartida() al recorrer escena.getMenus() para mostrar opciones.
	 * - Permite tratamiento polimórfico: se puede llamar mostrar() sin saber si es Personaje o Respuestas.
	 * 
	 * Salida típica: el texto tal cual (ej: "Huir hacia la oscuridad").
	 */
	@Override
	public void mostrar() {
		System.out.println(texto);
	}
}