package ejerciciosScanner;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/10/2026
 * Pide una cantidad en euros y el valor del cambio (1€ = X $). Muestra el equivalente en dólares.
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		double euro,dolar,cambio;
		
		//Entrada y salida de datos
		System.out.println("Introduce una cantidad de euros:");
		euro=teclado.nextDouble();
		System.out.println("Introduce el valor del dolar");
		cambio=teclado.nextDouble();
		
		//Operaciones
		dolar=cambio*euro;
		
		//Salida por pantalla
		System.out.println("El equivalente a dolares es " +dolar);

		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
