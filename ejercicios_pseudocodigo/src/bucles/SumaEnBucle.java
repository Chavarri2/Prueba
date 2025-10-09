package bucles;

import java.util.Scanner;

public class SumaEnBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numero, suma;
		numero=1;
		suma=0;
		Scanner teclado=new Scanner(System.in);
		while (!(numero==0)) {
			System.out.println("Introduce un valor: ");
			numero=teclado.nextFloat();
			suma=numero+suma;
			System.out.println(numero);
		}
		teclado.close();
		System.out.println("La suma de todos los valores introducidos es: "+ suma);
		System.out.println("El programa ha finalizado");
	}

}
