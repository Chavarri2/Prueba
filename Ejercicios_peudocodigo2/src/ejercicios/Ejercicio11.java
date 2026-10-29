package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 8/10/2026
 * Se define el factorial de un número n como:
 * n*(n-1)*(n-2)*.......*3*2*1. Hacer un programa que lea un número n
 * filtrando que sea mayor que cero y calcule su factorial
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		//Creamos un objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos e inicializamos variables
		int num,factorial=1;
		//Salida y entrada de datos
		System.out.println("Introduce un numero");
		num=teclado.nextInt();
		//Usamos condicional if y evaluamos condicion
		//Si numero ingresado por el usuario es mayor que cero entonces entramos al bucle for
		if(num>0) {
			//Usamos bucle for que se repetira hasta que num mayor que uno
			for (int i = num; i >= 1; i--) {
				//Calculamos el factorial
				factorial=factorial*i;
			}
			//Salida de factorial por consola
			System.out.println("El factorial del numero "+num+" es: "+factorial);
		}else {
			//Salida de mensaje de error por consola
			System.err.println("Error: el numero no pueder ser igual o menor que cero");
		}
		
		//Cerramos objeto de clase Scanner
		teclado.close();
	}

}
