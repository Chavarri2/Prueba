package ejercicios;

import java.util.Arrays;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 16/11/2026
 * Declara un array de 5 enteros con los valores 10, 20, 30, 40 y 50 y muestra por
 * pantalla su primer y su último elemento, así como su longitud.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		//Inicializamos variables
		int[] lista= {10,20,30,40,50};
		//Salida de datos
		System.out.println(Arrays.toString(lista));
		//Salida recorriendo el array
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}

}
