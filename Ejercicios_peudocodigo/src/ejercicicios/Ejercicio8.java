package ejercicicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version1.0
 * @since 30/9/2026
 * Algoritmo que pida dos números y diga cuál de ellos es mayor o bien si son iguales.
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Definimos variables
		int num1,num2;
		//Entrada y salida de datos
		System.out.println("Introduce un numero: ");
		num1=teclado.nextInt();
		System.out.println("Introduce otro numero");
		num2=teclado.nextInt();
		//Usamos estructura condicional if para evaluar que numero es mayor o bien si son iguales
		if(num1>num2) {
			System.out.println(num1+" es mayor que "+num2);
		}else if(num1<num2){
			System.out.println(num2+" es mayor que "+num1);
		}else {
			System.out.println("Los numeros "+num1+" y "+num2+" son iguales");
		}
		
		//Cerramos clase Scanner
		teclado.close();
	}

}
