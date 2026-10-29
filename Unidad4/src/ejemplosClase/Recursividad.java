package ejemplosClase;
/*
 * Carlos Abraham Chavarri Valera
 * 23/10/2025
 * Ejemplo Recursividad
 */
public class Recursividad {
	public static void main(String[] args) {
		//pruebaRecursividad();
		//cuentaAtras(10);
		System.out.println(factorial(5));
	}
	public static void pruebaRecursividad() {
		System.out.println("Hola, que tal");
		pruebaRecursividad();
		System.out.println("Adios");
	}
	public static void cuentaAtras(int n) {
		System.out.println(n);
		if(n>-3)cuentaAtras(n-1);
		System.out.println(n);
	}
	public static long factorial(int n) {
		if (n==0||n==1) {
			return 1;
		}else {
		return n* factorial(n-1);
		}
	}
}
