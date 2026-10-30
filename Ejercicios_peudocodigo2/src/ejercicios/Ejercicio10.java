package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 6/10/2026
 *  Dado un numero n que filtraremos a que sea positivo, escribir un programa que nos
 *  diga cuál es el numero primo más cercano a él por debajo.
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos e inicializamos variables
		int num,contador=0,primo=0;
		
		//Entrada y Salida de datos
		System.out.println("Introduce un numero");
		num=teclado.nextInt();
		
		//Evaluamos condicion que numero tiene que ser mayor que cero 
		if(num>0) {
			//Usamos bucle for para repetir desde num hasta 1
			for (int i = num; i >= 1; i--) {
				//Usamos bucle for para repetir desde 1 hasta iteracion
				for(int j = 1; j <= i; j++) {
					//Si el resto de i entre j es igual que cero entonces sumamos uno a contador
					if(i%j==0) {
						contador++;
					}
				}
				//Si contador es igual que dos o uno entonces primo es igual a iteracion y despues iteracion es igual a 1
				//Sino igualamos contador a 0
				if(contador == 2 || contador==1) {
					primo=i;
					i=1;
				}else {
					contador=0;
				}
			}
			
			//Salida por pantalla
			System.out.println("El numero primo mas cercano es: "+ primo);
		}else {
			//Salida de error por pantalla
			System.err.println("El numero debe ser mayor que cero");
		}
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
