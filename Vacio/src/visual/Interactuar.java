/**
 * Interfaz simple que define un único método abstracto: mostrar().
 * 
 * PROPÓSITO Y RESPONSABILIDAD:
 * - Proporcionar un contrato común para que ciertas entidades del juego puedan mostrar su información por consola.
 * - Permite tratamiento polimórfico: se puede llamar a mostrar() en cualquier objeto que implemente esta interfaz sin saber su tipo concreto.
 * 
 * CLASES QUE LA IMPLEMENTAN (cumpliendo requisito mínimo):
 * - Personaje → muestra atributos y datos del héroe.
 * - Respuestas → muestra el texto de cada opción del menú en una escena.
 * 
 * USO EN EL PROYECTO:
 * - En el bucle de juego (Juego.jugarPartida()) se muestra cada Respuestas con mostrar().
 * - El método Personaje.mostrar() se llama después de cada escena para actualizar estado.
 * - Facilita extensibilidad: cualquier nueva entidad que necesite mostrarse por consola puede implementar esta interfaz.
 * 
 * BENEFICIO:
 * - Cumple el requisito de "crear una interfaz que la implementen al menos dos clases".
 * - Favorece el principio de diseño "programar contra interfaces, no contra implementaciones".
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package visual;

public interface Interactuar {
	/**
	 * Método abstracto que obliga a las clases implementadoras a definir cómo mostrar su información.
	 * 
	 * No recibe parámetros ni devuelve nada (solo imprime por consola).
	 * Debe ser sobrescrito en cada clase que implemente la interfaz.
	 * 
	 * EJEMPLOS DE IMPLEMENTACIÓN:
	 * - Personaje: muestra nombre, género, característica y atributos (fuerza, resistencia, velocidad).
	 * - Respuestas: muestra únicamente el texto de la opción (ej: "1. Huir hacia la oscuridad").
	 * 
	 * USO TÍPICO:
	 * - Llamado directamente en bucles de menú o después de escenas.
	 * - Permite recorrer listas de objetos heterogéneos y llamar mostrar() a todos.
	 */
	void mostrar();
}