package ejerciciosSeleccion;

import java.util.Scanner;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 19/10/2026
 * Pedir un número entre 0 y 9.999 y decir cuántas cifras tiene.
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		//Creamos un objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		double num;
		//Entrada y salida de datos
		System.out.println("Introduce un numero entre 1 y 9999 (inclusivos)");
		num=teclado.nextDouble();
		//Llamamos al metodo contar cifras
		contarCifras(num);
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

	private static void contarCifras(double num) {
		//Usamos condicional if para evaluar cuantos digitos tiene
		if(num>=1 && num<10) {
			System.out.println("El numero tiene 1 digitos");
		}else if(num>=10 && num<100){
			System.out.println("El numero tiene 2 digitos");
		}else if(num>=100 && num<1000){
			System.out.println("El numero tiene 3 digitos");
		}else if(num>=1000 && num<10000){
			System.out.println("El numero tiene 4 digitos");
		}else{
			System.err.println("Error: el numero introducido esta fuera de los parametros");
		}
	}

}
