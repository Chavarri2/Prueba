package ejercicioArraysMultidimencional;

import java.util.Arrays;

/*
 * 10/11/2025
 * carlos abraham chavarri valera
 * Creacion de arrays compuestos*/
public class ArraysCompuestos1 {

	public static void main(String[] args) {
		// definir arrays compuestos
		int [][] arrayCompuesto= {{+1,-2},{+3,+5,-4},{-5,-8,6},{7,8}};
		
		// Acceder a los elementos individuales
		System.out.println(arrayCompuesto[1][0]);
		
		//Acceder a los elementos por filas
		System.out.println(Arrays.toString(arrayCompuesto[0]));
		imprimirArray(arrayCompuesto);
		
	}
	private static void imprimirArray (int [][] arrayCompuesto) {
		//lo recorremos utilizando los indices [f] y [c]
		for (int f=0;f<arrayCompuesto.length;f++) {
			for (int c=0;c<arrayCompuesto[f].length;c++){
				System.out.printf("%+4d",arrayCompuesto[f][c]);
			}
			System.out.println("");
		}
		
		
		
	}
}
