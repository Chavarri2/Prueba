package examen;

/*
 * Victor
 * 31/10/2025
 * El programa debe pedir 4 numeros e indicarme cual es el mayor.
 * 
 */

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Variables
		int num1, num2, num3, num4, mayor;
		Scanner teclado= new Scanner(System.in);
		
		//Pedir los números
		System.out.println("Introduce un numero");
		num1=teclado.nextInt();
		System.out.println("Introduce un numero");
		num2=teclado.nextInt();
		System.out.println("Introduce un numero");
		num3=teclado.nextInt();
		System.out.println("Introduce un numero");
		num4=teclado.nextInt();
		
		//Calculamos el mayor
		mayor=num1;
		if (num2>mayor) {mayor=num2;}	
		if (num3>mayor) {mayor=num3;}
		if (num4>mayor) {mayor=num4;}
		
		/* Usando el operador ternario
		 * mayor=?(num2>mayor)num2:
		 * mayor=?(num3>mayor)num3:
		 * mayor=?(num4>mayor)num4:
		 */
		
		//Imprimir resultados
		System.out.println("El numero mayor es "+mayor);
		teclado.close();
	}

}
