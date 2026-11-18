package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Carlos
 * @version 1.0
 * @since17/11/2026
 * Rellena un array de 20 posiciones con números aleatorios entre 1 y 100.
 * Muéstralo con Arrays.toString, ordénalo y vuelve a mostrarlo. Después, pide
 * un número al usuario y busca su posición con Arrays.binarySearch.
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos e Inicializamos variasbles
		int numero;
		int[] listaNumeros=new int[20];
		listaNumeros=rellenarArray(listaNumeros);
		//Salida de datos
		System.out.println(Arrays.toString(listaNumeros));
		//Ordenamos el array
		Arrays.sort(listaNumeros);
		//Salida y entrada de datos
		System.out.println(Arrays.toString(listaNumeros));
		System.out.println("Introduce un numero");
		numero=teclado.nextInt();
		System.out.println(Arrays.binarySearch(listaNumeros, numero));
		//Crerramos objeto de la clase Scanner
		teclado.close();
	}

	//Metodo para rellenar un array
	public static int[] rellenarArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			lista[i]=(int)(Math.random()*100+1);
		}
		return lista;
	}

}
