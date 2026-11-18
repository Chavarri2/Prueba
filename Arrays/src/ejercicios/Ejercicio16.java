package ejercicios;

import java.util.Arrays;

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
	/*public static int[] sumarColumnas(int[][] matriz) {		
		int[] lista= new int[matriz[0].length];
		//Se pone para que recorrar la logitud de las columnas
		for (int i = 0; i < matriz[0].length; i++) {
			for (int j=0;j< matriz.length;j++) {
				lista[i]+=matriz[j][i];
			}
		}
		
		return lista;
	}*/
	
	public static int[] sumarColumnas(int[][] matriz) {		
		int[] lista= new int[matriz[0].length];
		
		int contador=0;
		int contador2=0;
		
		//Se pone para que recorrar la logitud de las columnas
		for (int i = 0; i < matriz[0].length; i++) {
			
			if (i%matriz[0].length-1==0 && i>0) {
				i=0;
				contador++;
			}
				
			if(contador>=matriz[0].length) {
				contador=0;
			}
				
			lista[contador]+=matriz[i][contador];
			
			contador2++;
			
			if (contador2==matriz[0].length*matriz.length) {
				i=contador2;
			}
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
