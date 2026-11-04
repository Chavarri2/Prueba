package ejercicicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/10/2026
 * Realizar un algoritmo que vaya pidiendo números enteros hasta que el usuario
 * introduzca un cero. Hay que ir visualizando cada uno de los números insertados,
 * excepto el 0
 */
public class Ejercicio18 {

	public static void main(String[] args) {
		// Crear objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos e inicializamos variables
		int num;
		
		//Bucle do-while con condicion de repetirse mientras que num sea distinto de 0
		do {
			//Entrada y salida de datos
			System.out.println("Introduce un numero");
			num=teclado.nextInt();
			//Condicional if que evalua que si num es distinto de 0 entonces mostrara por pantalla el valor de num
			if(num!=0) {
			System.out.println("\nNumero introducido: "+num);
			}
		}
		while(num!=0);//Fin do-while
		
		
		//Cerramos clase Scanner
		teclado.close();
	}

}
