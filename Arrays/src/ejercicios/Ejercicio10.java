package ejercicios;

import java.util.Arrays;

/**
 * @author Carlos
 * @version 1.0
 * @since 18/11/2026
 * Escribe un método invertir que reciba un array de enteros y devuelva un array
 * nuevo con los elementos en orden inverso, sin modificar el original.
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		//Declaramos variables
		int[] listaNumeros1=new int[20],listaNumeros2=new int[20];
		rellenarArray(listaNumeros1);
		invertirArray(listaNumeros1);
		System.out.println(Arrays.toString(listaNumeros1));
		System.out.println(Arrays.toString(listaNumeros2));

	}
	//Metodo para invertir una array
	public static int[] invertirArray(int[] lista) {
		int[] listaInvertida=new int[lista.length];
		int contador=0;
		for (int i = listaInvertida.length-1; i > 0; i--) {
			listaInvertida[contador]=lista[i];
			contador++;
		}
		return listaInvertida;
	}
	//Metodo para rellenar un array
	public static void rellenarArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			lista[i]=(int)(Math.random()*100+1);
		}
	}
}
