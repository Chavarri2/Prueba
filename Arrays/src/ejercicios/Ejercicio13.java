package ejercicios;

import java.util.Arrays;

/**
 * @author Carlos
 * @version 1.0
 * @since 18/11/2026
 * Escribe un método que reciba un array de enteros e indique si es capicúa, es
 * decir, si se lee igual de izquierda a derecha que de derecha a izquierda.
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		//Declaramos variables
		//int[] lista= {1,2,3,2,1};
		int[] lista=new int[5];
		//Inicializamos variables
		rellenarArray(lista);
		//Salida de datos por pantalla
		if(esCapicua(lista)) {
			System.out.println("La lista "+Arrays.toString(lista)+" es capicua");
		}else {
			System.out.println("La lista "+Arrays.toString(lista)+" no es capicua");
		}
	}
	
	//Metodo para rellenar un array
	public static void rellenarArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			lista[i]=(int)(Math.random()*100+1);
		}
	}

	//Metodo que valida si una lista es o no es capicua
	public static boolean esCapicua(int[] lista) {
		if(lista.length==1) {
			return true;
		}
		for (int i = 0; i < lista.length/2; i++) {
			if(lista[i]!=lista[lista.length-1-i]) {
				return false;
			}
		}
		return true;
	}

}
