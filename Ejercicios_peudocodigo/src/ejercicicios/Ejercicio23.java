package ejercicicios;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/10/2026
 * Desarrollar un algoritmo que calcule y muestre el cuadrado de los 9 primeros
 * números naturales. 
 */
public class Ejercicio23 {

	public static void main(String[] args) {
		//Constante inicializada a 9
		final int N=9;
		//Inicializamos variables
		int contador=1;
		
		//bucle que se repetira hasta llegar a N
		while(contador<=N) {
			System.out.println(Math.sqrt(contador));
			contador++;
		}
	}

}
