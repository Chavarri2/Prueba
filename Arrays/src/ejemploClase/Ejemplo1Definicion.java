package ejemploClase;

import java.util.Arrays;

/*
 * Autor: Abderrahman Labiod
 * Fecha: 07/11/2025
 * Iniciación a las arrays
 */
public class Ejemplo1Definicion {

	public static void main(String[] args) { 
		// Declarar una array
		// tipoDato (int, String, ...) identificador[];
		String dias[];
		
		// Crear el array
		// identificador = new tipoDato[dimension]
		// dimension e.j: 7
		dias = new String[7];
		System.out.println(dias);
		// Se puede definir así también
		// String dias[] = new String[7];
		
		// Se pueden definir por enumeración, esto también define la dimensión del array
		int datos[] = {4, 1, 2, 1, 6, 7, 6, 9};
		
		// Para acceder a un dato se hace través del índice (index) de cada valor, 
		// comenzando por el 0, siendo el máximo valor para el índice la cantidad de valores menos 1
		// E.j: Tenemos 8 elementos en una array, el último índice para acceder sería 7 (datos[7])
		System.out.println(datos[0]); // Primer valor
		System.out.println(datos[7]); // Último valor
		
		// También se pueden modificar valores dentro de ella usando la misma notación
		// E.j: datos[0] = 7;
		datos[0] = 100; // Asignamos el valor en el índice a 0 con el número 100
		System.out.println(datos[0]);
		
		// Imprimir el array
		// Si hacemos System.out.println(datos) simplemente, nos 
		// imprimirá un identificador y no los contenidos 
		System.out.println(datos); 
		System.out.println(Arrays.toString(datos));
	}

}
