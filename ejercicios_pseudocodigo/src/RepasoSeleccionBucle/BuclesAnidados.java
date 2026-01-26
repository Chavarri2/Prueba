package RepasoSeleccionBucle;

import java.util.Scanner;

public class BuclesAnidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contar;
		float numero;
		numero=1;
		Scanner teclado=new Scanner(System.in);
		while (!(numero==0)) {
			System.out.println("Introduce un valor: ");
			numero=teclado.nextFloat();
			if (numero>0) {
				for (contar=1; contar<=numero;contar+=2) {
					System.out.println(contar);
				}
			}else {
				for (contar=-1; contar>=numero;contar-=2) {
					System.out.println(contar);
				}
			}
			System.out.println(numero);
		}
		teclado.close();
		System.out.println("El programa ha finalizado");

	}
}
