package ejercicios;

import java.util.Arrays;

/**
 * @author Carlos
 * @version 1.0
 * @since 17/11/2026
 * Copia un array en otro sin utilizar los métodos de la clase Arrays. Modifica
 * varios elementos de la copia y demuestra, mostrando ambos arrays, que el
 * original no ha cambiado. Comprueba también qué devuelven == y
 * Arrays.equals al comparar los dos arrays antes y después del cambio.
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		//Declaramos e inicializamos variables
		int[] listaNumeros1=new int[10], listaNumeros2=new int[10];
		rellenarArray(listaNumeros1);
		listaNumeros2=copiarArray(listaNumeros1);
		System.out.println(listaNumeros1==listaNumeros2);
		System.out.println(Arrays.equals(listaNumeros1, listaNumeros2));
		listaNumeros2[0]=1;
		listaNumeros2[3]=1;
		listaNumeros2[2]=1;
		System.out.println("Array 1 " + Arrays.toString(listaNumeros1));
		System.out.println("Array 2 " + Arrays.toString(listaNumeros2));
		System.out.println(listaNumeros1==listaNumeros2);
		System.out.println(Arrays.equals(listaNumeros1, listaNumeros2));
	}
	public static int[] copiarArray(int[] lista) {
		int[]copia= new int[lista.length];
		for (int i = 0; i < copia.length; i++) {
			copia[i]=lista[i];
		}
		return copia;
	}
	//Metodo para rellenar un array
	public static void rellenarArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			lista[i]=(int)(Math.random()*100+1);
		}
	}
}
