package ejercicicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 30/9/2026
 * Algoritmo que pida un nombre y apellido y que muestre nombre y apellidos concatenados. 
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		//Crear objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		
		//Definir variables
		String nombre,apellido;
		
		//Mostramos por pantalla un mensaje que pide ingresar un nombre por consola
		System.out.println("Introduce tu nombre: ");
		//Guardamos el valor en la variable nombre
		nombre=teclado.nextLine();
		
		//Mostramos por pantalla un mensaje que pide ingresar un apellido por consola
		System.out.println("Introduce tu apellido");
		//Guardamos el valor en la variable apellido
		apellido=teclado.nextLine();
		
		//Mostramos un mensaje por pantall concatenando la variables
		System.out.println("Hola "+nombre+" "+apellido);
		
		//Cerramos la clase Scanner
		teclado.close();
	}

}
