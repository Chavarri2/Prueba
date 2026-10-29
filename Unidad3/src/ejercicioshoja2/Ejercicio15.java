package ejercicioshoja2;

import java.util.Scanner;

/*
 * Evis Amponsah
 * 16/10/25
 * Realizar un programa que elija mediante un menú un tipo de figura:
 Triángulo
 Cuadrado
 Rectángulo
Una vez elegida la opción, nos tiene que pedir en cada caso los datos necesarios para
calcular su área y mostrarla
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		//definir variables
		int opcion;
		Scanner teclado=new Scanner(System.in);
		double base,altura,area;
		//imprimir el menu
		do {
		System.out.println("Introduce un numero \n 1.Triangulo \n 2.Cuadrado \n 3.Rectangulo  \n 0.Salir");
		opcion=teclado.nextInt();
		
		switch (opcion) {
		case 0: 
			System.out.println("has elegido 0.salir");
			break;
		case 1:
			
			
			System.out.println("Introduce primero la base");
			base=teclado.nextDouble();
			System.out.println("Introduce la altura");
			altura=teclado.nextDouble();
			area=base*altura/2;
			System.out.println("el area del triangulo es "+ area);
			
			break;
		case 2:
			
			System.out.println("Has elegido 2.Cuadrado");
			System.out.println("Introduce el lado");
			base=teclado.nextDouble();
			
			
			area=base*base;
			System.out.println("el area del cuadrado es "+ area);
			break;
		case 3:
			System.out.println("Has elegido 3.Rectangulo");
			System.out.println("Introduce primero la base");
			base=teclado.nextDouble();
			System.out.println("Introduce la altura");
			altura=teclado.nextDouble();
			area=base*altura;
			System.out.println("el area del rectangulo es "+ area);
			break;
		default:
			System.out.println("Error opcion erronea");
		}
		}while(opcion!=0);
		System.out.println("fin de programa");
		
		teclado.close();
	}
	
	
	

}
