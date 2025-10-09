package condicionales;

import java.util.Scanner;

public class VariablesIntercabiables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, var1;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce el valor de a: ");
		a=teclado.nextInt();
		System.out.println("Introduce el valor de b: ");
		b=teclado.nextInt();
		var1=a;
		a=b;
		b=var1;
		System.out.println("a: "+ a +" b: " + b);
		teclado.close();
	}

}
