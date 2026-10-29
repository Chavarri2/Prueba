package condicionalif;

import java.util.Scanner;

/*
 * Carlos Abraham Chavarri Valera
 * programa para aprender los condicionales if else if
 * introducimos un numero y nos dice si es negativo y 
 * para los positivos si es par o impar
 * Es obligatorio seguir el diagrama de flujo de 
 * los apuntes
 * 25/09/2025
 */
public class condicionalesElseIf {

	public static void main(String[] args) {
		// Definicion de variables
		int dato;
		Scanner scanner = new Scanner(System.in);
		// Entrada de datos
		System.out.println("Dame un dato");
		dato = scanner.nextInt();
		//proceso
		if (dato < 0) {
			System.out.println("El dato es negativo");
		} else if (dato % 2 == 0) {
			System.out.println("El dato es par");
		} else {
			System.out.println("El dato es impar");
		}
		scanner.close();
	}

}
