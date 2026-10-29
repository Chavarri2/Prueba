package EjerciciosClase;

import java.util.Scanner;

/*
 * Miguel Chaves
 * 01/10/2025
 * Algoritmo que pida un número 
 * Dadas dos variables numéricas a y b, que el usuario debe introducir por teclado, se
pide realizar un algoritmo que intercambie los valores de ambas variables y
muestre por pantalla cuánto valen al final las dos variables.
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		// Definir variables
		int n1, n2, aux;
		Scanner teclado = new Scanner (System.in);

		//Entrada de datos
		System.out.println("Introduce un numero");
		n1 = teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		n2 = teclado.nextInt();
		//Proceso
		System.out.println("La variable n1 vale"+n1 + "la Variable n2 vale"+n2);
		aux=n1;
		n1=n2;
		n2=aux;
		System.out.println("La variable n1 vale"+n1 + "la Variable n2 vale"+n2);
		teclado.close();
	}

}
