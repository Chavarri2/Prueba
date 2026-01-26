package bucles;

import java.util.Scanner;

public class IntroduceNumeroEnBucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numero;
		numero=1;
		Scanner teclado=new Scanner(System.in);
		while (!(numero==0)) {
			System.out.println("Introduce un valor: ");
			numero=teclado.nextInt();
			System.out.println(numero);
		}
		teclado.close();
		System.out.println("El programa ha finalizado");
	}

}
