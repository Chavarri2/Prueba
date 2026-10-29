package EjerciciosClase;

import java.util.Scanner;

/*
 * David Gil
 * 01/10/2025
 * Una tienda ofrece un descuento del 15% sobre el total de la compra durante el mes
	de octubre. Dado un mes y un importe, calcular cuál es la cantidad que se debe
	cobrar al cliente
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		//Declaracion 
		String mes;
		final double DESCUENTO= 15;
		double precioInicial; 
		double precioFinal;
		Scanner teclado = new Scanner (System.in);
		//Entrada de datos
		System.out.println("Introduce el precio del producto");
		precioInicial = teclado.nextDouble();
		System.out.println("Introduce el mes");
		teclado.nextLine();
		mes = teclado.nextLine();
		//proceso
		if (mes.equals("Octubre")) {//precaucion comparar cadenas
			precioFinal=precioInicial*(100-DESCUENTO)/100;
			
		}else  {
			precioFinal=precioInicial;
		}
		//salida
		System.out.println("El precio final de tus productos es " + precioFinal);
		teclado.close();
		

	}

}
