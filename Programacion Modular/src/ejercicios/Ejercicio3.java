package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 27/10/2026
 * Crea dos procedimientos que reciban la altura del triángulo:
 * dibujarTriangulo(int altura) dibuja un triángulo rectángulo alineado a la izquierda, y
 * dibujarTrianguloCentrado(int altura) dibuja una pirámide centrada.
 * El main pedirá la altura por teclado y dibujará los dos triángulos.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int altura;
		//Salida y entrada de datos
		do {
		System.out.println("Introduce la altura");
		altura=teclado.nextInt();
		}while(altura<0);
		
		//Llamamos los metodos dibujarPiramide y dibujarTrianguloRectangulo
		dibujarTrianguloRectangulo(altura);
		dibujarPiramide(altura);
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	
	//Metodo que dibuja una piramide por consola
	public static void dibujarPiramide(int altura) {
		for (int i = 1; i <= altura; i++) {
			for (int j = 0; j <= (altura-i)-1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	//Metodo que dibuja un triangulo rectangulo por consola
	public static void dibujarTrianguloRectangulo(int altura) {
		for (int i = 1; i <= altura; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
