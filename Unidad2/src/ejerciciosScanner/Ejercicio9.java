package ejerciciosScanner;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/10/2026
 * Pide al usuario su peso en kg y altura en metros. Calcula el Índice de Masa Corporal (IMC):
 * IMC = peso / (altura * altura)
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		double peso, altura,imc;
		
		//Salida y entrada de datos
		System.out.println("Introduce tu peso (se asueme que es introducida en Kg)");
		peso=teclado.nextDouble();
		System.out.println("Introduce tu altura (se asume que es introducida en metros)");
		altura=teclado.nextDouble();
		
		//Operaciones
		imc=peso/(altura*altura);
		
		//Salida de datos
		System.out.println("El indice de masa corporal es: "+imc);

		//Cerramos objeto de la clase Scanner
		teclado.close();

	}

}
