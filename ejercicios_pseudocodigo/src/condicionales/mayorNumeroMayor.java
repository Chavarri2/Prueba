package condicionales;

import java.util.Scanner;

public class mayorNumeroMayor {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Escribe el primer numero");
		num1=scanner.nextInt();
		System.out.println("Escribe el sengundo numero");
		num2=scanner.nextInt();
		System.out.println("Escribe el tercer numero");
		num3=scanner.nextInt();
		if (num1 >= num2) {
			if (num1 >= num3) {
				System.out.println("El primer valor: " + num1 + " Es el mas alto");
			} else {
				System.out.println("El tercer valor: " + num3 + " Es el mas alto");
			}
		}else if (num2 >= num3) {
			System.out.println("El segundo valor es el mas alto: " + num2 + " Es el mas alto");
		}else {
			System.out.println("El tercer valor: " + num3 + " Es el mas alto");
		}
	scanner.close();	
	}
}
