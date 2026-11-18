package ejercicios;

import java.util.Arrays;

/**
 * @author Carlos
 * @version
 * @since
 * 
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		//Declaramos variables
		int[] listaNumeros1=new int[10],listaNumeros2=new int[10];
		//Inicializamos variables
		rellenarArray(listaNumeros1);
		rellenarArray(listaNumeros2);
		//Salida de datos
		System.out.println(Arrays.toString(listaNumeros1));
		System.out.println(Arrays.toString(listaNumeros2));
		System.out.println(Arrays.toString(concatenarArrays(listaNumeros1, listaNumeros2)));
		
	}
	//Metodo para concatenar arrays
	public static int[] concatenarArrays(int[] lista1, int[] lista2) {
		int[] listaConcatenada=new int[lista1.length+lista2.length];
		for (int i = 0; i < listaConcatenada.length; i++) {
			if(i<lista1.length) {
				listaConcatenada[i]=lista1[i];
			}else {
				listaConcatenada[i]=lista2[i-lista1.length];
			}
		}
		return listaConcatenada;
	}
	//Metodo para rellenar un array
	public static void rellenarArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			lista[i]=(int)(Math.random()*100+1);
		}
	}
}
