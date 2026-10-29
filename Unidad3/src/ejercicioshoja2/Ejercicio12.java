package ejercicioshoja2;

import java.util.Scanner;

/*
 * Luis Lopez Jurado 
 * 16/10/2025
 * Un número se dice que es perfecto cuando la suma de sus divisores excluido él es
igual a dicho número. Hacer un programa que lea un número y nos diga si es ó no
perfecto
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		//Declaramos variables
		int numero,sumaDivisores=0;

		// pedimos numero
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce un numero mayor que cero");
		numero = tec.nextInt();
		// validamos el numero
		while (numero <= 0) {
			System.out.println("Error el numero debe ser mayor que cero");
			numero = tec.nextInt();
		}
		//Con un for vamos sumando los divisores 
		for(int i=1; i < numero; i++) {
			if (numero%i==0) {
				sumaDivisores= sumaDivisores+i;
			}
		}
		if(sumaDivisores==numero) {
			System.out.println("El numero " +numero+ " es perfecto");
		}else {
			System.out.println("El numero no es perfecto");
		}
		tec.close();

	}

}
