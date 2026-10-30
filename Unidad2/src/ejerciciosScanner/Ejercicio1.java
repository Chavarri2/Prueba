package ejerciciosScanner;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/10/2026
 * Pide al usuario su nombre y muestra un saludo
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variable
		String nombre;
		
		//Salida y entrada de datos
		System.out.println("Introduce tu nombre");
		nombre=teclado.nextLine();
		System.out.println("Hola, ¿como estas? "+nombre);
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
