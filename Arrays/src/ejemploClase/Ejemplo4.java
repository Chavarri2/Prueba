package ejemploClase;

import java.util.Arrays;

/*carlos abraham
 * 7/11/2025
 * Ejemplo de llenar un array de 20 enteros con numeros aleatorios entre 1 a 6*/
public class Ejemplo4 {

	public static void main(String[] args) {
		// Declarar y definir array
		int []dados=new int [20];
		llenarArray(dados);
		System.out.println(Arrays.toString(dados));
	}
	private static void llenarArray(int []vector) {
		for(int i =0;i<vector.length;i++) {
			vector[i]=(int)(Math.random()*6+1);
		}	
	}

}
