package ejerciciosString2;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 9/11/2026
 * Programa que lea una frase y una palabra y que nos diga la posición de dicha palabra en la frase
 * y sino la encuentra devuelva un cero 
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);

		//Declaramos variables
		String frase, palabra;

		//Salida y entrada de datos
		System.out.println("Introduce una frase");
		frase=teclado.nextLine();
		System.out.println("Introduce la palabra que quiere buscar");
		palabra=teclado.nextLine();

		System.out.println("La palabra esta en la posicion "+buscarPalabra(frase, palabra));

		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

	//Metodo para buscar una palabra
	public static int buscarPalabra(String frase, String palabra) {
		if(frase.contains(palabra)) {
			return frase.indexOf(palabra);
		}else {
			return 0;
		}
	}
}
