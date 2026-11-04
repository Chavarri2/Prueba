package ejercicios_pseudocodigo_parte_2;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 6/10/2026
 * Leer un número n que debe filtrarse entre 1 y 100 y a continuación calcular y
 * escribir la tabla de multiplicar de ese número con el siguiente formato:
 * TABLA DE MULTIPLICAR DE 8
 * 8 * 1 = 8
 * 8 * 2 = 16
 * 8 * 3 = 24
 * ......
 * .....
 * 8 * 10 = 80
 */
public class Ejercicio3 {
	public static void main(String[] args) {
		//Creamos objeto de clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos e inicializamos variables
		int num1;

		//Salida y entrada de datos
		System.out.println("Introduce un numero");
		num1=teclado.nextInt();
		System.out.println("==============================");
		System.out.println("TABLA DE MULTIPLICAR DE "+num1);
		System.out.println("==============================");
		
		//Si numero es mayor que 1 o menor que 100 entonces hace el bucle for
		if(num1>1 || num1<100) {
			//Este bucle se repite 10 veces
			for (int i = 1; i < 10; i++) {
				//Imprime por pantalla num1*iteracion=resultado de multiplicacion
				System.out.println(num1+" * "+ i +"="+ (i*num1));
			}
		}
		
		//Salida por pantalla
		System.out.println("==============================");
		
		//Cerramos objeto de clase Scanner
		teclado.close();
	}
}
