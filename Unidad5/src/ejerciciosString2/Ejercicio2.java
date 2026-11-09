package ejerciciosString2;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 09/11/2026
 * Dada una frase de no más de 80 caracteres hacer 
 * un programa que busque cuántas mayúsculas y minúsculas tiene y lo imprima.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);

		//Inicializamos variables
		//Llamamos al metodo validarFrase
		String frase=validarFrase(teclado);
		
		//Salida de datos
		System.out.println("La frase tiene "+contarMayusculas(frase)+" letras mayusculas");
		System.out.println("La frase tiene "+contarMinusculas(frase)+" letras minusculas");
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

	//Metodo para contar mayusculas
	public static int contarMayusculas(String frase) {
		int mayusculas=0;
		for (int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i)!=frase.toLowerCase().charAt(i)){
				mayusculas++;
			}
		}

		return mayusculas;
	}

	//Metodo para contar minusculas
	public static int contarMinusculas(String frase) {
		int minusculas=0;
		for (int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i)!=frase.toUpperCase().charAt(i)){
				minusculas++;
			}
		}

		return minusculas;
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
