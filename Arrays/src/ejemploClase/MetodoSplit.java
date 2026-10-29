package ejemploClase;

import java.util.Arrays;

/*
 * Autor: Abderrahman Labiod
 * Fecha: 13/11/2025
 * Ejemplos de uso del método String#split
 * Este método sirve para "dividir" una cadena (String) dependiendo de un separador (regex)
 * Nos devolverá una array de string (String[]) el cual podemos acceder.
 * El valor que nos devuelve no modifica la variable original.
 */
public class MetodoSplit {

	public static void main(String[] args) {
		// Crear y dividir una frase en palabras
		//String frase = "La casa que hay en la calle es definitivamente de color azul";
		String frase2 = "La  casa  que  hay en la calle  es definitivamente de  color azul";
		String[] palabras = frase2.split(" +"); // El divisor es un espacio ( )
		System.out.println(Arrays.toString(palabras));
		System.out.println("La frase tiene " + palabras.length + " palabras.");
		System.out.println(" ");
		
		// Partir una línea en un CSV (Comma Separated Values)
		String csv = "1,2,3,4,5,6,7";
		String[] nums = csv.split(",");
		int suma = 0;
		for (String numString : nums) {
			suma += Integer.parseInt(numString);
		}
		System.out.println(Arrays.toString(nums));
		System.out.println("La suma de todos ellos es igual a: " + suma);
		System.out.println(" ");
	}

}
