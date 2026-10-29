package ejerciciosScanner;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/10/2026
 * Pide al usuario dos números enteros e imprime su suma.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		//Creamos objeto de clase Scanner
		Scanner teclado=new Scanner(System.in);
		
		//Declaramos variables
		int num1,num2,suma;
		
		//Salida de datos
		System.out.println("Introduce un primer numero");
		num1=teclado.nextInt();
		System.out.println("Introduce un segundo numero");
		num2=teclado.nextInt();

		//Operaciones
		suma=num1+num2;
		
		//Salida de datos
		System.out.println("La suma es: "+suma);
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
