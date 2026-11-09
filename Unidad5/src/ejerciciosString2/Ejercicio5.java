package ejerciciosString2;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 9/11/2026
 * Leer una frase por teclado (máximo 80 car) y construir 
 * otras dos cadenas de forma que una contenga los caracteres en 
 * posición par y la otra los caracteres en posición impar.
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado= new Scanner(System.in);
		
		//Inicializamos variables
		String frase=validarFrase(teclado);
		
		//Salida de datos
		//Llamamos a los metodos candenaPar y cadenaImpar
		System.out.println("La cadena en posicion par es:");
		System.out.println(cadenaPar(frase));
		System.out.println("La cadena en posicion impar es:");
		System.out.println(cadenaImpar(frase));
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	//Metodo para crear cadenas con letras en las posisiones par
	public static String cadenaPar(String frase) {
		String posicionPar="";
		for (int i = 0; i < frase.length(); i++) {
			if(i%2==0) {
				posicionPar=posicionPar+frase.charAt(i);
			}
		}
		return posicionPar;
	}

	//Metodo para crear cadenas con letras en las posisiones par
	public static String cadenaImpar(String frase) {
		String posicionImpar="";
		for (int i = 0; i < frase.length(); i++) {
			if(i%2!=0) {
				posicionImpar=posicionImpar+frase.charAt(i);
			}
		}
		return posicionImpar;
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
