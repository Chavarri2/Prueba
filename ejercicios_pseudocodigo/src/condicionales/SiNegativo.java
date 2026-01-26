package condicionales;

import java.util.Scanner;

public class SiNegativo {

	public static void main(String[] args) {
		int num1, num2, num3, producto, suma;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Escriba un primer numero ");
		num1= scanner.nextInt();
		System.out.println("Escriba un segundo numero");
		num2= scanner.nextInt();
		System.out.println("Escriba un tercer numero");
		num3= scanner.nextInt();
		if (num1 < 0) {
			producto= num1*num2*num3;
			System.out.println("El producto de los numeros es: " + producto);
		}else {
			suma= num1+num2+num3;
			System.out.println("La suma de los numeros es: " + suma);
		}
	scanner.close();
	}

}
