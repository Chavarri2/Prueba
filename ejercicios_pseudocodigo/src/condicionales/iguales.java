package condicionales;

import java.util.Scanner;

public class iguales {

	public static void main(String[] args) {
		float num1, num2;
		Scanner var1= new Scanner(System.in);
		System.out.println("Escribe numero 1");
		num1=var1.nextFloat();
		System.out.println("Escribe numero 2");
		num2=var1.nextFloat();
		if (num1 == num2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son diferentes");
		}
		var1.close();

	}

}
