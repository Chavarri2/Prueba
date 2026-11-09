package ejerciciosString2;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @sinceLeer una frase de máximo 80 caracteres y escribirla 
 * progresivamente es decir si la frase es: “ciervo”, el programa debe imprimir
 * c
 * ci
 * cie
 * cier
 * cierv
 * ciervo
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		
		//Inicializamos variables
		//Llamamos al metodo validarFrase
		String frase=validarFrase(teclado);
		
		//Llamamos al metodo mostrarPalabraProgresivamente
		mostrarPalabraProgresivamente(frase);
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

	//Metodo para mostrar una frase de forma progresiva
	public static void mostrarPalabraProgresivamente(String frase) {
		//bucle for anidado 
		for (int i = 0; i < frase.length(); i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(frase.charAt(j));
			}
			System.out.println();
		}
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
