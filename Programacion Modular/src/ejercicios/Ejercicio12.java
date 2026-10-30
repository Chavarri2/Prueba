package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 29/10/2026
 * Lectura de datos validada
 * Crea la función int leerEnteroEnRango(Scanner sc, String mensaje, int min, int max).
 * Debe mostrar el mensaje junto con el rango permitido y leer un entero; si el valor está fuera del
 * rango, avisará del error y volverá a pedirlo hasta que sea correcto. Finalmente, lo devuelve.
 * Crea un único Scanner en el main y pásalo como argumento. Utiliza la función para pedir una
 * edad (0-120), una nota (0-10) y un mes (1-12). Ejemplo de ejecución:
 * Edad (0-120): 130
 * Valor fuera de rango. Inténtalo de nuevo.
 * Edad (0-120): 25
 * Nota (0-10): 8
 * Mes de nacimiento (1-12): 3
 * Edad: 25, nota: 8, mes: 3
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner (System.in);
		//Declaramos variables
		int edad,mes;
		double nota;
		//Salida y entrada de datos
		edad=leerEnteroEnRango(teclado,"Edad (0-120)",0,120);
		nota=leerEnteroEnRango(teclado, "Nota (0-10)", 0.0, 10.0);
		mes=leerEnteroEnRango(teclado,"Mes (1-12)",1,12);
		
		System.out.println("Edad: "+edad+" Nota: "+nota+" Mes: "+mes);
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	public static int leerEnteroEnRango(Scanner sc, String mensaje, int min, int max) {
		int respuesta;
		do {
			System.out.println(mensaje);
			respuesta=sc.nextInt();
			if(respuesta<min || respuesta>max) {
				System.err.println("Valor fuera de rango. Inténtalo de nuevo.");
			}
		}while(respuesta<min || respuesta>max);
		return respuesta;
	}
	
	public static double leerEnteroEnRango(Scanner sc, String mensaje, double min, double max) {
		double respuesta;
		do {
			System.out.println(mensaje);
			respuesta=sc.nextDouble();
		}while(respuesta<min || respuesta>max);
		return respuesta;
	}
}