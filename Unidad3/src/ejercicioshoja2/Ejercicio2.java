package ejercicioshoja2;

import java.util.Scanner;

/*
 * Daniel Ionut Carindatoiu
 * 08/10/2025
 * Calcular la suma de los cuadrados de los números pares comprendidos entre 1 y n 
 * donde n es una variable que se leerá del exterior por el teclado.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		//Def. Variables
		int n;
		double suma = 0;
		Scanner teclado = new Scanner(System.in);
		
		//entrada de datos
		
		System.out.println("Introduce un numero");
		n = teclado.nextInt();
		
		//proceso
		
		for(int i = 1; i <= n; i++) {
			
			if(i%2 == 0) { suma = suma + Math.pow(i, 2); }
		}
		
		System.out.println(" La suma de los numeros de 1 hasta " + n + " es: " + suma);

		teclado.close();
	}

}
