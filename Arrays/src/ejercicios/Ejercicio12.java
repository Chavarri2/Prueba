package ejercicios;

import java.util.Arrays;

/**
 * @author Carlos
 * @version 1.0
 * @since 18/11/2026
 * Escribe un método rotarDerecha que desplace una posición a la derecha
 * todos los elementos de un array, de modo que el último pase a ser el primero,
 * modificando el propio array recibido.
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		//Declaramo variable
		int[] lista= new int[10];
		//Inicializamos variable
		rellenarArray(lista);
		System.out.println(Arrays.toString(lista));
		rotarDerecha(lista);
		System.out.println(Arrays.toString(lista));
	}
	
	//Metodo para rotar una posicion a la derecha (cuando llega al ultimo el ultimo pasa al primero)
	public static void rotarDerecha(int[] lista) {
		int ultima=lista[lista.length-1];
		for (int i = lista.length-1; i > 0; i--) {
			lista[i]=lista[i-1];
		}
		lista[0]=ultima;
	}

	//Metodo para rellenar un array
	public static void rellenarArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			lista[i]=(int)(Math.random()*100+1);
		}
	}
}
