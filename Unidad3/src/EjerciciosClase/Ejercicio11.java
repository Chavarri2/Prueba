package EjerciciosClase;

import java.util.Scanner;

/*
 * Luis Lopez
 * 01/10/2025
 * Diseñar un algoritmo que pida por teclado tres números; si el primero es negativo,
debe imprimir el producto de los tres y si no lo es, imprimirá la suma. 
 */
public class Ejercicio11 {

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
		if (n1 < 0) {
			System.out.println("El produto de los numeros es " + n1*n2*n3);
		}else {
			System.out.println("La suma de los numeros es " +(n1+n2+n3));
		}
		teclado.close();

	}

}
