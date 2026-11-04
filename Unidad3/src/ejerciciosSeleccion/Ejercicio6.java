package ejerciciosSeleccion;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 21/10/2026
 * Pedir un número de 5 cifras y mostrarlo con las cifras al revés.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variable
		int num;
		String resultado;
		//Entrada y salida de datos
		do{
			System.out.println("Introduce un numero de 5 cifras");
			num=teclado.nextInt();
		}while((num<9999 && num>10000)||(num>-9999 && num<-10000));

		//Hacemos operacion
		if(num<0) {
			num=num*-1;
			resultado=alReves(num);
			System.out.println("El numero al reves es -"+resultado);
		}else {
			resultado=alReves(num);
			System.out.println("El numero al reves es "+resultado);
		}
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	
	public static String alReves(int num) {
		int c1,c2,c3,c4,c5;
		c1=num%10;
		c2=num%100/10;
		c3=num%1000/100;
		c4=num%10000/1000;
		c5=num%100000/10000;
		return ""+c1+c2+c3+c4+c5;
	}

}
