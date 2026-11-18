package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 16/112026
 * Pide un número al usuario e indica si está en el array. Si está, muestra la
 * posición de su primera aparición; si no, muestra un mensaje indicándolo.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos e Inicializamos variables
		int numero;
		int[] lista= new int[20];
		rellenarArray(lista);
		//Salida y entada de datos
		System.out.println("Introduce un numero");
		numero=teclado.nextInt();
		System.out.println(Arrays.toString(lista));
		if(estaNumero(numero, lista)) {
			System.out.println("El numero esta en el array");
			System.out.println("El numero "+numero+" esta en la posicion: "+posicionNumero(lista, numero));
		}else {
			System.out.println("El numero "+numero+" no esta en en el array");
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
	
	//Metodo para saber la posicion del numero
	public static int posicionNumero(int[] lista, int numero) {
		int posicion = 0;
		for (int i = 0; i < lista.length; i++) {
			if(lista[i]==numero) {
				posicion= i;
			}
		}
		return posicion;
	}
	
	//Metodo para comprobar que el numero esta en el array
	public static boolean estaNumero(int numero, int[]lista) {
		for (int i : lista) {
			if(i==numero) {
				return true;
			}
		}
		return false;
	}
}
