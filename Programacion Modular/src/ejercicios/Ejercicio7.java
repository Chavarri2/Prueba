package ejercicios;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 29/10/2026
 * En el juego del 7 se cuenta en voz alta, pero cuando el número es múltiplo de 7 o termina en 7
 * hay que decir «¡Plof!» en su lugar.
 * Crea dos funciones booleanas: esMultiplo(int numero, int divisor) y terminaEn(int
 * numero, int cifra). Utilízalas en el main para jugar del 1 al 50. La salida empieza así: 1 2 3 4 5
 * 6 ¡Plof! 8 9 10 11 12 13 ¡Plof! 15 16 ¡Plof!
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		final int DIVISOR=7,CIFRA=10;
		for (int i = 1; i <= 50; i++) {
			if(terminaEn(i, CIFRA) || esMultiplo(i, DIVISOR)) {
				System.out.print("¡Plof! ");
			}else {
				System.out.print(i+", ");
			}
			if(i%10==0) {
				System.out.println();
			}
		}
	}

	public static boolean terminaEn(int numero, int cifra) {
		if(numero>=10&&numero%cifra==7) {
			return true;
		}else {
			return false;
		}
	}

	public static boolean esMultiplo(int numero, int divisor) {
		//Usamos condicional if para evaluar condicion
		//si el restro de num 2 entre num 1 es igual que cero entonces es multiplo
		if(numero%divisor==0) {
			return true;
		}else {
			return false;
		}

	}
}
