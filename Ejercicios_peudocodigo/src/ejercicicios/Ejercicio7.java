package ejercicicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 30/9/2026
 * Algoritmo que pida dos números y muestre el mayor. 
 */
public class Ejercicio7 {
	public static void main(String[] args) {
		//Creamos un objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		
		//Definimos variables
		int num1,num2;
		
		//Entrada y salida de datos
		System.out.println("Dame un numero");
		num1=teclado.nextInt();
		System.out.println("Dame otro numero");
		num2=teclado.nextInt();
		
		//Usamos la condicional if para evaluar cual de los dos numeros es mayor
		//Y usamos la salida de pantalla estandar para decir el resultado de la decision
		if(num1>num2) {
			System.out.println(num1+" es mayor que "+num2);
		}else {
			System.out.println(num2+" es mayor que "+num1);
		}
		
		//Cerramos clase Scanner
		teclado.close();
	}
}
