package ejerciciosArray1;

import java.util.Arrays;

/*Miguel Chaves
 * 14/11/2025
 * Genera un array de 5 componentes con numeros aleatorios entre 1 y 10 y crea un metodo 
 * que copie el array añadiendo un elemento con la suma de los elementos del array primitivo
 */
public class CopiarArrays {

	public static void main(String[] args) {
		// Crear array y rellenarlo
		int [] vector1=new int [5];
		int [] vectorCopia= new int [vector1.length+1];
		llenarVector(vector1);
		mostrarVector(vector1);
		vectorCopia= copiaVector(vector1); 
		mostrarVector(vectorCopia);
	}
	private static void llenarVector(int[]vector) {
		for(int i=0;i<vector.length;i++) {
			vector[i]=(int)(Math.random()*5+1);
		}
	}
	private static void mostrarVector(int[]vector) {
		for(int i=0;i<vector.length;i++) {
			System.out.printf("%4d",vector[i]);
		}
		System.out.println("");
	}
	/*
	 * Metodo que recibe un vector y genera una copia del vector con una componente mas
	 * cuyo valor es las sumas de los componentes del vector primitivo
	 */
	private static int[]copiaVector(int []v1) {
		int []resultado=Arrays.copyOf(v1, v1.length+1);
		resultado[resultado.length-1]=sumarVector(v1);
		return resultado;
	}
	/*
	 * Metodo que le paso un vector y me devuelve un entero con la suma de sus componentes
	 */
	private static int sumarVector (int []v) {
		int suma=0;
		for(int i=0;i<v.length;i++) {
			suma=suma+v[i];
		}
		return suma;
	}
}
