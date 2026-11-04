package ejercicios_clase;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @since 06/10/2026
 * @version 1.0
 * Pedir un número e indicar si es positivo, negativo o cero. 
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int numero;
		
		//Salida y entrada de datos
		System.out.println("Introduce un numero");
		numero=teclado.nextInt();
		
		if(numero>=0) {
			System.out.println("El numero " + numero+ " es positivo");
		}else if(numero<=0) {
			System.out.println("El numero " + numero+ " es negativo");
		}else {
			System.out.println("El numero "+numero+" es cero");
		}
			
		//Cerramos opjeto de la clase Scanner
		teclado.close();
	}

}
