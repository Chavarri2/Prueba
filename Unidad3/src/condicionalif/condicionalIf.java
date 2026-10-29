package condicionalif;

import java.util.Scanner;

/*
 *25/09/25
 *Ejercicio para aprender los condicionales
 *Introducimos un numero y nos dice si es par o impar
 */
public class condicionalIf {

	public static void main(String[] args) {
	
		//declaramos variables
		int dato;
		Scanner scEvis=new Scanner(System.in);//para leer por teclado
		String salida;
		//entrada de datos
		System.out.println("Introduce un numero");
		dato= scEvis.nextInt();
		//proceso
		if (dato%2==0) {
			salida="el numero es par";
			
		}else {
			salida="el numero es impar";
			
		}
		//salida
		System.out.println(salida);
		scEvis.close();

	}

}
