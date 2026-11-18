package ejercicios;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Carlos
 * @version 1.0
 * @since 18/11/2026
 * Crea una matriz de 3 filas y 4 columnas con números aleatorios entre 1 y 50.
 * Muéstrala en forma de tabla y calcula la suma de cada fila y la suma de cada
 * columna.
 */
public class Ejercicio16 {

	public static void main(String[] args) {
		//Declaramos variables
		int[][] matriz=new int[3][4];
		rellenarMatriz(matriz);
		mostrarArrays(matriz);
		System.out.println(Arrays.toString(sumarColumnas(matriz)));
		
	}
	
	//Metodo para sumar filas
	public static int[] sumarFilas(int[][] matriz) {
		int[]lista=new int[matriz.length];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				lista[i]=lista[i]+matriz[i][j];
			}
		}
		return lista;
	}
	
	//Metodo para sumar columnas
	public static int[] sumarColumnas(int[][] matriz) {
		
		int[] lista= new int[matriz[1].length];
		
		for (int i = 0; i < matriz.length; i++) {
			
				
				lista[i]+=matriz[i][i];
				
			
			
		}
		
		return lista;
	}

	//Metodo para mostrar array
	public static void mostrarArrays(int[][] matriz) {
		for (int[] is : matriz) {
			System.out.println(Arrays.toString(is));	
		}
	}
	//Metodo para rellenar una matriz con filas y columnas
	public static void rellenarMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]=(int)(Math.random()*50+1);
			}
		}
	}

}
