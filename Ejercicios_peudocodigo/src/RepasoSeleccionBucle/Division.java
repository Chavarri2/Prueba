package RepasoSeleccionBucle;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double divisor,dividendo,resultado;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingrese el dividendo");
		dividendo=teclado.nextDouble();
		System.out.println("Ingrese el divisor");
		divisor=teclado.nextDouble();
		if (divisor>0) {
			resultado=dividendo/divisor;
			System.out.println("El resultado de la division es: "+ resultado);
		}else {
			System.out.println("El valor es invalido");
		}
		System.out.println("El programa a finalizado");
		teclado.close();
	}

}
