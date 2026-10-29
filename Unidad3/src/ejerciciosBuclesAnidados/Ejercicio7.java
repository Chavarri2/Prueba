package ejerciciosBuclesAnidados;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 
 * @since
 * Ejercicio 7. Distribución de mesas
 * Un profesor quiere colocar las mesas de su aula formando un rectángulo completo, sin
 * huecos. Escribe un programa que pida el número de alumnos y muestre todas las
 * distribuciones posibles en filas × columnas. No deben aparecer repetidas: si ya aparece 
 * 4 × 6, no debe aparecer 6 × 4.
 * Número de alumnos: 24
 * 1 x 24
 * 2 x 12
 * 3 x 8
 * 4 x 6
 * Para pensar. Cuando funcione, cuenta cuántas veces se ejecuta el bucle interno. ¿Se
 * podría resolver con menos vueltas?
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int alumnos;
		//Entrada y salida de datos
		System.out.println("Introduce el numero de alumnos");
		alumnos=teclado.nextInt();
		//bucle for
		for (int i = 1; i <= alumnos; i++) {
			for (int j = 1; j <= alumnos; j++) {
				if(j*i==alumnos && j>=i) {
					System.out.println(i+" x "+j);
				}
			}
		}
		
		//cerramos objeto de la clase Scanner
		teclado.close();
	}

}