package ejercicicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/10/2026
 * Escribir un programa que vaya pidiendo números hasta que el usuario introduzca un
 * cero, para cada número introducido, debe mostrar por pantalla si el número es par o
 * impar. Recuerda que pueden anidarse sentencias de repetición y de selección. 

 */
public class Ejercicio21 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int num;

		//Salida y entrada de datos
		System.out.println("Introduce un numero");
		num=teclado.nextInt();

		//Bucle while que se repetira mientras numero sea distinto de 0
		while(num!=0) {
			//Usamos condiciona if para evaluar condicion
			//si el resto entre num y 2 es cero mostrara por pantalla es par sino mostrara es impar
			if(num%2==0) {
				System.out.println("El numero "+num+" es par");
			}else {
				System.out.println("El numero "+num+" es impar");
			}
			//Salida y entrada de datos
			System.out.println("Introduce un numero");
			num=teclado.nextInt();
			
		}

		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
}