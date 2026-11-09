package ejercicioString;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/11/2026
 * Escribe un programa que pida por teclado dos nombres con su apellido cada uno del siguiente
 * modo:Introduce un nombre y un apellido:
 * Manuel García
 * Introduce otro nombre y apellido:
 * Jimena Pérez
 * Después debe intercambiar los apellidos a los nombres y mostrarlos:
 * Jimena García
 * Manuel Pérez
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos varibles
		
		String  nombreApellido1,nombreApellido2;
		//Entrada y Salida de datos
		System.out.println("Introduce tu primer nombre y tu primer apellido");
		nombreApellido1=teclado.nextLine();
		System.out.println("Introduce tu primer nombre y tu primer apellido");
		nombreApellido2=teclado.nextLine();
		cambiarApellidos(nombreApellido1, nombreApellido2);
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	public static void cambiarApellidos(String nombreApellido1, String nombreApellido2) {
		String [] arreglo1= nombreApellido1.split(" "), arreglo2= nombreApellido2.split(" ");
		System.out.println(arreglo1[0]+" "+arreglo2[1]);
		System.out.println(arreglo2[0]+" "+arreglo1[1]);
	}
}
