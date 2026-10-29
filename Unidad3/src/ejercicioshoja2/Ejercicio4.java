package ejercicioshoja2;

import java.util.Scanner;

/*Manuel Loren Ferrer
 * 08/10/2025 
 * Escribir un programa que una vez que lea un número n por teclado calcule y escriba
sus divisores por la pantalla. Al finalizar debe incidarnos en numero total de divisores
y si el numero es primo o no*/
public class Ejercicio4 {

	public static void main(String[] args) {
		//declarar variables
		int n, cont = 0;
		String listaDivisores="";
		//Entrada de datos
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce un numero");
		n = tec.nextInt();
		
		//Recorremos en un bucle los numeros entre 1 y n
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {//Si el resto de dividir n entre i es cero i es divisor
				cont++;
				listaDivisores=listaDivisores+ " "+ i;
			}
		}
		
		//imprimir resultados
		System.out.println("Los divisores de "+ n + " son "+ listaDivisores);
		System.out.println("El numero " + n + " tiene " + cont + " divisores");

		if (cont == 2) {
			System.out.println("El numero " + n + " es primo");
		} else {
			System.out.println("El numero " + n + " no es primo");
		}
		
	}

}
