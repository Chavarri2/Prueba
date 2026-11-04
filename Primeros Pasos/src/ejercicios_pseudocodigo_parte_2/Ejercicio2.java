package ejercicios_pseudocodigo_parte_2;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 6/10/2026
 * Calcular la suma de los cuadrados de los números pares comprendidos entre 1 y n
 * donde n es una variable que se leerá del exterior por el teclado.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int num1;
		double suma = 0;
		
		//Entrada y salida de datos
		System.out.println("Introduce un numero");
		num1=teclado.nextInt();
		
		//
		for (int i = 1; i <= num1; i++) {
			if(i%2==0) {
				suma=suma+Math.sqrt(i);
			}
		}
		
		//Salida de datos
		System.out.println("La suma de todos los cuadrados pares es: "+suma);
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
