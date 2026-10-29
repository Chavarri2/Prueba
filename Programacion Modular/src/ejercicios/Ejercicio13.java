package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version
 * @since
 * Crea los siguientes métodos: boolean esBisiesto(int anio) (un año es bisiesto si es divisible
 * entre 4 y no entre 100, o si es divisible entre 400); int diasDelMes(int mes, int anio),
 * resuelto con un switch; boolean esFechaValida(int dia, int mes, int anio); y el
 * procedimiento mostrarDiaSiguiente(int dia, int mes, int anio).
 * Página 4 de 4
 * El main pedirá el día, el mes y el año reutilizando leerEnteroEnRango del ejercicio anterior. Si la
 * fecha es válida, mostrará el día siguiente; si no, indicará que no existe.
 * Pruébalo al menos con estas fechas: 29/2/2024, 29/2/2023, 31/4/2026, 31/12/2026 y 28/2/1900.
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner (System.in);
		
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	
	public static boolean esBisiesto(int anio) {
		return anio/4==0 && !(anio/100==0);
	}

}
