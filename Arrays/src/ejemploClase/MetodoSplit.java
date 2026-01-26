package ejemploClase;

import java.util.Arrays;

/*Carlos Abraham Chavarri Valera
 *13/11/2025
 *Este metodo sirve para "dividir" una cadena (string) dependiendo de un separador (regex)
 *Nos devolvera una array de String (String[]) el cual podemos acceder*/
public class MetodoSplit {

	public static void main(String[] args) {
		// crear y dividir una frase en palabras
		String frase="La casa que hay en la calle es definitivamente de color azul";
		String[] palabras = frase.split(" +");
		System.out.println(Arrays.toString(palabras));
		System.out.println("La frase tiene " + palabras.length+" palabras");
		// partir una linea en un CSV
		String csv="1,2,3,4,5,6,7,8,9,0,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30";
		String[] nums=csv.split(",");
		int suma=0;
		for(String numString:nums) {
			suma+=Integer.parseInt(numString);
		}
		System.out.println(Arrays.toString(nums));
		System.out.println("La suma de todos es igual a: "+suma);
		System.out.println(" ");
	}

}
