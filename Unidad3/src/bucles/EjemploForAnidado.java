package bucles;

/*
 * Autor: Abderrahman Labiod.
 * Fecha: 06-10-2025.
 * Ejercicio: Ejemplo de clase para explicar el uso de for anidado.
 */
public class EjemploForAnidado {

	public static void main(String[] args) {
		
		/*
		 * int i = 0: 	Valor inicial
		 * --
		 * i <= 10: 	Condición de permanencia (Se evalua cada vez que se entra al bucle
		 * 				determina si se entra o no dependiendo del valor de i)
		 * --
		 * i++: 		Se ejecuta al acabar el bucle, usualmente es un operador 
		 * 				para incrementar o decrementar
		 */
		for (int i = 0; i < 3; i++) {
			/*
			 * Exactamente igual que el de arriba pero se ejecuta el nº de veces
			 * que se ejecute el bucle "for" inicial .
			 * 
			 * Se ejecuta una vez el primer for y el de abajo se ejecutará
			 * el número de veces que se indique en la condición de permanencia.
			 * 
			 * E.j: El primer bucle, en nuestro caso, tiene 3 ciclos, en el primer ciclo se 
			 * ejecutará el segundo bucle los ciclos que se le hayan indicado 
			 * (en nuestro caso 3 veces).
			 * 
			 * En el segundo ciclo se ejecutará otra vez el segundo bucle con sus 3 ciclos,
			 * y así hasta que se cumpla la condición del primer bucle
			 */
			System.out.println("Valor de I: " + i);
			for (int j = 1; j < 4; j++) {
				System.out.print("("+i+","+j+")");
			}
			System.out.println("**");
			
		}

	}

}
