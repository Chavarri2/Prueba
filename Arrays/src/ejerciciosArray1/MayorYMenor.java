package ejerciciosArray1;

import java.util.Arrays;

/*Leer un vector de 10 componentes y calcular el más grande y el más  pequeño de ellos y los 
lugares donde se encuentran. */
public class MayorYMenor {

	public static void main(String[] args) {
		int[] vector = new int[10];
		llenarArray(vector);
		imprimirVector(vector);
		mayorMenor(vector);
		System.out.println(Arrays.toString(mayorMenor2(vector)));
	}
	//Llena el vector de numeros aleatorios
	private static void llenarArray(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * 20 + 1);
		}
	}

		//imprime el vector
	private static void imprimirVector(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%4d", vector[i]);
		}
		System.out.println();
	}

	//Calcula el mayor y el menor y sus popsiciones y las imprime
	//Seria mas correcto separar los metodos en uno que se necargue del calculo y otro de imprimir
	private static void mayorMenor(int[] vector) {
		int mayor = vector[0];
		int menor = vector[0];
		int posMayor = 0;
		int posMenor = 0;
		for (int i = 0; i < vector.length; i++) {
			if (mayor < vector[i]) {
				mayor = vector[i];
				posMayor = i;
			}
			if (menor > vector[i]) {
				menor = vector[i];
				posMenor = i;
			}

		}
		System.out.println("El numero mayor es: " + mayor + " y su posicion es " + posMayor);
		System.out.println("El numero menor es: " + menor + " y su posicion es " + posMenor);
	}
	
	//Separar la impresion de resultados del calculo
	//Generar un metodo que te devuelva un int[]array
	//resultado[0] numero mayor
	//resultado[1] posicion mayor
	//resultado [2] numero menor
	//resultado[3] posicion menor
	private static int[] mayorMenor2(int[] vector) {
		int [] resultado=new int[4];
		//inicializar los valores de los nuemeros mayor y menor y sus posiciones
		resultado [0]=vector[0];
		resultado[1]=0;
		resultado[2]=vector[0];
		resultado[3]=0;
		//resultado[]
		
		for (int i = 0; i < vector.length; i++) {
			if (resultado[0] < vector[i]) {
				resultado[0] = vector[i];
				resultado [1] = i;
			}
			if (resultado[2] > vector[i]) {
				resultado[2] = vector[i];
				resultado[3] = i;
			}

		}
		return resultado;
	}
}
