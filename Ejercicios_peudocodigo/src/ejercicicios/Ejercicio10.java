package ejercicicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 30/9/2026
 * Algoritmo que lea tres números distintos y nos diga cuál de ellos es el mayor. 
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		// Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Definimos variables
		int num1,num2,num3;
		
		//Salida y entrada de datos
		System.out.println("Introduce un primer numero");
		num1=teclado.nextInt();
		System.out.println("Introduce un segundo numero");
		num2=teclado.nextInt();
		System.out.println("Introduce un tercer numero");
		num3=teclado.nextInt();
		
		//Condicion que evalua cual es el mayor de 3 numeros
		if(num1>num2) {
			if(num1>num3){
				System.out.println("El mayor de los tres numeros es: "+num1);
			}else {
				System.out.println("El mayor de los tres numeros es: "+num3);
			}
		}else if(num2>num3){
			System.out.println("El mayor de los tres numeros es: "+num2);
		}else {
			System.out.println("El mayor de los tres numeros es: "+num3);
		}
		
		//Cerramos variable de la clase Scanner
		teclado.close();
	}

}
