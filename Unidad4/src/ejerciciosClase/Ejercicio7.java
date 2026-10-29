package ejerciciosClase;

/*
 * Nombre: Abderrahman Ladiod
 * Fecha: 27/10/2025
 * Crea una método sumatorio(int n) que devuelva la suma de todos los números desde 1 hasta n.
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		System.out.println(sumatorioRecursivo(100));
	}
	
	public static long sumatorio(long numero) {
		long suma = 0;
		for (long num = 1; num <= numero; num++) {
			suma += num;
		}
		return suma;
	}
	
	public static long sumatorioRecursivo(long numero) {
		if (numero <= 1) return 1; 
		return numero+sumatorioRecursivo(numero-1);
	}
}
