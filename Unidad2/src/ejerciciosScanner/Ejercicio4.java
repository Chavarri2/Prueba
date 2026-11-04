package ejerciciosScanner;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/10/2026
 * Pide la base y la altura y muestra el área (base × altura).
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		double base,altura;
		
		//Salida y entrada de datos
		System.out.println("Introduce la base");
		base=teclado.nextDouble();
		System.out.println("Introduce la altura");
		altura=teclado.nextDouble();
		System.out.println("El area es: " + (base*altura));
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
