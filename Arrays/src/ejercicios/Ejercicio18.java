package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 19/11/2026
 * Escribe un método trasponer que reciba una matriz de cualquier número de
 * filas y columnas y devuelva su matriz traspuesta
 */
public class Ejercicio18 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Inicializamos variables
		int[][] matriz=new int[pedirTamañoMatriz("Introduce el numero de filas ",teclado)][pedirTamañoMatriz("Introduce el numero de Columnas ",teclado)];
		pedirValoresMatriz(matriz, teclado);
		mostrarMatriz(matriz);
		System.out.println();
		mostrarMatriz(trasponer(matriz));

		//Cerramos objeto de la clase Scanner
		teclado.close();	
	}
	//Metodo para transponer matriz
	public static int[][] trasponer(int[][]matriz) {
		int[][] matrizTraspuesta=new int[matriz[0].length][matriz.length];
		for (int i = 0; i < matrizTraspuesta.length; i++) {
			for (int j = 0; j < matrizTraspuesta.length; j++) {
				matrizTraspuesta[i][j]=matriz[j][i];
			}
		}
		
		return matrizTraspuesta;
	}
	//Metodo para mostrar la Matriz
	public static void mostrarMatriz(int[][] matriz) {
		for (int[] is : matriz) {
			System.out.println(Arrays.toString(is));	
		}
	}

	//Metodo para asignar un valor a cada elemento de la matriz
	public static void pedirValoresMatriz(int[][] matriz, Scanner teclado) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Introduce el valor la fila "+(i+1)+" y la columna "+(j+1));
				matriz[i][j]=teclado.nextInt();
			}
		}
	}

	//Metodo para pedir el tamaño de la matriz
	public static int pedirTamañoMatriz(String mensaje, Scanner teclado) {
		//Declaramos variables
		int numero;
		//Salida y entrada de datos
		do {
			System.out.println(mensaje);
			System.out.println("Introduce el tamaño de la matriz");
			numero=teclado.nextInt();
			if(numero<1) {
				System.out.println("Error: el valor ingresado no es valido");
			}
		}while(numero<1);
		return numero;
	}
}
