package condicionales;

import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		// Declaramos variables
		int mes;
		Scanner scanner=new Scanner(System.in);
		// pedir datos
		System.out.println("Escribe el numero de mes");
		mes=scanner.nextInt();
		//proceso y salida
		switch(mes) {
			case 1:
				System.out.println("Es enero");
				break;
			case 2:
				System.out.println("Es febrero");
				break;		
			case 3:
				System.out.println("Es marzo");
				break;
			case 4:
				System.out.println("es abril");
				break;
			case 5:
				System.out.println("es mayo");
				break;
			case 6:
				System.out.println("Es junio");
				break;
			case 7:
				System.out.println("Es julio");
				break;
			case 8:
				System.out.println("Es agosto");
				break;
			case 9:
				System.out.println("Es septiembre");
				break;	
			case 10:
				System.out.println("Es octubre");
				break;
			case 11:
				System.out.println("Es noviembre");
				break;
			case 12:
				System.out.println("Es diciembre");
				break;
			default:
				System.out.println("El mes elegido no es valido");
				break;
		}
		scanner.close();
		System.out.println("Fin de programa");

	}

}
