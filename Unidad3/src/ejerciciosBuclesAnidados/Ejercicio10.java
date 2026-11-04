package ejerciciosBuclesAnidados;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera 
 * @version 1.0
 * @since 21/10/2026
 * Ejercicio 10.Temporizador de cocina
 * Escribe un programa que pida los minutos y los segundos de una cuenta atrás y muestre
 * todos los instantes, un segundo por línea, hasta llegar a 00:00 . Los minutos y los
 * segundos se muestran siempre con dos cifras. Valida que los segundos estén entre 0 y 59.
 * Usa bucles while en lugar de for .
 * Minutos: 1
 * Segundos: 3
 * 01:03
 * 01:02
 * 01:01
 * 01:00
 * 00:59
 * 00:58
 * ...
 * 00:01
 * 00:00
 * ¡Tiempo!
 */
public class Ejercicio10 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Inicializamos variables
		int contador=0,minutos=-1,segundos=-1;
		//Usamos bucle while que se repetira mientras que minutos y segundos sean
		//menor que 0 o mayor que 59
		while((segundos<0 || segundos>59) || (minutos<0 || minutos>59)) {
			//Salida y entrada de datos
			System.out.println("Introduce los minutos");
			minutos=teclado.nextInt();
			System.out.println("Introduce los segundos");
			segundos=teclado.nextInt();
		}
		System.out.println("Minutos introducidos: "+ minutos);
		System.out.println("Segundos introducidos: "+ segundos);
		//Igualamos contador a segundos
		contador=segundos;
		//Usamos bucle while que se repetira mientras que minutos sea mayor 0 igual que cero
		while(0<=minutos) {
			//Usamos bucle while que se repetira mientras que contador sea mayor o igual que 0
			while(0<=contador) {
				//Usamos condicional if para que siempre que minutos sea menor que 10 se imprima cero
				if(minutos<10) {
					System.out.print("0");
				}
				//Imprimimos el valor de minutos y ":"
				System.out.print(minutos+":");
				//Usamos condicional if para que siempre que contador sea menor que 10 se imprima cero
				if(contador<10) {
					System.out.print("0");
				}
				//Imprimimos el valor de contador
				System.out.print(contador);
				//Reducimos el valor de contador
				contador--;
				//Hacemos salto de linea
				System.out.println();
			}//Fin de bucle interno
			//Le volvemos a dar el valor a contador a 59 para volver a entrar al bucle interno
			contador=59;
			//Restamos 1 a minutos para que no se quede el bucle externor en repeticion infinita
			minutos--;
		}//Fin de bucle externo
		//Salida de datos por pantalla
		System.out.println("¡Tiempo!");
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
