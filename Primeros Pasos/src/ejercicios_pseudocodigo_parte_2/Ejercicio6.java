package ejercicios_pseudocodigo_parte_2;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 6/10/2026
 * Hacer un programa que lea una serie de números por teclado de manera que cuando
 * el número leído sea el cero ya no se introduzcan más, el programa debe calcular y
 * escribir la suma de los números de la serie que son múltiplos de 5 y cuántos se han
 * introducido en total
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		//Creamos objeto de clase Scanner
		Scanner teclado=new Scanner(System.in);

		//Declaramos e Inicializamos variables
		int num,suma=0,contador=0;

		//Salida y entrada de datos
		System.out.println("Introduce un numero");
		num=teclado.nextInt();

		//Usamos bucle while que se repetira mientra que el numero que introduzca el usuario sea
		//distinto de cero
		while(num!=0) {
			
			//Usamos condicional if para evaluar una condicion
			//Si el resto de numero entre 5 es igual a cero entra y suma el numero a la suma
			if(num%5==0) {
				suma=suma+num;
				contador++;
			}
			
			//Salida y entrada de datos
			System.out.println("Introduce un numero");
			num=teclado.nextInt();
		}
		
		//Usamos condicional if para evaluar condicion
		//Si contador es igual que cero mostrara el mensaje que no se han introducidos multiplos de 5
		if(contador==0) {
			System.out.println("No se han introducidos multiplos de 5");
		}else {
			System.out.println("La suma de todos los numeros multiplos de 5 introducidos es:  "+ suma
					+" \nNumero total de multiplos de 5 introducidos: "+contador);
			
		}
		
		//Cerramos objeto de clase Scaner
		teclado.close();
	}

}
