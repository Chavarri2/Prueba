package ejerciciosBuclesAnidados;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 20/10/2026
 * Ejercicio 9. Números primos
 * Escribe un programa que pida un número N mayor o igual que 2 y muestre todos los
 * números primos entre 2 y N, separados por espacios. Al final, indica cuántos ha
 * encontrado.
 * Para cada número, la búsqueda de divisores debe detenerse en cuanto se encuentre uno.
 * Recuerda que no puedes usar break .
 * Introduce N: 30
 * 2 3 5 7 11 13 17 19 23 29
Primos encontrados: 10
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		//Creamos objeto de clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Inicializamos variables
		int num=0,contador=0;
		while(num<2) {
		//Salida y entra de datos
		System.out.println("Introduce un numero");
		num=teclado.nextInt();
		}
		System.out.println("\nHas introducido el numero: "+num);
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
					System.out.print(i+" ");
				}else {
					contador=0;
				}
			}
			//Salida de mensaje de error
		}else {
			System.err.println("Error: El numero ingresado no puede ser 0 o menor");
		}
		System.out.println("\n============================================");
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
