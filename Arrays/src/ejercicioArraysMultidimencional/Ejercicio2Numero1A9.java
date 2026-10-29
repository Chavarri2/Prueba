package ejercicioArraysMultidimencional;
/*10/11/2025
 * carlos abraqham chavarri valera
 * Crea una matriz de 3x3 con los números del 1 al 9. 
Muestra los valores y calcula la suma total de todos los elementos. */
public class Ejercicio2Numero1A9 {

	public static void main(String[] args) {
		// Declarar y definicion de matriz/vector
		int [][]numeros= {{1,2,3},{4,5,6},{7,8,9}};
		
		//Mostrar los valores
		imprimirArray(numeros);
		System.out.println("la suma vale "+sumaArray(numeros));
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
	//Metodo al que le paso una matriz como argumento y me devuelve la suma de sus elementos
	private static int sumaArray(int [][]arrayCompuesto) {
		int suma=0;
		//lo recorremos utilizando los indices [f] y [c]
		for (int f=0;f<arrayCompuesto.length;f++) {
			for (int c=0;c<arrayCompuesto[f].length;c++){
				suma=suma+arrayCompuesto[f][c];
			}
		}
		return suma;
	}
}
