package unidad2;

import java.util.Scanner;

/*
 * Carlos Abraham Chavarri Valera
 * 24/09/2025
 * Programa de ejemplo para aprender a usar la clase Scanner
 */
public class entradaTeclado {

	public static void main(String[] args) {
		// Declarar variables
		Scanner var1=new Scanner (System.in);
		String nombre, apellido;
		int num1, num2, suma, resta, producto;
		double cociente, media;
		// entrada de datos
		System.out.println("Escribe el primer numero");
		num1=var1.nextInt();
		System.out.println("Escribe el segundo numero");
		num2=var1.nextInt();
		var1.nextLine();
		System.out.println("Escribe tu nombre");
		nombre=var1.nextLine();
		System.out.println("Escribe tu apellido");
		apellido=var1.nextLine();
		// realizar operaciones
		suma=num1+num2;
		resta=num1+num2;
		producto=num1*num2;
		cociente=(double)num1/num2; //tengo que converti num1 a double para que haga la divicion con decimales
		media=(double)suma/2;
		//imprimir resultados
		System.out.println("");
		System.out.println("Bienvenido " + nombre + " " + apellido);
		System.out.println("");
		System.out.println("La suma vale " + suma);
		System.out.println("");
		System.out.println("La resta vale " + resta);
		System.out.println("");
		System.out.println("La producto vale " + producto);
		System.out.println("");
		System.out.println("La cociente vale " + cociente);
		System.out.println("");
		System.out.println("La media vale " + media);
		var1.close();
	}

}
