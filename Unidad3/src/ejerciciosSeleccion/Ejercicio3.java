package ejerciciosSeleccion;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 19/10/2026
 * Pedir dos números y decir si uno es múltiplo del otro.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int num1,num2;
		//Salida y entrada de datos
		System.out.println("Introduce un primer numero");
		num1=teclado.nextInt();
		System.out.println("Introduce un segundo numero");
		num2=teclado.nextInt();
		if(num1%num2==0) {
			System.out.println("El numero "+num2+" es multiplo de "+num1);
		}else {
			System.out.println("El numero "+num2+" no es multiplo de "+num1);
		}
		//Cerramos objeto de clase Scanner
		teclado.close();
	}

}
