package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Carlos
 * @version 1.0
 * @since 18/11/2026
 * Escribe un método contarApariciones que reciba un array de enteros y un
 * valor, y devuelva cuántas veces aparece ese valor en el array.
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int[] listaNumeros=new int[20];
		int numero;
		//Inicializamos variables
		rellenarArray(listaNumeros);
		//Salida y entrada de datos
		System.out.println(Arrays.toString(listaNumeros));
		System.out.println("¿De que numero quiere saber cuantas veces se repite?");
		numero=teclado.nextInt();
		if(aparicionesNumero(numero, listaNumeros)>0) {
			System.out.println("El numero '"+numero+"' aparece "+aparicionesNumero(numero, listaNumeros)+" vez");
		}else {
			System.out.println("El numero '"+numero+"' no aparece");
		}

		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

	//Metodo para rellenar un array
	public static void rellenarArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			lista[i]=(int)(Math.random()*100+1);
		}
	}

	//Metodo que devuelve cuantas veces aparece un mismo numero en el array
	public static int aparicionesNumero(int numero, int[] lista) {
		int apariciones=0;
		for (int i : lista) {
			if(i==numero) {
				apariciones++;
			}
		}
		return apariciones;
	}
}
