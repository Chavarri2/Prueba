package ejercicicios;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 1/10/2026
 * Contar de 1 a 10. (Ejemplo) 
 */

public class Ejercicio17 {

	public static void main(String[] args) {
		//inicializamos variable
		int num=0;
		
		//Usamos estructura de repeticion Mientras (while) para contar hasta diez y mostrar cada numero
		//Por pantalla
		while (num<=10) {
			//Cada iteracion lo muestra por pantalla num y suma uno a la variable 
			System.out.println(num++);
		}

	}
}
