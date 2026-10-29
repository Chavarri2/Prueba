package ejerciciosBuclesAnidados;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 20/10/2026
 * Ejercicio 6.Tablero de ajedrez
 * Dibuja un tablero de ajedrez de 8 × 8 casillas. Las casillas blancas se representan con . y
 * las negras con # , alternándose como en un tablero real.
 * . # . # . # . #
 * # . # . # . # .
 * . # . # . # . #
 * ...
 * Ampliación. Pide por teclado el tamaño del tablero.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos e Inicializamos variables
		int size;
		String a="# ",b=". ",aux;
		//Entrada y Salida de datos
		System.out.println("Introduce el tamaño del tablero");
		size=teclado.nextInt();
		//Bucle for
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				if(j%2==0) {
					System.out.print(a);
				}else {
					System.out.print(b);
				}
			}
			if(i%2==0) {
				aux=a;
				a=b;
				b=aux;
			}else {
				aux=b;
				b=a;
				a=aux;
			}
			System.out.println();
		}
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
