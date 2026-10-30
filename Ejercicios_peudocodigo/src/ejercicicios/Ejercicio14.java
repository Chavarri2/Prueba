package ejercicicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version
 * @since 1/10/2026
 * Diseñar un algoritmo que pida un número por teclado y muestre por pantalla el mes
 * al que corresponde ese número (1 enero, 2 febrero, …, 12 diciembre). Si el número
 * no corresponde a ningún mes, debe decirlo también. 
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);

		//Declaramos variables
		int mes;

		//Salida y entrada de datos
		System.out.println("Introduce un numero de mes: ");
		mes=teclado.nextInt();

		//Usamos estructura de decision Segun hacer o tambien conocido como switch
		switch(mes) {

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
			System.err.println("Error: Mes no existente");
		}

		//Cerramos clase Scanner
		teclado.close();
	}

}
