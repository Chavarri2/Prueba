package ejerciciosSeleccion;

import java.util.Scanner;

/**
 * @author Alumno
 * @version 1.0
 * @since 22/10/2026
 * Pedir un número de cinco cifras, decir si es capicúa. 
 * Hacer una versión para números de 5 o menos cifras. 
 */
public class Ejercicio7 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int num, resultado;
		//Entrada y salida de datos
		do{
			System.out.println("Introduce un numero de 5 cifras");
			num=teclado.nextInt();
		}while((num>10000)&&(num<-10000));
		
		resultado=alReves(num);
		
		if(resultado==num) {
			System.out.println("El numero "+num+" es capicúa");
		}else {
			System.out.println("El numero "+num+" no es capicúa");
		}
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	public static int alReves(int num) {
		int c1, c2, c3, c4, c5, resultado;
		c1=num%10;
		c2=num%100/10;
		c3=num%1000/100;
		c4=num%10000/1000;
		c5=num%100000/10000;
		if((num>10000)||(num<-10000)) {
			resultado= c1*10000+c2*1000+c3*100+c4*10+c5;
		}else if((num>1000)||(num<-1000)){
			resultado= c1*1000+c2*100+c3*10+c4;
		}else if((num>100)||(num<-100)){
			resultado= c1*100+c2*10+c3;
		}else if((num>100)||(num<-100)){
			resultado= c1*10+c2;
		}else{
			resultado= c1;
		}
		return resultado;
	}

}
