package ejerciciosBuclesAnidados;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 19/10/2026
 * Ejercicio 1.Butacas de una sala de cine
 * Una sala de cine tiene 5 filas de 8 butacas. Escribe un programa que muestre el plano de la
 * sala: una línea por fila y cada butaca con el formato [fila-butaca] .
 * Al final, el programa debe mostrar cuántas butacas tiene la sala. Ese total debe calcularlo
 * el programa contando las butacas a medida que las muestra.
 * [1-1] [1-2] [1-3] [1-4] [1-5] [1-6] [1-7] [1-8]
 * [2-1] [2-2] [2-3] [2-4] [2-5] [2-6] [2-7] [2-8]
 * ...
 * [5-1] [5-2] [5-3] [5-4] [5-5] [5-6] [5-7] [5-8]
 * Total de butacas: 40
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 8; j++) {
				System.out.print("["+i+"-"+j+"]"+" ");
			}
			System.out.println();
		}

	}

}
