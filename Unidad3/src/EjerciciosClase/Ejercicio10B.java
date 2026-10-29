package EjerciciosClase;
/*
 * /*
 * Christian Lázaro Manzueta
 * 01/10/2025
 * Algoritmo que lea tres números distintos y nos diga cuál de ellos es el mayor
 */

import java.util.Scanner;

public class Ejercicio10B {

	public static void main(String[] args) {
		//Declaracion de variables
		int n1, n2, n3, mayor;
		Scanner teclado = new Scanner (System.in);

		//Entrada de datos
		System.out.println("Introduce un numero");
		n1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		n2 = teclado.nextInt();
		System.out.println("Introduce el tercer numero");
		n3 = teclado.nextInt();
		
		//Proceso
		mayor = n1;
		if (n2 > mayor) {
			mayor = n2;
		}
		if (n3 > mayor) {
			mayor = n3;
		}
		// mayor = (n2 > mayor)?n2:;
		// mayor = (n3 > mayor)?n3:;
		 
		//Salida
		System.out.println("El mayor es " + mayor);
		teclado.close();

	}

}
