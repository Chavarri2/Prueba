package examen;

import java.util.Scanner;

public class Ejercicio2 {
		/*
		 * Carlos Abraham Chavarri Valera
		 * 20/8/2025
		 * Switch que te indica que debes hacer dependiendo de tu temperatura 
		 * corporal
		 */
	public static void main(String[] args) {
		// Declaramos variables
		float temperatura;
		int variable=0;//variable es una variable de apoyo
		Scanner teclado=new Scanner(System.in);
		// pedir datos
		System.out.println("Escribe cual es el caso de tu temperatura: ");
		temperatura=teclado.nextInt();
		//proceso y salida
		if(temperatura < 35) {
			variable=1;
		}else if(temperatura >= 35 && temperatura<37) {
			variable=2;
		}else if(temperatura >= 37 && temperatura<38.5) {
			variable=3;
		}else if(temperatura >= 38.5 && temperatura<42.5) {
			variable=4;
		}else if(temperatura >=42.5) {
			variable=5;
		}
		switch(variable) {
			case 1:
				System.out.println("Tu temperatura es muy fria deberias estar congelado");
				break;
			case 2:
				System.out.println("Tu temperatura es correcta. No debes preocuparte");
				break;		
			case 3:
				System.out.println("Tienes una fiebra moderada. Reposa");
				break;
			case 4:
				System.out.println("Tienes una fiebre muy elevada. Ve al medico");
				break;
			case 5:
				System.out.println("Tu temperatura es elevada. Debezs de estar en el infierno");
				break;
			default:
				System.out.println("El dia elegido no es valido");
				break;
		}
		teclado.close();
		System.out.println("Fin de programa");

	}

}
