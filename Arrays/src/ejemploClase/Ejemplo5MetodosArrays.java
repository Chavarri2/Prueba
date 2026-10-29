package ejemploClase;

import java.util.Arrays;

/*carlos abraham
 * 7/11/2025
 * Metodos arrays*/
public class Ejemplo5MetodosArrays {

	public static void main(String[] args) {
		// Definir y declarar array
		int []arrayOriginal= {1,2,3,4};
		//copiar vectores
		int []copia=Arrays.copyOf(arrayOriginal, 10);//Crea una copia y le añade 0 a los nuevos valores
		System.out.println(Arrays.toString(copia));
		int []copia2=Arrays.copyOf(arrayOriginal, 2);//Crea una copia del vector y si la dimension es menor
		//trunca el vector, es decir, quita elementos empezando por los ultimos(indice mayor)
		System.out.println(Arrays.toString(copia2));
		
		//comparar vectores con .equals
		int []vector1= {1,2,3};
		int []vector2= {1,2,3};
		System.out.println(Arrays.equals(vector1, vector2));
		System.out.println(vector1== vector2);
		//rellenar arrays con el metodo .fill
		int []v=new int [4];
		Arrays.fill(v, 10);
		System.out.println(Arrays.toString(v));
		Arrays.fill(v, 0, 2, 6);
		System.out.println(Arrays.toString(v));
		//Ordenacion de Arrays con el metodo sort
		int []v2= {3,4,7,8,2};
		Arrays.sort(v2);
		System.out.println(Arrays.toString(v2));
		
		
		
	}

}
