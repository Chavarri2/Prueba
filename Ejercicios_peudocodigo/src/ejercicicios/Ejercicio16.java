package ejercicicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 1/10/2026
 * Realizar un algoritmo que lea un número por teclado. En caso de que ese número
 * sea 0 o menor que 0, se saldrá del programa imprimiendo antes un mensaje de
 * error. Si es mayor que 0, se deberá calcular su cuadrado y la raíz cuadrada del
 * mismo, visualizando el numero que ha tecleado el usuario y su resultado (“Del
 * numero X, su potencia es X y su raíz X”). Para calcular la raíz cuadrada se puede
 * usar la función interna RAIZ(X) o con una potencia de 0,5. 
 */
public class Ejercicio16 {

	public static void main(String[] args) {
		//Inizializamos una constante llamada exponente
		final double EXPONENTE=2;

		//Creamos un objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);

		//Declaramos variables
		double num, potencia,cuadrada;

		//Salida y entrada de datos
		System.out.println("Introduce un numero: ");
		num=teclado.nextInt();

		//Usamos estructura condicional if para evaluar si el numero es mayor que cero
		if(num<=0) {
			System.out.println("Error: El numero no puede ser menor o igual que 0");
		}else {
			cuadrada= Math.sqrt(num);
			potencia= Math.pow(num, EXPONENTE);
			System.out.println("La raiz de numero "+num+" es " +cuadrada+" y su potencia es"+potencia);
		}

		//Cerramos Clase Scanner
		teclado.close();
	}

}
