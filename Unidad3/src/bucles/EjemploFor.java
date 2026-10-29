package bucles;

import java.util.Scanner;

/*
 * Autor: Abderrahman Labiod
 * Fecha: 06-10-2025
 * Ejercicio: Ejemplo de clase para explicar el uso de for
 * 
 * Práctica: Pedir número por teclado y que escriba la tabla de multiplicar (hasta el 10)
 */
public class EjemploFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Introducir número: ");
		num = sc.nextInt();
		
		/*
		 * int i = 0: 	Valor inicial
		 * --
		 * i <= 10: 	Condición de permanencia (Se evalua cada vez que se entra al bucle
		 * 				determina si se entra o no dependiendo del valor de i)
		 * --
		 * i++: 		Se ejecuta al acabar el bucle, usualmente es un operador 
		 * 				para incrementar o decrementar
		 */
		for (int i = 5; i <= 14; i = i+2) {
			System.out.println(num + " multiplicado por " + i + " es igual a: " + num*i);
		}
	}

}
