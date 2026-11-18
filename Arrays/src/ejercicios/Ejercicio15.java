package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Carlos
 * @version 1.0
 * @since 18/11/2026
 * Escribe un método insertarOrdenado que reciba un array ordenado y un
 * valor, y devuelva un array nuevo con una posición más, en el que el valor
 * quede insertado manteniendo el orden.
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int[] lista=new int[10];
		int numero;
		//Operaciones
		rellenarArray(lista);
		Arrays.sort(lista);
		//Salida y entrada de datos
		System.out.println("La lista tiene los siguientes numeros: \n"+Arrays.toString(lista));
		System.out.println("Introduzca un numero");
		numero=teclado.nextInt();
		//Operaciones
		lista=insertarOrdenado(lista, numero);
		//Salida de datos
		System.out.println(Arrays.toString(lista));
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	
	//Metodo para insertar un numero 
	public static int[] insertarOrdenado(int[]lista, int numero) {
		int[] listaNueva=new int[lista.length+1];
		listaNueva[listaNueva.length-1]=numero;
		for (int i = 0; i < lista.length; i++) {
			listaNueva[i]=lista[i];
		}
		Arrays.sort(listaNueva);
		return listaNueva;
	}
	//Metodo para rellenar un array
		public static void rellenarArray(int[] lista) {
			for (int i = 0; i < lista.length; i++) {
				lista[i]=(int)(Math.random()*100+1);
			}
		}
}
