package ejercicicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 30/9/2026
 * Numero que pide un numero por consola y muestra por pantalla dicho numeros sumandole 10
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		//Crear nuevo escaner de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		
		// Definir variables, inicializamos la variable suma a 10
		int num, suma=10;
		
		//Mostramos un mensaje por pantalla que pide al usuari que introduzca un nuemro por consola
		System.out.println("Introduzca un numero");
		
		//Asignamos el numero ingresado por consola a una variable
		num=teclado.nextInt();
		
		//Hacemos la operacion de sumar 10 a la variable que tenemos
		suma=suma+num;
		
		//Mostramos por pantalla el resultado
		System.out.println("El numero introducido al sumarle diez es: "+suma);
		
		//Cerramos la variable de la clase Scanner
		teclado.close();
	}

}
