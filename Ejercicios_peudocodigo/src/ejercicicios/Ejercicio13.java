package ejercicicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 1/10/2026
 * Dadas dos variables numéricas a y b, que el usuario debe introducir por teclado, se
 * pide realizar un algoritmo que intercambie los valores de ambas variables y
 * muestre por pantalla cuánto valen al final las dos variables.
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		
		//Declaramos variables (aux es una variable auxiliar para guardar momentaneamente el valor de una de las
		//Variables duarante el cambio)
		int num1,num2, aux;
		
		//Salida y entrada de datos
		System.out.println("Introduzca un numero");
		num1=teclado.nextInt();
		System.out.println("Introduce otro numero");
		num2=teclado.nextInt();
		
		//Hacemos las operaciones, es decir, intercambio de valores
		aux=num1;
		num1=num2;
		num2=aux;
		
		//Salida de datos
		System.out.println("El valor del segunda variable es: "+num2);
		System.out.println("El valor del primer numero es: "+num1);
		
		//Cerramos clase Scanner
		teclado.close();
	}

}
