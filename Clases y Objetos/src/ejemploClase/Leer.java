package ejemploClase;

import java.util.Scanner;

public class Leer {
	static Scanner teclado=new Scanner(System.in);
	
	public static int leerEntero() {
		System.out.println("Introduce un numero entero: ");
		int n;
		n=teclado.nextInt();
		teclado.nextLine();
		return n;
	}
	public static int leerEntero(String mensaje) {
		System.out.println(mensaje);
		int n;
		n=teclado.nextInt();
		teclado.nextLine();
		return n;
	}

	public static double leerDouble(String mensaje) {
	System.out.println(mensaje);
	double n;
	n=teclado.nextDouble();
	teclado.nextLine();
	return n;
	
	}
	
	public static String leerString(String mensaje) {
	System.out.println(mensaje);
	String s;
	s=teclado.nextLine();
	return s;	
	}	
}
