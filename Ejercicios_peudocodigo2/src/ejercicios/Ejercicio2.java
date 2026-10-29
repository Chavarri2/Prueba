package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 6/10/2026
 * Calcular la suma de los cuadrados de los números pares comprendidos entre 1 y n
 * donde n es una variable que se leerá del exterior por el teclado.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int num;
		double suma;
		//Entrada y salida de datos
		System.out.println("Introduce un numero");
		num=teclado.nextInt();

		//Llamamos a la variable cuadradosNumerosPares
		suma=cuadradoNumerosPares(num);
		//Salida de datos
		System.out.println("La suma de todos los cuadrados pares es: "+suma);

		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	
	//Metodo para sumar la raiz cuadrada de los numeros pares
	private static double cuadradoNumerosPares(int num) {
		double suma = 0;
		//Usamos bucle for para recorrer desde i hasta num
		for (int i = 1; i <= num; i++) {
			//Si el numero de la iteracion es par hace la raiz cuadrada y suma lo
			//que ya hay en suma mas la raiz cuadrada
			if(i%2==0) {
				suma=suma+Math.sqrt(i);
			}
		}
		return suma;
	}

}
