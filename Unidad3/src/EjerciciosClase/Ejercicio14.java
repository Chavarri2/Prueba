package EjerciciosClase;

import java.util.Scanner;

/*
 * Miguel Chaves
 * 01/10/2025
 * Diseñar un algoritmo que pida un número por teclado y muestre por pantalla el mes
al que corresponde ese número (1 enero, 2 febrero, …, 12 diciembre). Si el número
no corresponde a ningún mes, debe decirlo también.
 */
public class Ejercicio14 {
	public static void main(String[] args) {
		//Variables
		int numeroMes;
		Scanner teclado= new Scanner(System.in);
		//Introducir datos
		System.out.println("Introduce el mes");
		numeroMes=teclado.nextInt();
		//Proceso
		switch (numeroMes){
			case 1:
				System.out.println("Enero");
				break;	
			case 2:
				System.out.println("Febrero");
				break;
			case 3:
				System.out.println("Marzo");
				break;
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Mayo");
				break;
			case 6:
				System.out.println("Junio");
				break;
			case 7:
				System.out.println("Julio");
				break;
			case 8:
				System.out.println("Agosto");
				break;
			case 9:
				System.out.println("Septiembre");
				break;
			case 10:
				System.out.println("Octubre");
				break;
			case 11:
				System.out.println("Noviembre");
				break;
			case 12:
				System.out.println("Diciembre");
				break;
			default:
				System.out.println("Eso no es un mes");
		}
		teclado.close();
	}

}
