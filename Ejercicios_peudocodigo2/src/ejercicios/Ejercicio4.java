package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 6/10/2026
 * Escribir un programa que una vez que lea un número n por teclado calcule y escriba
 * sus divisores por la pantalla
 */
public class Ejercicio4 {
	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int num;
		//Salida y entrada de datos
		System.out.println("Introduce un numero");
		num=teclado.nextInt();
		//Llamamos al metodo divisoresNumero
		divisoresNumero(num);
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	
	//Metodo que muestra los divisores de un numero
	private static void divisoresNumero(int num) {
		System.out.println("===============================");
		System.out.println("Los divisores de "+num+" son:");
		//Usamos condicional para que no ingresen numeros que sean igual o menor que 0
		if(num>0) {
			//Bucle for que se repite desde 1 hasta numero introducido por el usuario
			for (int i = 1; i <= num; i++) {
				//Si el resto del numero entre la iteracion es igual a 0 entonces escribe
				//Que esa iteracion es un divisor
				if(num%i==0) {
					System.out.println(i);
				}
			}
			//Sino entra al if muestra un mensaje de error
		}else {
			System.err.println("Error: El numero debe ser mayor que 0");
		}
		System.out.println("===============================");
		
	}
}
