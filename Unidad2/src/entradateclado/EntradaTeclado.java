package entradateclado;

import java.util.Scanner;

/*
 * Mauro Civitani
 * 24/09/2025
 * Programa de ejemplo para aprender a usar la clase Scanner
 */
public class EntradaTeclado {

	public static void main(String[] args) {
		//Declarar variables
		Scanner mauro=new Scanner (System.in);
		int num1, num2, resta, suma, producto;
		String nombre, apellido; 
		double cociente, media;
		
		//entrada de datos
	
		System.out.println("escribe el primer numero");
		num1=mauro.nextInt();
		System.out.println("escribe el segundo numero");
		num2=mauro.nextInt();
		mauro.nextLine();
		System.out.println("introduce el nombre");
		nombre=mauro.nextLine();
		System.out.println("introduce el apellido");
		apellido=mauro.nextLine();
		
		//realizar operaciones
		suma=num1+num2;
		resta=num1-num2;
		producto=num1*num2;
		cociente=(double)num1/num2; //tengo que convertir num1 a double para que haga la division con decimales
		media=(double)suma/2;
		//imprimir resultados
		System.out.println("Bienvenido "+nombre + " " +apellido);
		System.out.println("la suma vale "+suma );
		System.out.println("la resta vale "+ resta);
		System.out.println("el producto vale "+producto);
		System.out.println("el cociente vale "+cociente);
		System.out.println("la media es "+media);
		mauro.close();
		

	}

}
