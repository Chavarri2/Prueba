package ejerciciosSeleccion;

import java.util.Scanner;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 19/10/2026
 * Programa que evalua si un numero es positivo, negativo o cero
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos objetos de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int num;
		//Entrada y salida de datos
		System.out.println("Introduzca un numero");
		num=teclado.nextInt();
		//Usamos condicional if y evaluamos
		//Si num es mayor que cero mostrara por consola el numero es positivo
		if(num>0) {
			System.out.println("El numero es positivo");
			//Si el numero es menor que cero mostrara por consola el numero es negativo
		}else if(num<0) {
			System.out.println("El numero es negativo");
			//Sino mostrara por consola que el numero es negativo
		}else {
			System.out.println("El numero es cero");
		}
		teclado.close();
	}

}
