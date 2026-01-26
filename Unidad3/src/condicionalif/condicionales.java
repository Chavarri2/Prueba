package condicionalif;

import java.util.Scanner;

/*
 * Carlos Abraham Chavarri Valera
 * Ejecicio para aprender los condicionales
 * Introducimos un numero y nos dice si es par o impar
 */
public class condicionales {

	public static void main(String[] args) {
		// Declaramos variamos
		int dato;
		Scanner var1=new Scanner(System.in);
		String salida;
		//Entrada de datos
		System.out.println("Introduce un numero");
		dato=var1.nextInt();
		//proceso
		if (dato % 2==0 ) {
			salida="El numero es par";
		}else if (dato < 0){
			salida="El numero es negativo";
		} else {
			salida="El numero es impar";
		}
		//saldia
		System.out.println(salida);
		var1.close();
	}

}
