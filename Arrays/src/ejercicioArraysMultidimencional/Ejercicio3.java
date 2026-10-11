package ejercicioArraysMultidimencional;

/*
 * Crea una matriz de 3x3 con valores enteros.
Calcula y muestra:
● La suma de cada fila
● La suma de cada columna
*/
public class Ejercicio3 {

	public static void main(String[] args) {
		// declarar y definir
		int [][]array= new int [3][3];
		llenar(array);
		mosArray(array);
		System.out.println(sumaFila(array[0]));
		impFilas(array);
		impColumnas(array);
	}
	private static void llenar(int [][]array) {
		for(int i=0;i<array.length;i++) {
			for (int j =0;j<array[i].length;j++) {
				array[i][j]=(int)(Math.random()*10+1);
			}
		}
	}
	private static void mosArray(int[][]array) {
		for(int i=0;i<array.length;i++) {
			for (int j =0;j<array[i].length;j++) {
				System.out.printf("%4d",array[i][j]);
			}
			System.out.println("");
		}
	}
	private static int sumaFila(int []array) {
		int suma=0;
		for(int i =0;i<array.length;i++) {
			suma = suma + array[i];
		}
		return suma;
	}
	private static void impFilas(int[][]array) {
		for(int i =0;i<array.length;i++) {
			System.out.println("Suma de la fila "+i+" es "+sumaFila(array[i]));
		}
	}
	private static void impColumnas(int[][]array) {
		int suma=0;
		for (int col=0;col<array.length;col++) {
			for (int fil=0;fil<array.length;fil++) {
				suma=suma+array[fil][col];
			}
			System.out.println("La suma de la columna "+col+" "+" es "+suma);
			suma=0;
		}
	}
}
