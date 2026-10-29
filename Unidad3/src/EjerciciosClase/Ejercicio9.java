package EjerciciosClase;

import java.util.Scanner;

/*
 * Christian Lázaro Manzueta
 * 01/10/2025
 * Algoritmo que pida dos números y decir si son iguales o distintos.
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		//Definicion de variables
		int n1;
		int n2;
		String salida;
		Scanner teclado = new Scanner (System.in);
		
		//Entrada de datos
		System.out.println("Dame un numero");
		n1 = teclado.nextInt();
		System.out.println("Dame otro numero");
		n2 = teclado.nextInt();
		
		//Proceso
		salida = (n1==n2)?"Son iguales":"Son distintos";
		
		//Salida
		System.out.println(salida);
		teclado.close();

	}

}
