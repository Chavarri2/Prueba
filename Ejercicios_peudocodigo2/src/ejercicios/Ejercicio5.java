package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 6/10/2026
 *  Hacer un programa que lea un número n y nos escriba en la pantalla mediante un
 *  mensaje si es ó no primo (NOTA: Número primo es aquél que es divisible solo por
 *  si mismo y por, la unidad)
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos e Inicializamos variables
		int num, contador;

		//Salida y entrada de datos
		System.out.println("Introduce un numero");
		num=teclado.nextInt();

		//Llamamos al metodo esPrimo
		contador=esPrimo(num);
		
		//Usamos condicional if para evaluar condicion
		//Si contador es igual que dos entonces mostrara el mensaje es primo, Sino mostrara no es primo
		if(contador==2) {
			System.out.println("El numero "+num+" es primo");
		}else {
			System.out.println("El numero "+num+" no es primo");
		}
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	
	//Metodo para comprobar si un numero es primo o no
	private static int esPrimo(int num) {
		int contador=0;
		//Usamos bucle for que se repetira desde 1 hasta 10
		for (int i = 1; i <= num; i++) {
			//Usamos condicional if y evaluamos la condicion
			//Si el resto de numero tanto por ciento iteracion es igual que cero entonces hacemos contador + 1
			if(num%i==0) {
				contador++;
			}
		}
		return contador;
	}

}
