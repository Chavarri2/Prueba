/*Miguel Chaves
 * 29/10/2025
 * Crea un programa en el que se genere un numero aleatorio entre uno y 100 y dispongas de 5
intentos para adivinarlo. Cada vez que intentes adivinarlo el ordenador generará un mensaje
indicando si el número a adivinar es mayor o menor. El juego acaba cuando adivinas el
numero o consumes los cinco intentos. Utiliza identificadores globales y funciones para
resolver el problema
 */

package ejerciciosClase;

public class Ejercicio13 {

	public static void main(String[] args) {
		// declaracion variables
		final int numeroVidas=5;
		int n = 0;
		int m = numeroRandom();
		int contador = 0;
		// esta es la parte en la que se juega 
		while (contador <= numeroVidas && n != m) {
			n = Leer.leerEntero("Introduce un numero del 1 al 100");
			contador++;
			System.out.println("Has realizado " + contador + " intentos");
			if (n > m) {
				System.out.println("El numero es menor al que buscas");
			} else if (n < m) {
				System.out.println("El numero es mayor al que buscas");
			}

		} // fin del while
		if (n == m) {
			System.out.println("Has encontrado el numero, el cual es " + m);
		} else {
			System.out.println("Has agotado el numero de intentos");
		}
	}

	// este metodo calcula el numero aleatorio y lo devuelve
	public static int numeroRandom() {
		int n;
		n = (int) (Math.random() * 100 + 1);
		return n;
	}

}
