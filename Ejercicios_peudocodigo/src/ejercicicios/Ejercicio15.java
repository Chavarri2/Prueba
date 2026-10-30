package ejercicicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 1/10/2026
 * Una tienda ofrece un descuento del 15% sobre el total de la compra durante el mes
 * de octubre. Dado un mes y un importe, calcular cuál es la cantidad que se debe
 * cobrar al cliente
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		//Inicializamos una constante llamada descuento
		final double DESCUENTO=(1-0.15);
		
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		
		//Declaramos variables
		int mes;
		double importe,importeTotal;

		//Salida y entrada de datos
		System.out.println("Introduzca el importe");
		importe=teclado.nextInt();
		System.out.println("Introduzca el mes (valor numerico)");
		mes=teclado.nextInt();

		//Usamos estructura de decion switch(valor del caso elegido)
		switch(mes) {
		case 1-9:
			System.out.println("Cantidad a pagar del importe: "+importe);
			break;
		case 10:
			//Calulamos el valor del importe total
			importeTotal=importe*DESCUENTO;
			System.out.println("Cantidad a pagar del importe: "+importeTotal);
			break;
		case 11-12:
			System.out.println("Cantidad a pagar del importe: "+importe);
			break;
		default:
			System.out.println("Error: Mes no existente");
		}

		//Cerramos clase Scanner
		teclado.close();
	}

}
