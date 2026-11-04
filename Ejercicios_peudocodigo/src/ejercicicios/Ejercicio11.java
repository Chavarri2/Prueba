package ejercicicios;

import java.util.Scanner;

/**
 * @autor Carlos Abraham Chavarri Valera
 * @verion 1.0
 * @since 30/9/2026
 * Diseñar un algoritmo que pida por teclado tres números; si el primero es negativo, 
 * debe imprimir el producto de los tres y si no lo es, imprimirá la suma.
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		//Creamos objeto de clase Scanner
		Scanner teclado= new Scanner(System.in);
		//Definimos variables
		int num1,num2,num3;
		
		//Salido y entrada de datos
		System.out.println("Introduce un primer numero");
		num1=teclado.nextInt();
		
		System.out.println("Introduce un segundo numero");
		num2=teclado.nextInt();
		
		System.out.println("Introduce un tercer numero");
		num3=teclado.nextInt();
		
		//Usamos estructura de decision if para compropar si el primer numero es negativo
		//Evaluamos condicion el numero 1 es menor que cero entonces:
		if(num1<0) {
			//Salida de pantalla que dice el producto de tres numeros
			System.out.println("El producto de los tres numeros es: "+(num1*num2*num3));
		//Sino entonces:
		}else {
			//Salida de pantalla que dice el suma de tres numeros
			System.out.println("La suma de los tres numeros es: "+(num1+num2+num3));
		}
		//Cerramos clase Scanner
		teclado.close();
	}

}
