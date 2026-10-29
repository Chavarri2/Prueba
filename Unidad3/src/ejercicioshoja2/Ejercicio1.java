package ejercicioshoja2;

import java.util.Scanner;

/*
 * Carlos Abraham Chavarri Valera
 * 8/10/2025
 * Escribir un programa que calcule e imprima la SUMA de los números impares
comprendidos entre a y b que deben leerse por teclado y filtrarse para que a<=b
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		// Declarar variables
		int a,b,sumaImpar=0;
		Scanner teclado=new Scanner(System.in);
		//Entrada de datos
		System.out.println("Introduce un numero: ");
		a=teclado.nextInt();
		System.out.println("Introduce un numero mayor que el anterior: ");
		b=teclado.nextInt();
		/*if (!(a<=b)) {
			System.out.println("Error");
			System.exit(1); (forma no recomendada de acabar un programa)
		}
		*/
		// Proceso (solo funciona si a<b)
		while (a>b) {
			System.out.println("Numeros erroneos el primero debe ser menor que el segundo ");
			System.out.println("Introduce un numero: ");
			a=teclado.nextInt();
			System.out.println("Introduce un numero mayor que el anterior: ");
			b=teclado.nextInt();
		}
		//En este punto del programa es seguro que "a" es menor que "b"
		for (int i = a; i <= b; i++) {
			if (i%2!=0) {
				sumaImpar=sumaImpar+i;
			}
		}
		System.out.println("La suma de los numeros impares entre "+a+" y "+b+" vale: "+ sumaImpar);
		teclado.close();
		System.out.println("Fin de programa");
		
				
	}

}
