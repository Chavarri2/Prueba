package ejercicios;

public class Ejercicio7 {

	public static void main(String[] args) {
		sumatorio(5);
		System.out.println(sumatorio(100));
		System.out.println(sumatorioRecursivo(10000));
	}
	public static long sumatorio(long n) {
		long suma=0;
		for (long i=1;i<=n;i++) {
			suma+=i;
		}
		return suma;
	}
	public static long sumatorioRecursivo(long n) {
		if (n<=1) return 1;
		return n+sumatorioRecursivo(n-1);
	}
}
