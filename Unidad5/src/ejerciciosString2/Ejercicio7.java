package ejerciciosString2;

import java.util.Scanner;

/**
 * @author Carlos
 * @version
 * @since
 * Leer una frase por teclado y escribir a continuación cuantas mayúsculas, minúsculas y númeroscontiene.
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		String frase;
		System.out.println("Introduce una frase");
		frase=teclado.nextLine();
		System.out.println("La frase tiene:"
				+ "\n"+contarMayusculas(frase)+" Mayusculas"
				+ "\n"+contarMinuculas(frase)+" Minusculas"
				+ "\n"+contarNumeros(frase)+" Numeros");
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	
	//Metodo para contar minusculas
			public static int contarMinuculas(String frase) {
				frase=frase.toLowerCase();
				int contadorMinusculas=0;
				for (int i =0;i<frase.length();i++) {
					String nuevaFrase= String.valueOf(frase.charAt(i));
					if (nuevaFrase.matches("[a-z]")) {
						contadorMinusculas++;
					}
				}
				return contadorMinusculas;
			}
			
	//Metodo para contar mayusculas
			public static int contarMayusculas(String frase) {
				frase=frase.toLowerCase();
				int contadorMayusculas=0;
				for (int i =0;i<frase.length();i++) {
					String nuevaFrase= String.valueOf(frase.charAt(i));
					if (nuevaFrase.matches("[A-Z]")) {
						contadorMayusculas++;
					}
				}
				return contadorMayusculas;
			}
	
	//Metodo para contar numeros
		public static int contarNumeros(String frase) {
			frase=frase.toLowerCase();
			int contadorNumeros=0;
			for (int i =0;i<frase.length();i++) {
				String nuevaFrase= String.valueOf(frase.charAt(i));
				if (nuevaFrase.matches("[0-9]")) {
					contadorNumeros++;
				}
			}
			return contadorNumeros;
		}
}
