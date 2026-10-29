package ejerciciosBuclesAnidados;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 20/10/2026
 * Ejercicio 5. Calendario de octubre de 2026
 * Escribe un programa que muestre el calendario de octubre de 2026 en forma de
 * cuadrícula, con una semana por línea y la semana empezando en lunes. Octubre tiene 31
 * días y el día 1 cae en jueves.
 * L M X J V S D
 * 1 2 3 4
 * 5 6 7 8 9 10 11
 * 12 13 14 15 16 17 18
 * 19 20 21 22 23 24 25
 * 26 27 28 29 30 31
Ampliación. Pide por teclado en qué día de la semana empieza el mes (1 = lunes, 7 =
domingo) y cuántos días tiene, y muestra el calendario de cualquier mes.
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Inicializamos variables
		int inicio=0, dias=0,contador=1;
		//Entrada y salida de datos
		while((inicio>0 || inicio<7) && (dias<28 || dias>31)) {
			System.out.println("Introduce el dia de la semana (1-7)");
			inicio=teclado.nextInt();
			System.out.println("Introduce cuantos dias tiene el mes");
			dias=teclado.nextInt();
		}
		System.out.println("\nL\tM\tX\tJ\tV\tS\tD\n");
		//bucle for
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 7; j++) {
				if(inicio==j) {
					inicio++;
					System.out.print(contador+"\t");
					if(contador==dias) {
						i=6;
						j=7;
					}
					contador++;
				}else {
					System.out.print("\t");
				}
				
			}
			inicio=1;
			System.out.println();
		}
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
