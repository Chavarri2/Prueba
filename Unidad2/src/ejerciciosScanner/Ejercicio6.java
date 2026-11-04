package ejerciciosScanner;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/10/2026
 * Pide tres notas double y calcula la media.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		//Creamos Constante
		final int TRIMESTRES=3;
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramo variables
		double nota1,nota2,nota3,media;
		
		//Entrada y salida de datos
		System.out.println("Introduce la nota del primer trimestre");
		nota1=teclado.nextDouble();
		System.out.println("Introduce la nota del segundo trimestre");
		nota2=teclado.nextDouble();
		System.out.println("Introduce la nota del tercer trimestre");
		nota3=teclado.nextDouble();
		
		//Operaciones
		media=(nota1+nota2+nota3)/TRIMESTRES;
		
		//Salida de datos
		System.out.println("La nota media es: "+media);
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
