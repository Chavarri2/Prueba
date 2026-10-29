package ejercicioArraysMultidimencional;
/*Ejercicio 7: 
Crea una matriz identidad de tamaño 4x4 (unos en la diagonal principal y ceros en el resto). 
Muéstrala en consola. 
Carlos Abraham Chavarri Valera
17/11/2025*/
public class Ejercicio7 {

	public static void main(String[] args) {
		// definir
		int matriz[][]=new int[4][4];
		rellenarMatriz(matriz);
		imprimirArray(matriz);
	}
	private static void rellenarMatriz(int [][]matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(i==j) {
					matriz[i][j]=1;
				}else {
					matriz[i][j]=0;
				}
			}
		}
	}
	private static void imprimirArray (int [][] arrayCompuesto) {
		//lo recorremos utilizando los indices [f] y [c]
		for (int f=0;f<arrayCompuesto.length;f++) {
			for (int c=0;c<arrayCompuesto[f].length;c++){
				System.out.printf("%4d",arrayCompuesto[f][c]);
			}
			System.out.println("");
		}	
	}

}
