package examen;

import java.util.Scanner;

public class Ejercicio4 {
	/*
	 * Carlos Abraham Chavarri Valera
	 * 20/10/2025
	 * Decir cual es el mayor de 4 numeros
	 */
	public static void main(String[] args) {
		// Declarar Variables
		int numero1, numero2, numero3, numero4;
		Scanner teclado=new Scanner(System.in);
		// Entrada de Datos
		System.out.println("Escribe el primer numero");
		numero1=teclado.nextInt();
		System.out.println("Escribe el sengundo numero");
		numero2=teclado.nextInt();
		System.out.println("Escribe el tercer numero");
		numero3=teclado.nextInt();
		System.out.println("Escribe el cuarto numero");
		numero4=teclado.nextInt();
		// Proceso y Salida
		if (numero1 >= numero2) {
			if (numero1 >= numero3) {
				System.out.println("El primer valor: " + numero1 + " Es el mas alto");
			} else {
				System.out.println("El tercer valor: " + numero3 + " Es el mas alto");
			}
		}else if (numero2 >= numero3) {
			System.out.println("El segundo valor es el mas alto: " + numero2 + " Es el mas alto");
		}else if (numero3 >= numero4){
			System.out.println("El tercer valor: " + numero3 + " Es el mas alto");
		}else {
			System.out.println("El cuarto valor: " + numero4 + " Es el mas alto");
		}
		System.out.println("Fin del programa");
		teclado.close();

	}

}
