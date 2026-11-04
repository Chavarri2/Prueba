package ejercicios;
/**
 * @author Alumno
 * @version 1.0
 * @since 29/10/2026
 * Números capicúa
 * Crea la función int invertir(int n) que devuelva el número con sus cifras al revés (por
 * ejemplo, 1234 → 4321). Pista: n % 10 es la última cifra y n / 10 es el número sin ella.
 * Crea después boolean esCapicua(int n), que debe utilizar invertir. En el main, muestra todos
 * los números capicúa entre 100 y 200 y cuántos hay.
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		int contador=0;
		for (int i = 100; i < 200; i++) {
			if(esCapicua(i)) {
				contador++;
				System.out.print(i+", ");
			}
		}
		System.out.println("\nHay "+contador+" numeros capicuas");
	}
	
	public static boolean esCapicua(int numero) {
		return numero==invertir(numero);
	}
	
	public static int invertir(int numero) {
		int invertido=numero%10;
		for (int i = 10; i < numero; i=i*10) {
			invertido=invertido*10;
			invertido=invertido+numero%(i*10)/i;
		}
		return invertido;
	}
}