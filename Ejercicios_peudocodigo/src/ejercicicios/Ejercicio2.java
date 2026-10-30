package ejercicicios;

import java.util.Scanner;

/**
 * @author Alumno
 * @version 1.0
 * @since 30/9/2026
 * Programa que pide un nombre por consola y lo muestra por pantalla
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Crear nuevo escaner de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		
		//Definir variable
		String nombre;
		
		//Pide por pantalla que introduzca un nombre por consola
		System.out.println("Introduce tu nombre");
		
		//Guardamos el nombre escrito por consola en la variable nombre
		nombre=teclado.nextLine();
		
		//Muestra por pantalla la palabra "Hola " y lo que hay dentro de la varible nombre
		System.out.println("Hola "+nombre);
		
		//Cerramos teclado
		teclado.close();
	}

}
