package ejercicioString;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 4/11/2026
 *  Escribe un programa que pida por teclado una cadena y una letra, 
 *  de manera que eliminelas 3 primeras ocurrencias de la letra que 
 *  encuentre en la cadena y lo muestre por pantalla.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		String frase, letra;
		//Salida y entrada de datos
		System.out.println("Introduce una frase");
		frase=teclado.nextLine();
		System.out.println("Introduce una letra");
		letra=teclado.nextLine();
		for (int i = 0; i < 3; i++) {
			frase=frase.replaceFirst(letra, "");
		}
		System.out.println(frase);
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
