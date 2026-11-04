package ejerciciosScanner;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/10/2026
 * Lee una temperatura en grados Celsius y conviértela a Fahrenheit con la fórmula:
 * F = C * 9/5 + 32
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		double celsius, fahrenheit;
		
		//Entrada y salida de datos
		System.out.println("Introduce la temperatura en celcius");
		celsius=teclado.nextDouble();
		
		//Operaciones
		fahrenheit= celsius* 9/5 + 32;
		
		//Salida de datos
		System.out.println("La temperatura en grados fahrenheit "+fahrenheit);
		
		//Cerramos objeto de la clase Scanner
		teclado.close();

	}

}
