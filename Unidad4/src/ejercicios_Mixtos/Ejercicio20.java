package ejercicios_Mixtos;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 23/10/2026
 * Corrige el programa
 * Este programa tiene 7 errores. Corrígelo.
 * import java.util.scanner; 6
 * public class Ej20 {
 * 	public static void main(String[] args) {
 * 		Scanner sc = new Scanner(System.in);
 * 		final double IVA = 0.21; 1
 * 		int unidades = 2.5;    3
 * 		float precio = 9.99;   2
 * 		String producto = 'Libro'; 4
 * 		IVA = 0.10;                   1
 * 		double total = unidades * precio * (1 + IVA) 7
 * 		boolean caro = precio > 50 && "sí"; 5
 * 		System.out.println(producto + ": " + total + " € (¿caro? " + caro + ")");
 * 		sc.close();
 * 		}
 * 	}
 */
public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final double IVA = 0.21;
		int unidades = 2;
		float precio = 9.99f;
		String producto = "Libro";
		double total = unidades * precio * (1 + IVA);
		boolean caro = true;
		if(precio > 50) {
			caro=true;
		}else {
			caro=false;
		}
		
		System.out.println(producto + ": " + total + " € (¿caro? " + caro + ")");
		sc.close();
	}

}
