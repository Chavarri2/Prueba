package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 6/10/2026
 *  Escribir un programa que lea una secuencia de datos numéricos de longitud
 *  indefinida de manera que cuando el número sea el cero cesará la entrada de dicha
 *  secuencia. El programa debe imprimirnos la media de todos, el mayor y el menor.
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos e inizializamos variables
		int num, media=0,mayor,menor,total=0,contador=0;
		
		//Salida y entrada de datos
		System.out.println("Introduce un numero");
		num=teclado.nextInt();
		
		//Inicializo estas variables despues de recibir el numero que introduzca el usuario porque si
		//El usuario mete numero como 100 o 200 y esos son los mas bajos y menor esta inicializado a 0
		//Habra una inconsistencia
		//Por otro lado, si el usuario mete unicamente valores negativos y el mayor esta inicializado a 0
		//Ocurriria la misma incositencia por eso se inicializan aqui
		menor=num;
		mayor=num;
		//El bucle while se repetira mientras que el numero introducido por el usuario sea distinto de cero
		while(num!=0) {
			//Condicional if, evaluamos condicones
			//Si num es mayor que mayor entonces cambiamos el valor de mayor por el que tenga num en ese momento
			if(num>mayor) {
				mayor=num;
			}//Si num es menor que menor entonces cambiamos el valor de menor por el que tenga num en ese momento
			if(num<menor) {
				menor=num;
			}
			//En total sumamos todos los numero introducidos
			total=total+num;
			//En contador sumamos cada vez que se repita el bucle
			contador++;
			//Salida y entrada de datos
			System.out.println("Introduce un numero");
			num=teclado.nextInt();
		}
		
		//Operaciones
		//Media es la operacion de total entre contador
		media=total/contador;
		
		//Salida de datos
		System.out.println("\n===================================\n");
		System.out.println("El mayor de los numeros introducidos es: "+mayor
				+ "\nEl menor de los numeros introducidos es: "+menor
				+ "\nLa media de todos los numeros introducidos es: "+media);
		System.out.println("\n===================================");
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
