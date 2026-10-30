package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 8/10/2026
 *  Dado un numero n imprimir la lista de todos los numero primos hasta dicho numero
 *  n.
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		//Creamos objeto de clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos e inicializamos variables
		int num,contador=0;
		//Salida y entra de datos
		System.out.println("Introduce un numero");
		num=teclado.nextInt();
		System.out.println("\n============================================");
		System.out.println("Los numeros primos hasta "+num+" son:");
		if(num>0) {
			//Usamos bucle for que se repetira mientras que i sea mayor que 1
			for (int i = num; i >= 1; i--) {
				//Usamos bucle for que se repetira mientras que j sea menor que i
				for (int j = 1; j <= i; j++) {
					//Si el resto entre i y j es igual que cero entonces contador sumara 1
					if(i%j==0){
						contador++;
					}
				}
				//Evaluamos condicion si contador es igual que dos o uno entonces mostrara 1
				//Sino el contador se reinicia a cero
				if(contador==2 || contador==1) {
					//Salida de datos
					System.out.println(i);
				}else {
					contador=0;
				}
			}
			//Salida de mensaje de error
		}else {
			System.err.println("Error: El numero ingresado no puede ser 0 o menor");
		}
		System.out.println("============================================");
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
