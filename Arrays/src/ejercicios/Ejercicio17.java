package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Carlos
 * @version 1.0
 * @since 19/11/2026
 * Pide al usuario el tamaño de una matriz cuadrada y sus valores. Muestra su
 * diagonal principal y su diagonal secundaria, e indica si la matriz es
 * simétrica.
 */
public class Ejercicio17 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Inicializamos variables
		int[][] matriz=new int[pedirTamañoMatriz("Introduce el numero de filas ",teclado)][pedirTamañoMatriz("Introduce el numero de Columnas ",teclado)];
		pedirValoresMatriz(matriz, teclado);
		mostrarMatriz(matriz);
		mostrarDiagonalPrincipal("Los numeros de la diagonal principal son: ", matriz);
		mostrarDiagonalSecundaria("Los numeros de la diagonal secundaria son: ", matriz);
		mostrarSiEsSimetrica(matriz);
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	//Metodo que mostrara mensajes si es o no es simetrica
	public static void mostrarSiEsSimetrica(int[][]matriz) {
		if(matriz.length==matriz[0].length) {
			System.out.println("La matriz es simetria");
		}else {
			System.out.println("La matriz no es simetria");
		}
	}
	//Metodo para mostrar la Matriz
	public static void mostrarMatriz(int[][] matriz) {
		for (int[] is : matriz) {
			System.out.println(Arrays.toString(is));	
		}
	}
	//Metodo para mostrar la diagonal secundaria de una matriz cuadrada
		public static void mostrarDiagonalSecundaria(String mensaje, int[][] matriz) {
			System.out.println(mensaje);
			int contador=0;
			for (int i = matriz[0].length-1; i >= 0 ; i--) {
				System.out.print(matriz[contador][i]+" ");
				if(contador<matriz.length-1) {
					contador++;
				}else {
					i=0;
				}
			}
			System.out.println();
		}
	
	//Metodo para mostrar la diagonal principal de una matriz cuadrada
	public static void mostrarDiagonalPrincipal(String mensaje, int[][] matriz) {
		System.out.println(mensaje);
		int contador=0;
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i]+" ");
			if(contador<matriz[0].length-1) {
				contador++;
			}else {
				i=matriz.length;
			}
		}
		System.out.println();
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
