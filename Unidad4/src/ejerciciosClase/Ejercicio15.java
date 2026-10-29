package ejerciciosClase;

/*Daniel Ionut Carindatoiu
 * 29/10/25
 * Un numero es perfecto si es igual a la suma de todos sus divisores positivos menores que él.
Genera un programa utilizando métodos y funciones que escriba todos los números
perfectos del uno al 100.
 */

public class Ejercicio15 {

	public static void main(String[] args) {
		
		for (int i = 1; i<=1000; i++) {
			
			if(esPerfecto(i)) { System.out.println(i + " es perfecto");}
			
		}

	}
	
	public static int sumaDivisores(int n) {
		
		int suma = 0;
		
		for (int i = 1; i < n; i++) {
			
			if(n%i == 0) {suma += i;}
			
		}
		
		return suma;
	}
	
	public static boolean esPerfecto(int n) {
		return n == sumaDivisores(n);
	}

}
