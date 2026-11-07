package ejercicioString;

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
		System.out.println(vocalMasUsado(palabra));
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	public static String vocalMasUsado(String palabra) {
		int contadorA=0, contadorE=0,contadorI=0, contadorO=0, contadorU=0;
		for (int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i)=='a') {
				contadorA++;
			}else if(palabra.charAt(i)=='e') {
				contadorE++;
			}else if(palabra.charAt(i)=='i') {
				contadorI++;
			}else if(palabra.charAt(i)=='o') {
				contadorO++;
			}else if(palabra.charAt(i)=='u') {
				contadorU++;
			}
		}
		if(contadorA>contadorE && contadorA>contadorI && contadorA>contadorO && contadorA>contadorU) {
			return "La vocal que aparece mas veces es: A con "+contadorA+" apariciones";
		}else if(contadorE>contadorI && contadorE>contadorO && contadorE>contadorU) {
			return "La vocal que aparece mas veces es: E con "+contadorE+" apariciones";
		}else if(contadorI>contadorO && contadorI>contadorU) {
			return "La vocal que aparece mas veces es: I con "+contadorI+" apariciones";
		}else if(contadorO>contadorU){
			return "La vocal que aparece mas veces es: O con "+contadorO+" apariciones";
		}else {
			return "La vocal que aparece mas veces es: U con "+contadorU+" apariciones";
		}
	}
}
