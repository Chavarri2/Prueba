package ejercicicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/10/2026
 * Escribir un programa que vaya pidiendo números hasta que el usuario introduzca un
 * cero. Debe mostrar por pantalla los números que introduce en las posiciones
 * impares pero no en las pares, es decir, el primero, tercero, quinto, séptimo, ... que
 * inserte deben mostrase, pero el segundo, cuarto, sexto, octavo, ... no deben
 * mostrarse por pantalla.
 * Para realizar este ejercicio piensa que pueden anidarse sentencias de repetición con
 * sentencias de selección. 
 */
public class Ejercicio20 {
	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables 
		int num,contador=0;
		//Salida y entrada de datos
		System.out.println("Introduce un numero");
		num=teclado.nextInt();
		
		//Bucle while que se repite mientras que num sea distinto de 0
		while(num!=0) {
			contador++;
			if(contador%2 !=0) {
				System.out.println("Numero introducido: "+num);
			}
			System.out.println("Introduce un numero");
			num=teclado.nextInt();
		}
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
