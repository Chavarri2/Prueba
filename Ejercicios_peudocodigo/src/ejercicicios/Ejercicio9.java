package ejercicicios;

import java.util.Scanner;

/**
 * @autor Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 30/9/2026
 *  Algoritmo que pida dos números y decir si son iguales o distintos. 
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Definimos variables
		int num1,num2;
		
		//Salida y entra de datos
		System.out.println("Introduce un numero");
		num1=teclado.nextInt();
		System.out.println("Introduce otro numero");
		num2=teclado.nextInt();
		
		//Usamos condicional para evaluar si los numeros son iguales o distintos
		if(num1==num2) {
			System.out.println("Los numeros "+num1+" y "+num2+" son iguales");
		}else {
			System.out.println("los numeros "+num1+" y "+num2+" son distintos");
		}
		//Cerramos teclado
		teclado.close();
	}

}
