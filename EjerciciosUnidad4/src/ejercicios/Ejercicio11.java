package ejercicios;

public class Ejercicio11 {

	public static void main(String[] args) {
		for (int i=1; i<=100;i++) {
			if (esPrimo(i)) {
				System.out.println("El numero "+i+" es primo");
			}
		}

	}
	//Metodo que comprueba si un numero es primo o no mas eficiente
	public static boolean esPrimo2(int n) {
		//bucle que busque si el numero partido por la mitad
		for (int i=2; i<=n/2;i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
	//Metodo que me dice los divisores de un numero
	public static int numeroDivisores(int num) {
		int contador=0;
		for (int i=1;i<=num;i++) {
			if (num%i ==0) {
				contador++;
			}
		}
		return contador;
	}
	//Metodo que indica si un numero es primo o no
	public static boolean esPrimo(int n) {
		return numeroDivisores(n)==2;
	}
}
