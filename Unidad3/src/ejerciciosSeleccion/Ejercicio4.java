package ejerciciosSeleccion;

import java.util.Scanner;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @sinces 19/10/2026
 * Pedir tres números y mostrarlos ordenados de mayor a menor.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int num1,num2,num3;
		//Entrada y salida de datos
		System.out.println("Introduce un primer numero");
		num1=teclado.nextInt();
		System.out.println("Introduce un segundo numero");
		num2=teclado.nextInt();
		System.out.println("Introduce un tercero numero");
		num3=teclado.nextInt();
		//Usamos condicional if para evaluar el orden del numero mayor al menor
		if(num1>num2 && num1>num3 ) {
			if(num2>num3) {
				System.out.println(num1+"\n"+num2+"\n"+num3);
			}else {
				System.out.println(num1+"\n"+num3+"\n"+num2);
			}
		}else if(num2>num1 && num2>num3) {
			if(num1>num3){
				System.out.println(num2+"\n"+num1+"\n"+num3);
			}else {
				System.out.println(num2+"\n"+num3+"\n"+num1);
			}
		}else {
			if(num1>num2) {
				System.out.println(num3+"\n"+num1+"\n"+num2);
			}else {
				System.out.println(num3+"\n"+num2+"\n"+num1);
			}
			
		}
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
