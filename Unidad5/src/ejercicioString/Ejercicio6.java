package ejercicioString;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/11/2026
 * Escribe un programa que pida una palabra por teclado e intercambie la última y la primera letra.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		String palabra;
		//Salida y entrada de datos
		System.out.println("Introduce una palabra");
		palabra=teclado.nextLine();
		palabraCambioLetras(palabra);
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

	public static void palabraCambioLetras(String palabra) {
		System.out.println();
		for (int i = 0; i < palabra.length(); i++) {
			if(i==0) {
				System.out.print(palabra.charAt(palabra.length()-1));
			}else if(i==palabra.length()-1) {
				System.out.print(palabra.charAt(0));
			}else {
				System.out.print(palabra.charAt(i));
			}
		}
		System.out.println();
	}
}
