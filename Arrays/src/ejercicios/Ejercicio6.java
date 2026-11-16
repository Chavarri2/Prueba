package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 16/112026
 * Pide un número al usuario e indica si está en el array. Si está, muestra la
 * posición de su primera aparición; si no, muestra un mensaje indicándolo.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos e Inicializamos variables
		boolean siNo=false;
		int numero, posicion=0,contador=0;
		int[] lista= {1,2,3,4,5,6,7,8,9};
		System.out.println("Introduce un numero");
		numero=teclado.nextInt();
		
		for (int i : lista) {
			contador++;
			if(i==numero) {
				siNo=true;
				posicion=contador;
			}
		}
		if(siNo) {
			System.out.println("El numero esta en el array");
			System.out.println("El numero "+numero+" esta en la posicion: "+posicion);
		}else {
			System.out.println("El numero "+numero+" no esta en en el array");
		}
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
