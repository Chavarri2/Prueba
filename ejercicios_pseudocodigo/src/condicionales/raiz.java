package condicionales;

import java.util.Scanner;

public class raiz {

	public static void main(String[] args) {
		// 
		double num1, raiz, potencia;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un lado: ");
		num1=teclado.nextDouble();
		if (num1>0) {
			raiz=Math.sqrt(num1);
			potencia=Math.pow(num1,2);
			System.out.println("La raiz de " +num1+" es: " +raiz + " y su pontencia cuadrada es: "+potencia);
		} else {
			System.out.println("Ha ocurrido un error, no se aceptan numeros menores a 1");
		}
		teclado.close();
	}

}
