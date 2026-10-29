/**
 * Clase auxiliar singleton que centraliza TODA la lectura de entrada por consola mediante Scanner.
 * 
 * RESPONSABILIDAD ÚNICA:
 * - Proporcionar métodos seguros y reutilizables para leer short, double y String.
 * - Limpiar el buffer después de cada lectura (evita problemas con saltos de línea pendientes).
 * - Manejar errores básicos de entrada (InputMismatchException).
 * 
 * CARACTERÍSTICAS IMPORTANTES:
 * - Scanner es estático y único → solo una instancia en toda la aplicación (evita conflictos).
 * - No se instancia la clase (constructor implícito privado por defecto + métodos estáticos).
 * - Todos los métodos públicos son estáticos → se llaman directamente: LeerScanner.leerString(...).
 * 
 * Uso principal en el proyecto:
 * - Validaciones → lee y valida nombre, nickname, edad, opciones numéricas.
 * - ControladorPartida → lee nombre y género del personaje.
 * - ControladorUsuario → lee entradas para creación/selección de usuario.
 * - Juego.jugarPartida → lee elección de opción en cada escena.
 * 
 * Cumple requisito indirecto: encapsulación de entrada/salida y control de excepciones.
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-01-24
 */
package utils;

import java.util.Scanner;

public class LeerScanner {

	/**
	 * Instancia única y estática de Scanner vinculada a System.in.
	 * Se crea una sola vez al cargar la clase y se reutiliza siempre.
	 * Evita crear múltiples Scanner (que pueden causar conflictos en consola).
	 */
	private static final Scanner teclado = new Scanner(System.in);

	/**
	 * Lee un número entero corto (short) desde consola.
	 * Muestra mensaje previo y espera entrada.
	 * 
	 * FUNCIONAMIENTO:
	 * 1. Imprime el mensaje.
	 * 2. Lee con nextInt() (espera hasta que se introduzca un número).
	 * 3. Limpia el buffer (nextLine()) para eliminar salto de línea pendiente.
	 * 
	 * Uso principal:
	 * - Validaciones.obtenerOpcionValida() → lee opciones numéricas (menú, distribución de puntos).
	 * - ControladorPartida → lee género (aunque se convierte a String).
	 * 
	 * @param mensaje texto que se muestra antes de leer (ej: "Introduce tu edad: ")
	 * @return short leído correctamente
	 */
	public static short leerShort(String mensaje) {
		System.out.println(mensaje);
		short numero = (short) teclado.nextInt();
		teclado.nextLine(); // Limpia salto de línea pendiente (muy importante)
		return numero;
	}

	/**
	 * Lee un número decimal (double) desde consola.
	 * Muestra mensaje previo y espera entrada.
	 * 
	 * FUNCIONAMIENTO:
	 * 1. Imprime mensaje.
	 * 2. Lee con nextDouble().
	 * 3. Limpia buffer con nextLine().
	 * 
	 * Uso actual: no se usa directamente en el proyecto (posible para futuras expansiones).
	 * 
	 * @param mensaje texto a mostrar
	 * @return double leído
	 */
	public static double leerDouble(String mensaje) {
		System.out.println(mensaje);
		double numero = teclado.nextDouble();
		teclado.nextLine(); // Limpia salto de línea
		return numero;
	}

	/**
	 * Lee una cadena de texto completa (incluye espacios) desde consola.
	 * Muestra mensaje previo y espera hasta Enter.
	 * 
	 * FUNCIONAMIENTO:
	 * 1. Imprime mensaje.
	 * 2. Lee con nextLine() → captura toda la línea (incluye espacios).
	 * 3. Aplica trim() para eliminar espacios iniciales/finales.
	 * 
	 * Uso principal:
	 * - Validaciones.ingresarNombre() → lee nombre real y nickname.
	 * - ControladorPartida → lee nombre y género del personaje.
	 * 
	 * @param mensaje texto a mostrar
	 * @return cadena leída (trimmed)
	 */
	public static String leerString(String mensaje) {
		System.out.println(mensaje);
		return teclado.nextLine().trim(); // trim() elimina espacios sobrantes
	}
	/**
	 * Limpia manualmente el buffer de entrada de Scanner.
	 * Consume todas las líneas pendientes hasta que no quede nada.
	 * 
	 * Uso recomendado:
	 * - Justo antes de typeWriter() o cualquier lectura posterior, para eliminar teclas pulsadas durante efecto de escritura.
	 * - Evita que entradas "accidentales" interfieran en la siguiente lectura.
	 * 
	 * Implementación segura: while(hasNextLine()) consume todo.
	 */
	public static void limpiarScanner() {
		if (teclado.hasNextLine()) {
			teclado.nextLine();// Descarta línea completa
		}
	}

	/**
	 * Cierra el Scanner (buena práctica aunque en aplicaciones pequeñas suele omitirse).
	 * Libera recursos asociados a System.in.
	 * 
	 * Nota: en este proyecto no se llama nunca (consola corta), pero está como buena práctica.
	 */
	public static void cerrar() {
		teclado.close();
	}

}
