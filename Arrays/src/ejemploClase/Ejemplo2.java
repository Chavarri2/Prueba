package ejemploClase;

import java.util.Arrays;

/*carlos abraham
 * 7/11/2025
 * Ejemplos de arrays*/
public class Ejemplo2 {

	public static void main(String[] args) {
		// Declarar y definir
		int vector1[]= {7,8,9};
		int vector2[]= {20,30,40};
		System.out.println(vector1);
		System.out.println(vector2);
		vector1=vector2;
		System.out.println(vector1);
		System.out.println(vector2);
		System.out.println(Arrays.toString(vector1));
		System.out.println(Arrays.toString(vector2));
		//ahora los vectores son el mismo vector
		vector1[0]=777;
		System.out.println(Arrays.toString(vector1));
		System.out.println(Arrays.toString(vector2));
	}

}
