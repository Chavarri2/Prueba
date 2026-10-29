package examen;

/*
 * Victor
 * 31/10/2025
 * El programa debe calcular el factorial de un numero que debe estar validado entre 0 y 50.
 * Si el numero no esta entre 0 y 50 debe seguir pidiendo números.
 */

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variables
		int num;
		long factorial=1;//Ponemos long porque el factorial es un numero muy largo.
		Scanner teclado= new Scanner(System.in);
		//Validación
		do {
			System.out.println("Introduce un numero entre 0 y 50");
			num= teclado.nextInt();
		}while (num<0 || num>50);
		//Calculamos el factorial
		for (int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		//imprimir resultados
		System.out.println("El factorial de "+num+" es "+factorial);
		teclado.close();

	}

}
