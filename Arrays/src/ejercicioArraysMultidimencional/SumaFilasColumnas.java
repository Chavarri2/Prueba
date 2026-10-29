package ejercicioArraysMultidimencional;

/*Manuel Loren Ferrer
 * 12/11/2025
 * Sumar filas y columnas de una matriz 3x3*/
public class SumaFilasColumnas {

	public static void main(String[] args) {
		// Declarar el array
		int[][] array = new int[3][3];
		// LLenamos el array de numeros aleatorios
		llenarArray(array);
		// imprimimos array
		mostrarArray(array);
		imprimeSumaFilas(array);
		imprimeSumaColumnas(array);
	}

	private static void llenarArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 10 + 1);

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

	private static int sumaFila(int[] array) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}
		return suma;

	}

	private static void imprimeSumaFilas(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Suma de la fila " + i + " es " + sumaFila(array[i]));
		}
	}

	private static void imprimeSumaColumnas(int[][] array) {
		int suma = 0;
		for (int col = 0; col < array.length; col++) {
			for (int fil = 0; fil < array.length; fil++) {
				suma = suma + array[fil][col];
			}
			System.out.println("Suma de la columna " + col + " es " + suma);
			suma = 0;
		}
	}
}
