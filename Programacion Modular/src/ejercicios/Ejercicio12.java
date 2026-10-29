package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos
 * @version 1.0
 * @since 29/10/2026
 * Lectura de datos validada
 * Crea la función int leerEnteroEnRango(Scanner sc, String mensaje, int min, int max).
 * Debe mostrar el mensaje junto con el rango permitido y leer un entero; si el valor está fuera del
 * rango, avisará del error y volverá a pedirlo hasta que sea correcto. Finalmente, lo devuelve.
 * Crea un único Scanner en el main y pásalo como argumento. Utiliza la función para pedir una
 * edad (0-120), una nota (0-10) y un mes (1-12). 
 */
public class Ejercicio12 {
	
	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int edad,mes;
		double nota;
		//Llamamos al metodo leerEnteroEnRango
		edad=leerEnteroEnRango(teclado, "Edad (0-130)", 0, 120);
		nota=leerEnteroEnRango(teclado, "Nota (0-10)", 0.0, 10.0);
		mes=leerEnteroEnRango(teclado, "Mes (1-12)", 1, 12);
		
		//Salida de datos
		System.out.println("Edd: "+edad+" Nota: "+nota+" Mes"+mes);
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	public static int leerEnteroEnRango(Scanner sc, String mensaje, int min, int max) {
		int numero;
		do {
			System.out.println(mensaje);
			numero=sc.nextInt();
			if(numero>min && numero<max) {
				System.out.println();
			}else {
				System.err.println("Error: valor fuera de rango. Intentalo de nuevo");
			}
		}while(numero<min || numero>max);
		
		return numero;
	}
	
	public static double leerEnteroEnRango(Scanner sc, String mensaje, double min, double max) {
		double numero;
		do {
			System.out.println(mensaje);
			numero=sc.nextDouble();
			if(numero>min && numero<max) {
				System.out.println();
			}else {
				System.err.println("Error: valor fuera de rango. Intentalo de nuevo");
			}
		}while(numero<min || numero>max);
		
		return numero;
	}
}
