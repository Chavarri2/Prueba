package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 8/10/2026
 *  Un número se dice que es perfecto cuando la suma de sus divisores excluido él es
 *  igual a dicho número. Hacer un programa que lea un número y nos diga si es ó no
 *  perfecto
 */
public class Ejercicio12 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos e inicializamos variables
		int num, suma=0;
		//Salida y entrada de datos
		System.out.println("Introduce un numero");
		num=teclado.nextInt();
		//Usamo condicional if y evaluamos condicion
		//Si num es mayor que 0 entra en el bucle for
		if(num>0) {
			//Bucle for que recorre desde 1 hasta numero introducido por el usuario
			for (int i = 1; i < num; i++) {
				//Evaluamos condicion si el resto entre numero y iteracion es igual que cero entonces 
				if(num%i==0) {
					//Operacion
					suma=suma+i;
				}
			}
			//Si suma es igual que numero entonces mostramos el primer mensaje sino mostramos el segundo
			//Salida por consola
			if(suma==num){
				System.out.println(num+" es un numero perfecto");
			}else {
				System.out.println(num+" no es un numero perfecto");
			}
		}else {
			//Salida de error
			System.err.println("Error: El numero no puede ser cero o menor");
		}

		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
