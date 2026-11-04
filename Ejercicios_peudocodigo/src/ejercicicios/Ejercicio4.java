package ejercicicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 30/9/2026
 * Algoritmo que pida dos números y muestre por pantalla su suma, resta, producto y división. 
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		//Crear un nuevo objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		
		// Definir variables
		int num1,num2,suma,resta,producto,division;
		
		//Muestra un mensaje por pantall un mensaje que pide un valor por consola
		System.out.println("Introduce un numero");
		num1=teclado.nextInt();
		
		//Muestra un mensaje por pantall un mensaje que pide otro valor por consola
		System.out.println("Introduce otro numero");
		num2=teclado.nextInt();
		
		//Realizamos las operaciones y las guardamos en las variables
		suma=num1+num2;
		resta=num1-num2;
		producto=num1*num2;
		division=num1/num2;
		
		//Mostramos por pantalla el resultado de dichas operaciones
		System.out.println("\nLa suma de los numeros introducidos es: "+suma);
		System.out.println("La resta de los numeros introducidos es: "+resta);
		System.out.println("La producto de los numeros introducidos es: "+producto);
		System.out.println("La division de los numeros introducidos es: "+division);
		
		//Cerramos la clase Scanner
		teclado.close();
	}

}
