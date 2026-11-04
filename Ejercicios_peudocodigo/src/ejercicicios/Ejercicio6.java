package ejercicicios;

import java.util.Scanner;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 30/9/2026
 * Algoritmo que pida dos números y diga si son iguales. 
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		//Creamos un objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);

		//Definimos variables
		int num1,num2;

		//Salida y entrada
		System.out.println("Introduce un numero");
		num1=teclado.nextInt();
		System.out.println("Introduce otro numero");
		num2=teclado.nextInt();

		//Usamos una estructura de tomas de decisiones if (condicional) y medimos si se cumple una condicion o otra
		//Si numero 1 es igual a numero 2 entonce mostrara el mensaje Son iguales sino mostrara No son iguales
		if(num1==num2) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}

		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
