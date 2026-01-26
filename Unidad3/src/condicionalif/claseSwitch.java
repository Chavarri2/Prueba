package condicionalif;

import java.util.Scanner;

/*
 * 26/09/2025
 * Carlos Abraham Chavarri Valera
 * Ejemplo de programa para manejar condicionales
 * El programa pedira un numero y nos indicara el dia elegido
 */

public class claseSwitch {

	public static void main(String[] args) {
		// Declaramos variables
		int diaSemana;
		Scanner scanner=new Scanner(System.in);
		// pedir datos
		System.out.println("Escribe el dia de la semana");
		diaSemana=scanner.nextInt();
		//proceso y salida
		switch(diaSemana) {
			case 1:
				System.out.println("Has elegido lunes");
				break;
			case 2:
				System.out.println("Has elegido martes");
				break;		
			case 3:
				System.out.println("Has elegido miercoles");
				break;
			case 4:
				System.out.println("Has elegido jueves");
				break;
			case 5:
				System.out.println("Has elegido viernes");
				break;
			case 6:
				System.out.println("Has elegido sabado");
				break;
			case 7:
				System.out.println("Has elegido domingo");
				break;
			default:
				System.out.println("El dia elegido no es valido");
				break;
		}
		scanner.close();
		System.out.println("Fin de programa");
	}

}
