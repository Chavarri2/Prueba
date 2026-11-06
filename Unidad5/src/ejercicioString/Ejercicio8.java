package ejercicioString;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/11/2026
 * Escribe un programa que pida por teclado una palabra 
 * y muestre por pantalla cuál es la vocal quemás veces contiene 
 * la palabra junto al número de veces que la tiene.
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		String palabra;
		//Salida y entrada de datos
		System.out.println("Introduce una palabra");
		palabra=teclado.nextLine();
		//LLamamos objeto de la clase Scanner
		vocalMasUsado(palabra);
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	public static int vocalA(String palabra) {
		int contador=0;
		for (int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i)=='a') {

			}
		}
		return contador;
	}
	
	public static int vocalE(String palabra) {
		int contador=0;
		for (int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i)=='a') {

			}
		}
		return contador;
	}
	
	public static int vocalI(String palabra) {
		int contador=0;
		for (int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i)=='a') {

			}
		}
		return contador;
	}
	
	public static int vocalO(String palabra) {
		int contador=0;
		for (int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i)=='a') {

			}
		}
		return contador;
	}
	
	public static int vocalU(String palabra) {
		int contador=0;
		for (int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i)=='a') {
				
			}
		}
		return contador;
	}
	public static void vocalMasUsado(String palabra) {
		if(vocalA(palabra)>vocalA(palabra)) {
			
		}
	}
}
