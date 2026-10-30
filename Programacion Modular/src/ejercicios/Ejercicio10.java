package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 29/10/2026
 * MCD, MCM y fracciones
 * Crea la función int mcd(int a, int b) con el algoritmo de Euclides: mientras b no sea 0, calcula
 * el resto de a entre b, pasa el valor de b a a y el del resto a b. Al terminar, el MCD es a.
 * Crea también int mcm(int a, int b) (el MCM es a · b / MCD, y debe usar mcd), boolean
 * sonCoprimos(int a, int b) (su MCD es 1) y el procedimiento
 * mostrarFraccionSimplificada(int numerador, int denominador), que muestra por ejemplo
 * «12/18 = 2/3».
 * El main pedirá dos números y mostrará el MCD, el MCM, si son coprimos y la fracción
 * simplificada. Imprime también los dos números después de llamar a mcd: ¿han cambiado aunque
 * mcd modifica a y b? Explica por qué.
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int numerador,denominador;
		//Salida y entrada de datos
		System.out.println("Introduce el numerador");
		numerador=teclado.nextInt();
		System.out.println("Introduce el denominador");
		denominador=teclado.nextInt();
		System.out.println("El MCD es: "+mcd(numerador, denominador));
		System.out.println("El MCM es: "+mcm(numerador, denominador));
		System.out.println("Son coprimos: "+sonCoprimos(numerador, denominador));
		System.out.println("Fraccion simplificada: ");
		mostrarFraccionSimplificada(numerador, denominador);
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	
	public static void mostrarFraccionSimplificada(int numerador, int denominador) {
		System.out.println("Dividimos el numerador y el denominador con su mcd de los dos ");
		System.out.println("El numerador simplificado es: "+(numerador=numerador/mcd(numerador, denominador)));
		System.out.println("El denominador simplificado es "+(denominador=denominador/mcd(numerador, denominador)));
		System.out.println("La fraccion simplificada es "+numerador+"/"+denominador);
	}
	
	public static boolean sonCoprimos(int numero1, int numero2) {
		return mcd(numero1, numero2)==1;
	}
	public static int mcm(int numero1, int  numero2) {
		return numero1*numero2/mcd(numero1, numero2);
	}

	public static int mcd(int numero1, int numero2) {
		int resultado=0,auxiliar=numero2;
		if(numero1<numero2) {
			numero2=numero1;
			numero1=auxiliar;
			auxiliar=numero2;
		}
		if(numero2!=0) {
			do {
				auxiliar= numero1%auxiliar;
				if(auxiliar>0) {
					resultado=auxiliar;
				}
			}while(auxiliar!=0);
			return resultado;
		}else {
			return resultado=0;
		}
	}
}