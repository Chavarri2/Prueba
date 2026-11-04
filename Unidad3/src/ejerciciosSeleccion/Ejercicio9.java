package ejerciciosSeleccion;

import java.util.Scanner;

/**
 *  @author Carlos Abraham Chavarri Valera
 *  @version 1.0
 *  @since 22/10/2026
 *  Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
 *  Con meses de 28, 30 y 31 días. Sin años bisiestos. 
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int dia,mes,year;
		System.out.println("Introduce el dia");
		dia=teclado.nextInt();
		System.out.println("Introduce el mes");
		mes=teclado.nextInt();
		System.out.println("Introduce el años");
		year=teclado.nextInt();
		
		if((year>=0 )&&(mes<13 && mes>0) && (dia<=28 && mes==2) || (dia>0 && dia<=31 && mes!=2)) {
			System.out.println("Fecha correcta: "+dia+"/"+mes+"/"+year);
		}else {
			System.out.println("Fecha incorrecta");
		}
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
