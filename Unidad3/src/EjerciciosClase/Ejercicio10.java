package EjerciciosClase;

import java.util.Scanner;

/*
 * /*
 * Christian Lázaro Manzueta
 * 01/10/2025
 * Algoritmo que lea tres números distintos y nos diga cuál de ellos es el mayor
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		//Declaracion de variables
		int n1, n2, n3;
		Scanner teclado = new Scanner (System.in);
		
		//Entrada de datos
		System.out.println("Introduce un numero");
		n1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		n2 = teclado.nextInt();
		System.out.println("Introduce el tercer numero");
		n3 = teclado.nextInt();
		
		//Proceso
		if (n1 >= n2) {
			if (n1 >= n3) {
				System.out.println("El mayor es " + n1);
			}else {
				System.out.println("El mayor es " + n3);
			}
		}else {
			if (n2 >= n3) {
				System.out.println("El mayor es " + n2);
			}else {
				System.out.println("El mayor es " + n3);
			}
		}
		teclado.close();

	}

}
