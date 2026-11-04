package ejerciciosBuclesAnidados;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since
 * Ejercicio 2.Etiquetas de un almacén
 * Un almacén tiene 3 pasillos. Cada pasillo tiene 4 estanterías y cada estantería tiene 3
 * baldas. Escribe un programa que genere la etiqueta de todas las baldas, una por línea, con
 * el formato P<pasillo>-E<estantería>-B<balda> .
 * Antes de ejecutarlo, anota cuántas etiquetas crees que saldrán. Al final, el programa debe
 * mostrar el número de etiquetas generadas.
 * P1-E1-B1
 * P1-E1-B2
 * P1-E1-B3
 * P1-E2-B1
 * ...
 * P3-E4-B3
Etiquetas generadas: ...

 */
public class Ejercicio2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				for (int j2 = 1; j2 <=3; j2++) {
					System.out.println("P"+i+"-"+"E"+j+"-"+"B"+j2);
				}
			}
		}

	}

}
