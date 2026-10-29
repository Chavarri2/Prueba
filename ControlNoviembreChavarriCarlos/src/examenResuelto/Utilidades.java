package examenResuelto;
/**
 * Clase con métodos estáticos para manupulación de cadenas
 * 
 * @author Abderrahman Labiod
 * @version 1.0_26-11-25
 */
public class Utilidades {

	/**
	 * Valida si una cadena es mayor que 8 y entra en el rango a-Z
	 * 
	 * @param cadena Cadena a validar
	 * @return Devuelve si el método es una cadena valida con nuestras condiciones
	 */
	public static boolean esValido(String cadena) {
		return cadena.matches("[a-zA-Z]{8,}");
	}
	
	/**
	 * Concatena los carácteres de cada cadena intercalados
	 * @param s1 La primera cadena a concatenar
	 * @param s2 La segunda cadena a concatenar
	 * @return Nuestra cadena concatenada a base de intercalación
	 */
	public static String concatenar(String s1, String s2) {
		// Selecciono la longitud de la cadena mayor para evitar problemas a la hora de recorrerlas
		int longitud = s1.length() >= s2.length() ? s1.length() : s2.length();
		
		String resultado = "";
		for (int i = 0; i < longitud; i++) {
			if (i < s1.length()) resultado += s1.charAt(i);
			if (i < s2.length()) resultado += s2.charAt(i);
		}
		return resultado;
	}
	
	/**
	 * Comprueba si una cadena es un palíndromo
	 * 
	 * @param s1 La cadena a comprar
	 * @return Devuelve si nuestra cadena es un palíndromo o no
	 */
	public static boolean esPalindromo(String s1) {
		String s1M = s1.toLowerCase();
		for (int i = 0; i < s1M.length()/2; i++) {
			if (s1M.charAt(i) != s1M.charAt(s1M.length()-1-i)) return false;
		}
		return true;
	}
}
