package ejercicicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/10/2026
 * Escribir un programa que vaya pidiendo números hasta que el usuario introduzca un
 * cero. Cuando termine tiene que mostrar la suma de todos los números introducidos
 * y cuántos números se han introducido en total (el 0 no cuenta).
 */

public class Ejercicio19 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos e inicializamos variables variables
		int num,suma=0,contador=0;
		
		//Entrada y salida de datos
		System.out.println("Introduce un numero");
		num=teclado.nextInt();
		//Bucle while que se reperita mientra num sea distinto de 0
		while(num!=0) {
			//Operaciones
			contador++;
			suma=suma+num;
			//Salida y entrada de datos
			System.out.println("Introduce un numero");
			num=teclado.nextInt();
		}
		System.out.println("Has introducido "+contador);
		System.out.println("La suma de todos los numeros introducidos es "+suma);
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
