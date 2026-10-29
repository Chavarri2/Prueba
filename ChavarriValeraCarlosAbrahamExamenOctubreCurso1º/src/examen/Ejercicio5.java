package examen;

/*
 * Victor
 * 31/10/2025
 * Construir un menu de 3 opciones (la quinta es salir) que se repite hasta que elijamos la opción salir.
 */

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Variables
		int opcion=0;
		Scanner teclado= new Scanner(System.in);
		//Repetimos mientras la opción sea distinta de 3
		do {
			//imprimo el menú
			System.out.println("Menu");
			System.out.println("Opcion 1");
			System.out.println("Opcion 2");
			System.out.println("Opcion 3 -> salir");
			//Pedir la opcion
			opcion=teclado.nextInt();
			//Ejecutar la acción según la opción
			switch (opcion) {
			case 1: 
				System.out.println("Has elegido opción 1");
				break;
			case 2:
				System.out.println("Has elegido opción 2");
				break;
			case 3:
				System.out.println("Has elegido salir. ¡Adios!");
				break;
			default:
				System.out.println("Opcion erronea");
				break;
			}
		}while(opcion!=3);
		//cerrar el teclado
		teclado.close();
		

	}

}
