package ejercicioString;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 7/11/2026
 * Hacer un programa que pida un DNI por teclado. Un DNI debe tener 
 * longitud 9 y el último carácter tiene que cumplir lo siguiente:
 * Se divide la parte numérica del DNI para 23, y el resto de esa división 
 * se corresponde con la posición de la letra en la siguiente cadena:TRWAGMYFPDXBNJZSQVHLCKE.
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		String dni, expreg="[0-9]{8}[A-Z]";
		int numero;
		//Salida y entrada de datos
		do {
			System.out.println("Introduce un dni");
			dni=teclado.nextLine();
		}while(!(dni.matches(expreg)));
		numero= Integer.valueOf(dni.substring(0, dni.length()-1));
		dni = dni.toUpperCase();
		if(validarLetra(numero, dni)) {
			System.out.println("El DNI "+dni+" es valido");
		}else {
			System.out.println("El DNI "+dni+" no es valido");
		}
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

	//Metodo para asignar letra de DNI
	public static boolean validarLetra(long numeros, String dni) {
		int numero=(int) (numeros%23);
		char letra;
		String letrasAsignables="TRWAGMYFPDXBNJZSQVHLCKE";
		
		letra=letrasAsignables.charAt(numero);
		if(dni.charAt(dni.length()-1)==letra) {
			return true;
		}else {
			return false;
		}
	}
}
