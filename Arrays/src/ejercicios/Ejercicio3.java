package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos
 * @version 1.0
 * @since 16/11/2026
 * Pide al usuario 10 números enteros, guárdalos en un array y muéstralos en
 * orden inverso al que se introdujeron.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int[] listaNumeros=new int[10];
		//Entrada y salida de datos
		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.println("Introduce un numero");
			listaNumeros[i]=teclado.nextInt();
		}
		System.out.println("\nNumeros en orden inverso al introducido");
		var variable=listaNumeros.length-1;
		while(variable>=0){
			System.out.println(listaNumeros[variable--]);
		}
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
