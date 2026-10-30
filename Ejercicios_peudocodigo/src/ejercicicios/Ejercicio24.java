package ejercicicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/10/2026
 * Realizar un algoritmo que pida dos números, un dividendo y un divisor. Si el
 * divisor es distinto de 0, mostrará el resultado de la operación. En caso contrario le
 * dirá al usuario “En una división, el divisor no puede ser 0”. 
 */
public class Ejercicio24 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		double dividendo,divisor;
		
		//Entrada y salida de datos
		System.out.println("Introduce el dividendo");
		dividendo=teclado.nextDouble();
		System.out.println("Introduce el divisor");
		divisor=teclado.nextDouble();
		
		//Usamos condicional if y evaluamos condicion
		//Si divisor es distinto de cero entonce mostrara el resultado de la division
		//Sino mostrara un mensaje de error
		if(divisor!=0) {
			System.out.println("El resultado de la division es: "+(dividendo/divisor));
		}else {
			System.err.println("En una división, el divisor no puede ser 0");
		}
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
