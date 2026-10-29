package ejemploCondicionales;

import java.util.Scanner;

public class descuentoMes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes;
		double descuento, dinero, resultado;
		descuento=0.15;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce tu mes de forma numerica: ");
		mes=teclado.nextInt();
		System.out.println("Introduce el total de la compra: ");
		dinero=teclado.nextFloat();
		if (mes == 10) {
			resultado=dinero-dinero*descuento;
			System.out.println("El precio final es de: "+ resultado+"€");
		}else {
			System.out.println("El no hay decuento este mes, su compra es de: " + dinero);
		}
		teclado.close();
	}

}
