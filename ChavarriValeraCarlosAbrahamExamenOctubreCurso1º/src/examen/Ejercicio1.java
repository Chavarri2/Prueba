package examen;

/*
 * Victor
 * 31/10/2025
 * El programa debe estar pidiendo numeros por teclado hasta que el número sea negativo o la suma mayor que 100.
 * Al salir el programa me dirá cuantos números he introducido y su suma.
 * Contaremos el último número negativo introducido.
 */

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Declaración de variables
		int num, suma=0, contador=0;
		Scanner teclado= new Scanner(System.in);

		//Pedimos los numeros en un do while
		do {
			contador++;
			System.out.println("Introduce un numero");
			num= teclado.nextInt();
			suma= suma+num;
		}while(num>=0 && suma<=100);
		//Una vez que salimos del while imprimimos los resultados
		System.out.println("Has introducido "+contador+ " numeros y su suma vale " +suma);
		teclado.close();
	}

}
