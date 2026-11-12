package ejerciciosString2;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 9/11/2026
 * Leer una frase filtrándola a que todos sus caracteres sean mayúsculas, una vez filtrada y dado 
 * un numero entre 1 y 10 haga un cifrado de la frase (denominado cifrado CESAR) del modo siguiente, si
 * el numero por ejemplo es 3, transforme la frase de manera que cada carácter se transforme en 
 * 3 códigos ASCII mas es decir : Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		String frase="", fraseCifrada;
		int llave=0, numeroLetraCifrada;
		System.out.println("Introduce una frase ");
		frase=teclado.nextLine();
		System.out.println("Introduce la llave del cifrado");
		llave=teclado.nextInt();
		numeroLetraCifrada=(llave+1)%27;
		System.out.println(numeroLetraCifrada);
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	
	public static StringBuilder cifradoCesar(String frase) {
		StringBuilder fraseCifrada=new StringBuilder();
		
		return fraseCifrada;
	}
}
