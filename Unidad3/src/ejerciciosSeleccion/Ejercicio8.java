package ejerciciosSeleccion;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 22/10/2026
 * Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien... 
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int num;
		//Salida y entrada de datos
		do {
			System.out.println("Introduce un numero");
			num=teclado.nextInt();
		}while(num<0 || num>10);
		//Condicional if
		if(num<5) {
			System.out.println("Nota: "+num+" Insuficiente");
		}else if(num<6) {
			System.out.println("Nota: "+num+" Suficiente");
		}else if(num<9){
			System.out.println("Nota: "+num+" Bien");
		}else {
			System.out.println("Nota: "+num+" Notable");
		}
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
