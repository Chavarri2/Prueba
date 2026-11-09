package ejerciciosString2;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 9/11/2026
 * Leer una frase por teclado (máximo 80) y a continuación escribir 
 * cuantas vocales, consonantesycaracteres numéricos posee.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		//Creamos un objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Inicializamos variables
		String frase=validarFrase(teclado);
		System.out.println("La frase tiene:"
				+ "\n"+contarConsonantes(frase)+" Consonantes"
				+ "\n"+contarVocales(frase)+" Volcales"
				+ "\n"+contarNumeros(frase)+" Numeros");

		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	//Metodo para contar numeros
	public static int contarNumeros(String frase) {
		frase=frase.toLowerCase();
		int contadorVocales=0;
		for (int i =0;i<frase.length();i++) {
			String nuevaFrase= String.valueOf(frase.charAt(i));
			if (nuevaFrase.matches("[0-9]")) {
				contadorVocales++;
			}
		}
		return contadorVocales;
	}

	//Metodo para contar consonantes
	public static int contarConsonantes(String frase) {
		frase=frase.toLowerCase();
		int contadorConsonantes=0;
		for (int i =0;i<frase.length();i++) {
			String nuevaFrase= String.valueOf(frase.charAt(i));
			if (nuevaFrase.matches("[a-z&&[^aeiou]]")) {
				contadorConsonantes++;
			}
		}
		return contadorConsonantes;
	}

	//Metodo para contar vocales
	public static int contarVocales(String frase) {
		frase=frase.toLowerCase();
		int contadorVocales=0;
		for (int i =0;i<frase.length();i++) {
			String nuevaFrase= String.valueOf(frase.charAt(i));
			if (nuevaFrase.matches("[aeiou]")) {
				contadorVocales++;
			}
		}
		return contadorVocales;
	}

	//Metodo para validar la frase
	public static String validarFrase(Scanner teclado) {
		String frase;
		do {
			System.out.println("Introduce una frase");
			frase=teclado.nextLine();
			if(frase.length()>80) {
				System.out.println("Error: La longitud de la frase supera los 80 caracteres");
			}
		}while(frase.length()>80);
		return frase;
	}
}
