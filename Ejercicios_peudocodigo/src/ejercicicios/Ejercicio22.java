package ejercicicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/10/2026
 *  Pedir 2 números enteros y decir si el primero es múltiplo del segundo. 
 */
public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		double num1,num2;
		//Salida y entrada de datos
		System.out.println("Introduce un primer numero");
		num1=teclado.nextInt();
		System.out.println("Introduce un segundo numero");
		num2=teclado.nextInt();
		
		//Usamos condicional if para evaluar condicion
		//si el restro de num 2 entre num 1 es igual que cero entonces es multiplo
		if(num2%num1==0) {
			System.out.println("El numero "+num2+" es multiplo de "+num1);
		}else {
			System.out.println("El numero "+num2+" no es multiplo de "+num1);
		}
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
