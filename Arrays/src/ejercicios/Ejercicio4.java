package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos
 * @version 1.0
 * @since 16/11/2026
 * Pide al usuario cuántas notas va a introducir, guárdalas en un array de double
 * y muestra la media, la nota más alta y la nota más baja.
 */
public class Ejercicio4 {
	//Este ejercicio cumple lo minimos muy mejorable por cuestiones de pereza y de que no lo piden no se validan de una 
	//Forma mas correcta que valores minimos y maximos se pueden introducir
	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int numeroNotas;
		//Entrada y salida de datos
		System.out.println("¿Cuantas notas vas a introducir?");
		numeroNotas=teclado.nextInt();
		//Declaramos variables
		double[] listaNotas=new double[numeroNotas];
		for (int i = 0; i < listaNotas.length; i++) {
			System.out.println("Introduce la nota "+(1+i));
			listaNotas[i]=teclado.nextDouble();
			if(listaNotas[i]<0) {
				listaNotas[i]=listaNotas[i]*1;
			}else if(listaNotas[i]>10) {
				listaNotas[i]=10;
			}
		}
		System.out.printf("La nota media es: %.2f",media(listaNotas));
		System.out.println("\nLa nota mas baja es: "+notaBaja(listaNotas));
		System.out.println("La nota mas alta es: "+notaAlta(listaNotas));

		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	public static double media(double[] notas) {
		double notaMedia=0;
		for (double d : notas) {
			notaMedia=d+notaMedia;
		}
		return notaMedia/notas.length;
	}

	public static double notaAlta(double[] notas) {
		double notaMasAlta=0;
		for (double d : notas) {
			if(d>notaMasAlta) {
				notaMasAlta=d;
			}
		}
		return notaMasAlta;
	}

	public static double notaBaja(double[] notas) {
		double notaMasBaja=10;
		for (double d : notas) {
			if(d<notaMasBaja) {
				notaMasBaja=d;
			}
		}
		return notaMasBaja;
	}
}
