package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 6/10/2026
 * Hacer un programa que vaya leyendo números por el teclado hasta que lea el cero
 * que indicará fin de entrada de datos, el programa debe calcular y escribir la suma de
 * los introducidos en lugar par y los introducidos en lugar impar, es decir los
 * introducidos primero, tercero, quinto … etc. y la suma de los introducidos el
 * segundo, cuarto, sexto ... etc.
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		//Creamos objeto de clase Scanner
		Scanner teclado=new Scanner(System.in);

		//Declaramos e Inicializamos variables
		int num,contador=0,sumaPar=0,sumaImpar=0;

		//Usamos bucle while que se repetira mientras el numero introducido por el usuario sea distinto de cero
		do {
			//Salida y entrada de datos
			System.out.println("Introduce un numero");
			num=teclado.nextInt();
			contador++;
			//Usamos condicion if para evaluar
			//Si el resto de contador entre 2 es igual que cero hace sumaPar mas numero
			//Sino hace sumaImpar mas numero
			if(contador%2==0) {
				sumaPar=sumaPar+num;

			}else {
				sumaImpar=sumaImpar+num;

			}
		}while(num!=0);

		//Salida de datos
		System.out.println("La suma de todos los numeros introducidos en las posiciones par es : "+sumaPar);
		System.out.println("La suma de todos los numeros introducidos en las posiciones impar es : "+sumaImpar);

		//Cerramos objeto de clase Scanner
		teclado.close();
	}

}
