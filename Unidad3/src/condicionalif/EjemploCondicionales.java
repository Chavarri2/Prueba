package condicionalif;

import java.util.Scanner;

/*
 * Realiza un programa uqe me pida roe teclado el numero
 * de dia y me indique si el dia es lectivo (del 1 al 5)
 * festivo (6,7) o desconocido (otros casos)
 * utilizando if, switch y ternarios
 */
public class EjemploCondicionales {

	public static void main(String[] args) {
		// Declaracion de variables
		int numeroDia;
		String salida;
		Scanner teclado=new Scanner(System.in);
		// Entrada de datos
		System.out.println("Introduce un numero de dia");
		numeroDia = teclado.nextInt();
		// Proceso
	/*	if (numeroDia>=1&& numeroDia<=5) {
			salida=" es lectivo";
		}else if ((numeroDia==6) || (numeroDia==7)) {
			salida=" es festivo";
		}else {
			salida=" es dia desconocido";
		}
		System.out.println("El dia que has introducido " + numeroDia + salida);
		switch(numeroDia) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			salida=" es lectivo";
			break;
		case 6:
		case 7:
			salida= " es festivo";
			break;
		default:
			salida= " El dia es desconocido";
			break;
		}*/
		salida=((numeroDia>=1&& numeroDia<=5)? " lectivo":((numeroDia==6) || (numeroDia==7))?" festivo":" desconocido");
		System.out.println("El dia que has introducido " + numeroDia + salida);
		teclado.close();
	}

}
