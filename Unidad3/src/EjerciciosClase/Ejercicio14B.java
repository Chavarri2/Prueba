package EjerciciosClase;

import java.util.Scanner;

/*
 * Miguel Chaves
 * 01/10/2025
 * Diseñar un algoritmo que pida un número por teclado y muestre por pantalla el mes
al que corresponde ese número (1 enero, 2 febrero, …, 12 diciembre). Si el número
no corresponde a ningún mes, debe decirlo también.
 */
public class Ejercicio14B {

	public static void main(String[] args) {
		//Variables
		int numeroMes;
		String mes;
		Scanner teclado= new Scanner(System.in);
		//Introducir datos
		System.out.println("Introduce el mes");
		numeroMes=teclado.nextInt();
		//Proceso
		mes=switch(numeroMes) {
		//case 12,13,14,15 -> "Valor" (Te pone el valor para esos casos)
		case 1 -> "Enero";
		case 2 -> "Febrero";
		case 3 -> "Marzo";
		case 4 -> "Abril";
		case 5 -> "Mayo";
		case 6 -> "Junio";
		case 7 -> "Julio";
		case 8 -> "Agosto";
		case 9 -> "Septiembre";
		case 10 -> "Octubre";
		case 11 -> "Noviembre";
		case 12 -> "Diciembre";
		default -> "Eso no es un mes";
		};
		System.out.println("El mes correspondiente es"+ mes);
		teclado.close();
	}

}
