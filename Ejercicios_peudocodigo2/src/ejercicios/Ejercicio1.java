package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 6/10/2026
 * Escribir un programa que calcule e imprima la SUMA de los números impares
 * comprendidos entre a y b que deben leerse por teclado y filtrarse para que a<=b
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int num1, num2, suma=0;
		
		//Entrada y salida de datos
		System.out.println("Introduce un primer numero");
		num1=teclado.nextInt();
		System.out.println("Introduce un segundo numero");
		num2=teclado.nextInt();
		
		//Usamos if para evaluar condicion
		//Si num1 es mayor que num2 hacemos el bucle for que va desde num2 hasta num1
		//Y en cada iteracion hacemos otra condicional para evaluar que numeros son impares
		//Es decir, si i tanto por ciento 2 es distinto a 0 entonces suma "suma" y la iteracion 
		//Sino entra evalua la otra condicion que es practicamente igual pero en vez de recorre de
		//num2 a num1 recorremos de num1 a num2
		if(num1>num2) {
			for (int i = num2; i < num1; i++) {
				if(i%2!=0) {
					suma=suma+i;
				}
			}
		}else if(num1<num2) {
			for (int i = num1; i < num2; i++) {
				if(i%2!=0) {
					suma=suma+i;
				}
			}
		}
		
		//Salida de datos
		System.out.println("La suma de los numeros impares entre "+num1+" y "+num2+" es :"+suma);
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
