package ejercicioString;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 7/11/2026
 * Escribe un programa que genere el número de números aleatorios 
 * que queramos y los guarde en un string y luego lo muestre por pantalla.
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos e Inicializamos variables
		int numero;
		StringBuilder listaNumeros= new StringBuilder();
		//Salida y entrada de datos
		System.out.println("Introduce el numero de numeros aleatorios");
		numero=teclado.nextInt();
		for (int i = 0; i < numero; i++) {
			listaNumeros.append("\n").append(numeroAleatorio());
		}
		System.out.println("Los numeros aleatorios son: ");
		System.out.println(listaNumeros);
		//Cerramos objetos de la clase Scanner
		teclado.close();
	}
	
	public static int numeroAleatorio() {
		return (int) (Math.random()*1000+1);
	}

}
