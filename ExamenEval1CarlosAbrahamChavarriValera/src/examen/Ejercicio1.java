package examen;

import java.util.Scanner;

/*
 * C.A.Chavarri Valera
 * 05/12/2025
 * Transformacion de elementos como de 
 * entero a caracter, de boolean a byte 
 * de char a short y una media de numeros*/
public class Ejercicio1 {

	public static void main(String[] args) {
		// Definir variables
		int numero, opcion; // Variable de tipo Numeros Entero
		char caracter,caracter2; // Variable de tipo Character
		boolean siNo; // Variable de tipo True/false
		short numeroShort; // Variable de tipo Numeros Enteros(Tiene menos memoria reservada)
		int numero1,numero2; // Variable de tipo Numeros con Decimales 
		byte ternario; // Byte que se usa para ternario 
		String frase; // Variable de tipo String
		// Crear un objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		
		// Bucle do while para el menu
		do {
			// Opciones del menu
			System.out.println("1.-Transformar entero a caracter."+
			"\n2.-Transformar de boolean a byte"+"\n3.-Tansformar de char a short"+
			"\n4.-Media de dos numeros"+"\n0.-Salir");
			System.out.println("\nIntroduzca una opcion: ");
			opcion=teclado.nextInt();
			teclado.nextLine();
			System.out.println();
			
			// Menu con switch
			switch(opcion) {
			case 0:
				System.out.println("Has elegido salir"+"\nFin del programa");
				break;
			case 1:
				System.out.println("Introduce un numero de rango [0-126]");
				numero=teclado.nextInt();
				teclado.nextLine();
				if(numero<=126 && numero>=0) {
					caracter=(char)(numero);
					System.out.println("El numero convertido a caracter es: ["+caracter+"]\nEl numero que ha introducido es: "+numero+"\nEl casteo es explicito"+"\n");
				}else {
					System.out.println("El numero que a elegido esta fuera de rango [0-126]\n");
				}
				break;
			case 2:
				System.out.println("escriba true o false");
				siNo=teclado.nextBoolean();
				teclado.nextLine();
				ternario=(byte) ((siNo==true)? 1 : 0);
				System.out.println("El valor es "+ternario+" el casteo es explicito\nEl valor que se ha introducido es: "+siNo+"\n");
				break;		
			case 3:
				System.out.println("Introduca una frase");
				frase=teclado.nextLine();
				teclado.nextLine();
				caracter2=frase.charAt(0);
				numeroShort=(short) caracter2;
				System.out.println("La primera letra de la frase ["+caracter2+
						"] tiene un valor de "+numeroShort+"\nEl casteo es explicito"+"\nLa frase que ha introducido es: "+frase+"\n");
				
				break;
			case 4:
				System.out.println("Introduzca el primer numero");
				numero1=teclado.nextInt();
				System.out.println("Introduzca el segundo numero");
				numero2=teclado.nextInt();
				System.out.println("La media de sus numeros es: "+((float)(numero1+numero2)/2)+
						"\nSi has introducido un numero entero el casteo es explicito\nLos numeros que ha introducidos son:\n"+numero1+" y "+numero2+"\n");
				teclado.nextLine();
				break;
			default:
				System.out.println("La opcion elegida no es valida");
				break;
			}
		}while(opcion!=0);
		
		
		
		// Cierre del teclado para que no siga consumiendo recursos
		teclado.close();
	}

}
