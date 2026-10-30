package ejercicios;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 30/10/2026
 * Números de Armstrong
 * Un número de Armstrong es igual a la suma de sus cifras elevadas al número de cifras que tiene.
 * Por ejemplo, 153 tiene 3 cifras y 1³ + 5³ + 3³ = 153.
 * Escribe un programa que muestre todos los números de Armstrong entre 1 y 10000. Divide el
 * problema en estos métodos: contarDigitos(int n), potencia(int base, int exponente)
 * (reutiliza la del ejercicio 8), sumaPotenciasDigitos(int n) y esArmstrong(int n).
 * Comprobación: deben salir 16 números.
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10000; i++) {
			if (esArmstrong(i)) {
				System.out.print(i+", ");
			}
		}

	}
	
	public static boolean esArmstrong(int numero) {
		return sumaPotenciasDigitos(numero)==numero;
	}
	
	public static int digitos(int numero){
		return numero/10;
	}
	public static long sumaPotenciasDigitos(int numero){
		int base,exponente=contarDigitos(numero);
		long suma=0;
			for (int i = contarDigitos(numero); i > 0; i--) {
				base=numero%10;
				suma=suma+potencia(base, exponente);
				numero=digitos(numero);
			}
		return suma;
	}
	
	public static int contarDigitos(int numero) {
		int contar=1;
		for (int i = 10; i <= numero; i=i*10) {
			contar++;
		}
		return contar;
	}
	
	public static long potencia(int base, int exponente) {
		long resultado=base;
		if(exponente>0) {
			for (int i = 1; i < exponente; i++) {
				resultado= resultado*base;
			}
			return resultado;
		}else {
			return resultado=1;
		}
	}
}
