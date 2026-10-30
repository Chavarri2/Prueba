package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 29/10/2026
 * Fechas válidas
 * Crea los siguientes métodos: boolean esBisiesto(int anio) (un año es bisiesto si es divisible
 * entre 4 y no entre 100, o si es divisible entre 400); int diasDelMes(int mes, int anio),
 * resuelto con un switch; boolean esFechaValida(int dia, int mes, int anio); y el
 * procedimiento mostrarDiaSiguiente(int dia, int mes, int anio).
 * El main pedirá el día, el mes y el año reutilizando leerEnteroEnRango del ejercicio anterior. Si la
 * fecha es válida, mostrará el día siguiente; si no, indicará que no existe.
 * Pruébalo al menos con estas fechas: 29/2/2024, 29/2/2023, 31/4/2026, 31/12/2026 y 28/2/1900.
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int anio, mes,dia;
		anio=leerEnteroEnRango(teclado, "Ingresa el año", 0, 99999999);
		mes=leerEnteroEnRango(teclado, "Introduce el mes (1-12)", 1, 12);
		dia=leerEnteroEnRango(teclado, "Introduce el dia (formato numerico)", 1, diasDelMes(mes, anio));
		if(esFechaValida(dia, mes, anio)) {
			System.err.println("Error: fecha invalida intente de nuevo");
		}else {
			mostrarDiaSiguiente(dia, mes, anio);
		}
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
	
	public static void mostrarDiaSiguiente(int dia, int mes, int anio) {
		int diaSiguiente=dia, mesSiguiente=mes, anioSiguiente=anio;
		if(diaSiguiente>0 && mesSiguiente>0) {
			diaSiguiente++;
			do {
				if(diaSiguiente>diasDelMes(mes, anio)) {
					mesSiguiente++;
					diaSiguiente=1;
				}else if(mesSiguiente>12) {
					anioSiguiente++;
					mesSiguiente=1;
				}
			}while(diaSiguiente>diasDelMes(mes, anio)||mesSiguiente>12);
			System.out.printf("%02d/%02d/%02d", diaSiguiente, mesSiguiente, anioSiguiente);
		}
		
	}
	
	public static boolean esFechaValida(int dia, int mes, int anio) {
		if(dia==diasDelMes(mes, anio) && dia>= 1 && dia<=12) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean esBisiesto(int anio) {
		return anio%4==0 && (anio%100!=0 || anio%400==0);
	}
	
	public static int diasDelMes(int mes, int anio) {
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			return 31;
		case 2:
			if(esBisiesto(anio)){
				return 29;
			}else {
				return 28;
			}
		case 4, 6, 9, 11:
			return 30;
			
		default:
			System.err.println("Error: Mes no valido");
			break;
		}
		return 0;
	}
}