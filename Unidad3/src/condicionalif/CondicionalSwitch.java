package condicionalif;

import java.util.Scanner;

/*
 * 26/09/2025
 * David
 * Ejemplo de programa para manejar condicionales
 * con Switch
 * El programa pedira un numero y nos indicara el dia elegido
 */
public class CondicionalSwitch {

	public static void main(String[] args) {
		//declaramos variables
		int diaSemana;
		Scanner teclado=new Scanner (System.in);
		//pedir datos 
		System.out.println("introduce el dia de la semana");
		diaSemana=teclado.nextInt();
		//proceso y salida
		switch (diaSemana) {
		case 1:
			System.out.println("Has elegido el Lunes");
			break;
		case 2:
			System.out.println("Has elegido el Martes");
			break;
		case 3:
			System.out.println("Has elegido el Miercoles");
			break;
		case 4:
			System.out.println("Has elegido el Jueves");
			break;
		case 5:
			System.out.println("Has elegido el Viernes");
			//break; si no pones el break ejecuta hacia abajo hasta encontrar con un break
		case 6:
			System.out.println("Has elegido el Sabado");
			break;
		case 7:
			System.out.println("Has elegido el Domingo");
			break;
		default:
			System.out.println("El dia elegido no es valido");
		}
		teclado.close();
		System.out.println("Fin de programa");
	}

}
