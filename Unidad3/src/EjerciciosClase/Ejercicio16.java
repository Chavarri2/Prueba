package EjerciciosClase;

import java.util.Scanner;

/*
 * Gonzalo Lazaro
 * Fecha:3/10/2025
 * Realizar un algoritmo que lea un número por teclado. En caso de que ese número
sea 0 o menor que 0, se saldrá del programa imprimiendo antes un mensaje de
error. Si es mayor que 0, se deberá calcular su cuadrado y la raíz cuadrada del
mismo, visualizando el numero que ha tecleado el usuario y su resultado (“Del
numero X, su potencia es X y su raíz X”). Para calcular la raíz cuadrada se puede
usar la función interna RAIZ(X) o con una potencia de 0,5
 */
public class Ejercicio16 {

	public static void main(String[] args) {
		// declaracion variables
		int numero;
		Scanner teclado= new Scanner(System.in);
		//entrada de datos
		System.out.println("Introduce un numero");
		numero=teclado.nextInt();
		//proceso
		if (numero < 0){
			System.out.println("Mensaje error");
		}else {
			System.out.println("Del numero " + numero + " su potencia es " + Math.pow(numero, 2));
			System.out.println("Del numero " + numero + " su raiz es " + Math.sqrt(numero));
		}
		teclado.close();
	}

}
