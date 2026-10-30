package ejercicios;
/**
 * @author Alumno
 * @version
 * @since
 * El juego del 7
 * En el juego del 7 se cuenta en voz alta, pero cuando el número es múltiplo de 7 o termina en 
 * hay que decir «¡Plof!» en su lugar.
 * Crea dos funciones booleanas: esMultiplo(int numero, int divisor) y terminaEn(int
 * numero, int cifra). Utilízalas en el main para jugar del 1 al 50. La salida empieza así: 1 2 3 4 5
 * 6 ¡Plof! 8 9 10 11 12 13 ¡Plof! 15 16 ¡Plof! …
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		//Constante
		final int NUMERO=7;
		
		for (int i = 1; i <= 50; i++) {
			if(esMultiplo(i, NUMERO) || terminaEn(i, NUMERO)) {
				System.out.print("¡Plof! ");
			}else {
				System.out.print(i+", ");
			}
			if(i%10==0) {
				System.out.println();
			}
		}

	}
	public static boolean esMultiplo(int numero, int divisor) {
		return numero%7==0;
	}
	
	
	public static boolean terminaEn(int numero, int cifra) {
		return numero%10==cifra;
	}
}