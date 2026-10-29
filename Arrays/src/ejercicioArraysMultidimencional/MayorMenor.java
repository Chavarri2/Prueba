package ejercicioArraysMultidimencional;
/*
 * Victor Lima
 * 12/11/2025
 * Generar una matriz de 5x5 (numérica entera con números de 0 a 9) e imprimir el valor más grande,
 * el más pequeño y los lugares donde se encuentran.
 */
public class MayorMenor {

	public static void main(String[] args) {
		//declarar array
		int [][] matriz= new int [5][5];
		// llenar array
		llenarArray(matriz);
		// mostrar array
		mostrarArray(matriz);
		// imprimir el mayor y su posicion
		mostrarMayor(matriz);
		// imprimir el menor y su posicion
		mostrarMenor(matriz);
		
	}
	
	private static void llenarArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 10);

			}
		}
	}
	private static void mostrarArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%4d", array[i][j]);
			}
			System.out.println();
		}
	}
	private static void mostrarMayor(int [][]vector) {
		int mayor=vector[0][0];
		int filaMayor=0;
		int colMayor=0;
		for (int i=0; i<vector.length; i++) {
			for (int j=0; j<vector[i].length; j++) {
				if (vector[i][j]>mayor) {
					mayor= vector[i][j];
					filaMayor= i;
					colMayor= j;
				}
			}
		}
		System.out.println("El mayor vale "+mayor+" y se encuentra en la fila "+filaMayor+
				" en la columna"+colMayor);
	}
	private static void mostrarMenor(int [][]vector) {
		int menor=vector[0][0];
		int filaMenor=0;
		int colMenor=0;
		for (int i=0; i<vector.length; i++) {
			for (int j=0; j<vector[i].length; j++) {
				if (vector[i][j]<menor) {
					menor= vector[i][j];
					filaMenor= i;
					colMenor= j;
				}
			}
		}
		System.out.println("El menor vale "+menor+" y se encuentra en la fila "+filaMenor+
				" en la columna"+colMenor);
	}
}
