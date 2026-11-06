package ejercicioString;

import java.util.Scanner;

/**
 * @author Carlos
 * @version
 * @since
 * Hacer un programa que pida dos nombres y compruebe si son iguales. 
 * Si son distintosdebemostrarlos ordenados alfanuméricamente. Finalmente 
 * muestra los dos nombresenmayúsculas y en minúsculas.
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		String nombre1,nombre2;
		System.out.println("Introduce un nombre");
		nombre1=teclado.nextLine();
		System.out.println("Introduce otro nombre");
		nombre2=teclado.nextLine();

		nombre1=nombre1.toLowerCase();
		nombre2=nombre2.toLowerCase();
		if(nombre1.equals(nombre2)) {
			System.out.println("Los nombres son iguales");
		}else {
			ordenarNombre(nombre1, nombre2);
		}
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

	public static void ordenarNombre(String nombre1, String nombre2) {
		char letra1, letra2;
		letra1=nombre1.charAt(0);
		letra2=nombre2.charAt(0);
		if(letra1<letra2) {
			System.out.println(nombre1.toUpperCase()+" "+nombre2.toUpperCase());
			System.out.println(nombre1+nombre2);
		}else {
			System.out.println(nombre2.toUpperCase()+" "+nombre1.toUpperCase());
			System.out.println(nombre2+" "+nombre1);

		}

	}

}
