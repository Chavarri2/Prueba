package ejerciciosBuclesAnidados;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 20/10/2024
 * Nivel 3 · Combinando while, do-while y for
 * Ejercicio 8. Plano de un aparcamiento
 * Escribe un programa que pida el número de plantas de un aparcamiento y el número de
 * plazas por planta. Ambos valores deben estar entre 1 y 10: si el usuario introduce un valor
 * fuera de ese rango, el programa lo vuelve a pedir hasta que sea correcto.
 * Después, el programa muestra el plano con una línea por planta y las plazas numeradas. Al
 * terminar, pregunta si se quiere dibujar otro plano (1 = sí, 0 = no) y repite todo el proceso
 * mientras la respuesta sea 1.
 * Ejercicios de bucles anidados
 * Page 3 of 5
 * Número de plantas (1-10): 12
 * Número de plantas (1-10): 2
 * Plazas por planta (1-10): 4
 * Planta 1: [1] [2] [3] [4]
 * Planta 2: [1] [2] [3] [4]
 * ¿Otro plano? (1 = sí, 0 = no): 0
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Inicializamos variables
		int planta, plazas, continuar=1;
		//Entrada y salida de datos
		do {
			System.out.println("Introduce las plantas (1-10)");
			planta=teclado.nextInt();

			System.out.println("Introduce las plazas (1-10)");
			plazas=teclado.nextInt();
			for (int i = 1; i <= planta; i++) {
				System.out.print("Planta "+i);
				for (int j = 1; j <= plazas; j++) {
					System.out.print(" ["+j+"]");
				}
				System.out.println();
			}
			System.out.println("¿Otro plano? (1 = sí, 0 = no)");
			continuar=teclado.nextInt();
		}
		while(continuar==1 && (planta>0 || planta<=10) && (plazas>0 || plazas<=10));

		System.out.println("Fin dle programa");

		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
