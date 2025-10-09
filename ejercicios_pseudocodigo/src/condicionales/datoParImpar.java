package condicionales;

import java.util.Scanner;

public class datoParImpar {

	public static void main(String[] args) {
		
		int dato;
		float var1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Escribe un numero");
		dato= scanner.nextInt();
		var1= (float)dato%2;
		if (var1 == 0) {
			System.out.println("El numero " + dato + " es par");
		} else {
			System.out.println("El numero " + dato + " es impar");
		}
		
	scanner.close();	
	}

}
