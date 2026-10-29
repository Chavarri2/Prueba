package examen;

/*
 * Victor
 * 31/10/2025
 * El programa pide una temperatura y me dice un mensaje de acuerdo a la temperatura introducida.
 */

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Variables
		double temperatura;
		Scanner teclado= new Scanner(System.in);
		//Pido la temperatura
		System.out.println("Introduce la temperatura");
		temperatura= teclado.nextDouble();
		//Imprimir el mensaje adecuado
		if (temperatura<35) {
			System.out.println("Estás congelado");
		}else if (temperatura>=35 && temperatura <37) {
			System.out.println("Tu temperatura es correcta");
		}else if (temperatura>=37 && temperatura <38.5) {
			System.out.println("Fiebre moderada, reposa");
		}else if (temperatura>=38.5 && temperatura <42.5) {
			System.out.println("Fiebre alta, ve al médico");
		}else if (temperatura>=42.5) {
			System.out.println("Estás en el infierno");
		}
		teclado.close();
	}

}
