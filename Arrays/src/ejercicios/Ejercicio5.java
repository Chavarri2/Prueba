package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 10
 * @since 16/11/2026
 *  Dado un array de enteros introducido por el usuario, muestra cuántos elementos
 *  son pares, cuántos son impares y cuántos son mayores que la media.
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int numerosIntroducir;
		//Salida y entrada de datos
		System.out.println("¿Cuantos numero quieres introducir?");
		numerosIntroducir=teclado.nextInt();
		int[] listaNumeros=new int[numerosIntroducir];
		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.println("Introduce un numero");
			listaNumeros[i]=teclado.nextInt();
		}
		System.out.println("Hay "+par(listaNumeros)+" numeros pares");
		System.out.println("Hay "+imPar(listaNumeros)+" numeros impares");
		System.out.println("Hay "+mayoresMedia(listaNumeros)+" numeros mayores a la media");
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	public static int mayoresMedia(int[] lista) {
		double media=0;
		int mayoresMedia=0;
		for (int i : lista) {
			media=media+i;
		}
		media=media/lista.length;
		for (int i : lista) {
			if(i>media) {
				mayoresMedia++;
			}
		}
		return mayoresMedia;
	}
	public static int par(int[] lista) {
		int numerosPares=0;
		for (int i : lista) {
			if(i%2==0) {
				numerosPares++;
			}
		}
		return numerosPares;
	}
	
	public static int imPar(int[] lista) {
		int numerosImPares=0;
		for (int i : lista) {
			if(i%2!=0) {
				numerosImPares++;
			}
		}
		return numerosImPares;
	}
}
