package ejerciciosString2;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 9/11/2026
 * Leer una cadena de hasta 80 caracteres y pasarla en 
 * función de una variable de opción a mayúsculasó a 
 * minúsculas e imprimir la cadena resultante.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		menu(teclado);
		System.out.println("Fin del programa");
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

	//Metodo para visualizar el menu
	public static void menu(Scanner teclado) {
		//Declaramos e inicializamos variables
		int opcion;
		String frase="";
		do {
			System.out.println("Seleciona una opcion:"
					+ "\n1. Mayusculas a Minusculas."
					+ "\n2. Minusculas a Mayusculas."
					+ "\n0. Salir.");
			opcion=teclado.nextInt();
			if(opcion!=0) {
				frase=validarFrase(teclado);
			}
			switch (opcion) {
			case 1:
				System.out.println("La frase en minusculas es:");
				System.out.println(frase.toLowerCase());
				break;
			case 2:
				System.out.println("La frase en mayusculas es:");
				System.out.println(frase.toUpperCase());
				break;
			case 0:
				System.out.println("Ha decidido salir");
				break;
			default:
				System.err.println("Error: La opcion introducida no es valida");
				break;
			}
			teclado.nextLine();
		}while(opcion!=0);
	}
	//Metodo para validar la frase
	public static String validarFrase(Scanner teclado) {
		String frase;
		do {
			System.out.println("Introduce una frase");
			frase=teclado.nextLine();
			if(frase.length()>80) {
				System.out.println("Error: La longitud de la frase supera los 80 caracteres");
			}
		}while(frase.length()>80);
		return frase;
	}
}
