package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 6/10/2026
 *  Dados dos números p y q que leeremos por teclado y que deben ser positivos, hacer
 *  un programa que nos diga cual de los dos tiene más divisores, con un mensaje que
 *  diga “p tiene mas divisores que q” ó viceversa.
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int num1,num2,contador1=0,contador2=0;
		
		//Salida y entrada de datos
		System.out.println("Introduce un primer numero");
		num1=teclado.nextInt();
		System.out.println("Introduce un segundo numero");
		num2=teclado.nextInt();
		
		//Usamos condicional if y evaluamos condicion
		//Si numero1 y numero2 son mayores que 0 y numero1 es mayor que numero2 entonce
		//Hacemos el bucle for que ira desde el 1 hasta numero1
		//Si numero2 es mayor entonces el bucle se recorrera desde 1 hasta numero2
		if(num1>0 && num2>0 && num1>num2) {
			for (int i = 1; i < num1; i++) {
				//Evaluamos condicion si resto de num1 entre iteracion es igual que cero entonce contador1 suma 1
				if(num1%i==0) {
					contador1++;
				}
				//Evaluamos condicion si resto de num2 entre iteracion es igual que cero entonce contador2 suma 1
				if(num2%i==0) {
					contador2++;
				}
			}
		}else if (num1>0 && num2>0 && num1<num2) {
			for (int i = 1; i < num1; i++) {
				if(num1%i==0) {
					contador1++;
				}
				if(num2%i==0) {
					contador2++;
				}
			}
		}
		
		//Evaluamos condiciones si numero1 y numero2 son mayores que cero y contador1 es mayor que contador2
		//entonces mostrara un mensaje diciendo que numero1 tiene mas divisores que numero2
		//Sino validamos la siguiente condicion numero1 y numero2 son mayores que cero y contador1 es menor que contador2
		//entonces mostrara un mensaje diciendo que numero2 tiene mas divisores que numero1
		if(num1>0 && num2>0 && contador1>contador2) {
			System.out.println("El numero "+num1+" tiene mas divisores que "+num2);
		}else if(num1>0 && num2>0 && contador1<contador2){
			System.out.println("El numero "+num2+" tiene mas divisores que "+num1);
		}else {
			System.out.println("Error: el numero tiene que ser mayor que cero");
		}
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
