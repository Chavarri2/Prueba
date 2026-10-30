package ejerciciosSeleccion;

import java.util.Scanner;

/**
 * @author Alumno
 * @version 1.0
 * @since 22/10/2026
 * Pedir dos fechas y mostrar el número de días que hay de diferencia. 
 * Suponiendo todos los meses de 30 días y las fechas introducidas son correctas. 
 */
public class Ejercicio10 {
	//Creamos objeto de la clase Scanner
	public static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Declaramos variables
		int  dias1,dias2,diferencia;
		//Entrada y salida de datos
		System.out.println("Introduce la primera fecha");
		dias1=pedirFechas();
		System.out.println("Introduce la segunda fecha");
		dias2=pedirFechas();
		if(dias1>dias2){
			diferencia=dias1-dias2;
		}else {
			diferencia=dias2-dias1;
		}
		System.out.println("La diferencia de dias es: "+diferencia);
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	
	public static int pedirFechas() {
		int dia,mes,año;
		System.out.println("Introduce el dia");
		dia=teclado.nextInt();
		System.out.println("Introduce el mes");
		mes=teclado.nextInt();
		System.out.println("Introduce el año");
		año=teclado.nextInt();
		
		mes=mes+año*12;
		dia=dia+mes*30;
		return dia;
	}

}
