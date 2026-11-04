package examen;

import java.util.Scanner;

/*
   Carlos Abraham Chavarri Valera
   20/10/2025
   Escribir un programa que pida numeros hasta que la suma
   de todos sea igual o mayor que 100 o hasta que se
   introdusca un numero negativo
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		// Declarar Variables
		float numero = 0,suma = 0, contador = 0;
		Scanner teclado=new Scanner(System.in);
		// Entrada de Datos, Proceso
		do {
			System.out.println("Introduce un numero: ");
			numero=teclado.nextFloat();
			suma=suma+numero;
			contador=contador+=1;
			if(numero<0) {
				break;
			}else {
				continue;
			}
		}while(numero <= 100);
		// Salida de Datos
		System.out.println("Has introducido "+contador+" y la suma de todos los numeros es: "+ suma);
		System.out.println("Fin de pragrama");
		teclado.close();
	}

}
