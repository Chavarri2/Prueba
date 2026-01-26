package RepasoSeleccionBucle;

import java.util.Scanner;

public class ParimparEnBucle {

	public static void main(String[] args) {
		int numero;
		numero=1;
		String salida;
		Scanner teclado=new Scanner(System.in);
		while (!(numero==0)) {
			System.out.println("Introduce un valor que sea entero: ");
			numero=teclado.nextInt();
			if (numero % 2==0 ) {
				salida="El numero es par";
			}else if (numero < 0){
				salida="El numero es negativo";
			} else {
				salida="El numero es impar";
			}
			System.out.println(salida);
		}
		teclado.close();
		System.out.println("El programa ha finalizado");

	}
}
