package ejerciciosScanner;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/10/2026
 * Lee un número entero y muestra si es par o impar.
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int num;
		
		//Salida y entrada de datos
		System.out.println("Introduzca un numero");
		num=teclado.nextInt();
		
		//Usamo condicion if y evaluamos condicion
		//si resto de numero es igual a cero entonces muestra es par
		//sino muestra es impar
		if(num%2==0) {
			System.out.println("El numero "+num+" es par");
		}else {
			System.out.println("El numero "+num+" es impar");
		}
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
