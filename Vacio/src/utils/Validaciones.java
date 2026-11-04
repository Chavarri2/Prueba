/**
 * Clase auxiliar con métodos estáticos dedicados exclusivamente a la validación segura de entradas del usuario.
 * 
 * RESPONSABILIDAD ÚNICA:
 * - Leer y validar datos desde consola (números, cadenas con regex).
 * - Evitar entradas inválidas (no números, fuera de rango, formato incorrecto).
 * - Lanzar excepción personalizada (Excepciones) cuando los datos no cumplen requisitos.
 * - Reintentar lectura hasta que la entrada sea correcta.
 * 
 * No se instancia (todos los métodos son estáticos).
 * Se usa en casi todo el proyecto: creación de usuario, selección de opciones en escenas, distribución de atributos, etc.
 * 
 * Cumple requisito de:
 * - Control adecuado de excepciones.
 * - Uso de excepción propia (Excepciones).
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package utils;

import java.util.InputMismatchException;
import excepcion.Excepciones;


public class Validaciones {
	/**
	 * Lee y valida un número short en un rango [min, max].
	 * Muestra mensaje de error y reintenta hasta que sea válido.
	 * 
	 * @param mensaje texto que se muestra antes de leer (ej: "Elige una opción: ")
	 * @param min valor mínimo aceptado (inclusive)
	 * @param max valor máximo aceptado (inclusive)
	 * @return número short validado dentro del rango
	 */
	public static short obtenerOpcionValida(String mensaje, short min, short max) {
		while (true) {
			try {
				short opcion = leerShortSeguro(mensaje);// Llama al método seguro de lectura

				if (opcion < min || opcion > max) {
					// Mensaje específico para rango inválido
					System.out.println("Opción no valida. El numero debe estar entre " + min + " y " + max);
				} else {
					return opcion; // Solo sale del bucle si es válido
				}

			} catch (Exception e) {
				// Captura cualquier error inesperado (aunque leerShortSeguro ya lo maneja)
				System.out.println("Entrada inválida. Debes introducir un número.");
				LeerScanner.limpiarScanner();// Limpia buffer para evitar bucles infinitos
			}
		}
	}
	/**
	 * Método auxiliar seguro para leer un short.
	 * Maneja InputMismatchException y limpia el buffer.
	 * Se llama desde obtenerOpcionValida().
	 * 
	 * @param mensaje texto a mostrar antes de leer
	 * @return short leído correctamente
	 */
	public static short leerShortSeguro(String mensaje) {
		while (true) {
			try {
				return LeerScanner.leerShort(mensaje);// Delega en LeerScanner
			} catch (InputMismatchException e) {
				// Mensaje específico para cuando se introduce texto en vez de número
				System.out.println("Error: Debes introducir un número entero válido.");
				LeerScanner.limpiarScanner();// Limpia el buffer para evitar bucle infinito
			}
		}
	}
	/**
	 * Lee y valida una cadena de texto (nombre o nickname) contra una expresión regular.
	 * Reintenta hasta que cumpla el patrón.
	 * Lanza excepción personalizada si el formato no es correcto.
	 * 
	 * @param nombre variable donde se almacenará el valor (se pasa por valor, pero se reasigna)
	 * @param mensaje texto que se muestra al usuario (ej: "Ingresa tu nombre real")
	 * @param pattern regex que debe cumplir la cadena
	 * @param error mensaje de error personalizado cuando no cumple
	 * @return la cadena validada
	 * @throws Excepciones si la cadena no cumple el patrón (aunque reintenta, sale si se cancela)
	 */
	public static String ingresarNombre(String nombre, String mensaje, String pattern, String error) {
		while (true) {
			try {
				nombre = LeerScanner.leerString(mensaje).trim();// Lee y elimina espacios iniciales/finales
				// Lanza excepción propia si no cumple regex
				if (!nombre.matches(pattern)) {
					throw new Excepciones(error);
				}
				break;// Sale del bucle solo si es válido
			} catch (Excepciones e) {
				// Muestra mensaje de error personalizado y vuelve a pedir
				System.out.println(e.getMessage());
			}
		}
		return nombre;
	}

}
