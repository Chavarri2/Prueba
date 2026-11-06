package ejercicioString;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/11/2026
 * Escribe un programa que pida por teclado una frase y cambie cada ocurrencia de la palabra
 * “si” por la palabra “no”. Después lo muestra por pantalla.
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		String palabra;
		//Entrada salida de datos
		System.out.println("Introduce una palabra");
		palabra=teclado.nextLine();
		palabra=palabra.toLowerCase();
		palabra=palabra.replace("si", "no");
		System.out.println(palabra);
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
