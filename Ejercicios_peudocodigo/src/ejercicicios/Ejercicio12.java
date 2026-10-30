package ejercicicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 1/10/2026
 * Algoritmo que pida un número y visualice por pantalla si es par o impar.
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		
		//Definir variables
		int num;
		
		//Salida y entrada de datos
		System.out.println("Introduce un numero");
		num=teclado.nextInt();
		
		//Usamos estructura condicional if para ver si el numero es par o impar
		//Evaluamos condicion si num entredos deja cero de resta entonces entramos sino evaluamos
		//La siguiente condicion
		if(num%2==0) {
			System.out.println("El numero "+ num +" es par");
		}else {
			System.out.println("El numero "+ num +" es impar");
		}
		
		//Cerramos clase Scanner
		teclado.close();
	}

}
