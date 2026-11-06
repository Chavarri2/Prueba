package ejercicioString;

import java.util.Scanner;

/**
 * @author Carlos
 * @version 1.0
 * @since 5/11/2026
 * Escribir un programa que pida por teclado una cadena y una letra, 
 * de manera que ponga en mayúsculas cada ocurrencia de la letra que 
 * haya en la cadena y lo muestre por pantalla.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos palabras
		String frase, letra;
		//Salida y entrada de datos
		System.out.println("Introduce una frase");
		frase=teclado.nextLine();
		System.out.println("Introduce una letra");
		letra=teclado.nextLine();
		System.out.println(frase.replace(letra, letra.toUpperCase()));
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
