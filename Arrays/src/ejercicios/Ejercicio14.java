package ejercicios;

import java.util.Arrays;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 18/11/2026
 * Escribe un método eliminarRepetidos que devuelva un array nuevo sin
 * elementos duplicados, manteniendo el orden de primera aparición y con la
 * longitud justa para los elementos que contiene.
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		//Declaramos variables
		int[] lista= new int[20];
		rellenarArray(lista);
		System.out.println(Arrays.toString(eliminarRepetidos(lista)));
	}
	
	//Metodo para rellenar un array
	public static void rellenarArray(int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			lista[i]=(int)(Math.random()*100+1);
		}
	}
	//Metodo para eliminar los elementos repetidos de un array
	public static int[] eliminarRepetidos(int[] lista) {
		int[] listaSinRepetidos=new int[lista.length];
		int contador=0;
		for (int i = 0; i < listaSinRepetidos.length; i++) {
			
			boolean repetido= false;
			
			for (int j = 0; j < listaSinRepetidos.length; j++) {
			
				if(listaSinRepetidos[j]==lista[i]) {
					repetido=true;
				} 	
			
			}
			if(!repetido){
				listaSinRepetidos[contador]=lista[i];
				contador++;
			}
		
		}
		return Arrays.copyOf(listaSinRepetidos, contador);
	}

}
