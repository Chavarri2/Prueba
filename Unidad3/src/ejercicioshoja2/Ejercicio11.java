package ejercicioshoja2;

import java.util.Scanner;

/*Manuel Loren Ferrer
 * 16/10/2025
 *  Se define el factorial de un número n como:
n*(n-1)*(n-2)*.......*3*2*1. Hacer un programa que lea un número n
filtrando que sea mayor que cero y calcule su factorial*/
public class Ejercicio11 {

	public static void main(String[] args) {

		// declaramos variable
		int n;// para almacenar el numero que introducimos por tec
		long fact = 1;// para almacenar el factorial
		// pedimos numero
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce un numero mayor que cero");
		n = tec.nextInt();
		// validamos el numero
		while (n <= 0) {
			System.out.println("Error el numero debe ser mayor que cero");
			n = tec.nextInt();
		}
		// calculamos factorial
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		//imprimimos resultados
		System.out.println("El factorial de "+n+" vale "+fact);
		tec.close();
	}

}
