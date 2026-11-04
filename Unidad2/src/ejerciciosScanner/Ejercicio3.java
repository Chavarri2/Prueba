package ejerciciosScanner;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/10/2026
 * Pide al usuario su edad e imprime cuántos años tendrá el año que viene.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int edad;
		
		//Salida y entrada de datos
		System.out.println("Introduzca su edad");
		edad=teclado.nextInt();
		System.out.println("El proximo año tendras "+(edad+1));
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
