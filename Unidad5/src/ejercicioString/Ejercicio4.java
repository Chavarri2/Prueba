package ejercicioString;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 05/11/2026
 * Igual al anterior, pero los espacios en blanco no se 
 * tendrán en cuenta, por tanto pediremos frase.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		String palabra;
		//Salida y entrada de datos
		System.out.println("Introduce una palabra");
		palabra=teclado.nextLine();
		if(esPalindromo(palabra)) {
			System.out.println("La palabra '"+palabra+"' es un palindromo");
		}else {
			System.out.println("La palabra '"+palabra+"' no es un palindromo");
		}
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	//Metodo para ordenar una palabra al reves (Eliminando los espacios)
	public static boolean esPalindromo(String palabra) {
		palabra=palabra.toLowerCase().replace(" ", "");
		for (int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i)!=palabra.charAt(palabra.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
}
