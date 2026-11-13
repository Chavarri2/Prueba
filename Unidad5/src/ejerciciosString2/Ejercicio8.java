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
		String frase;
		int clave;
		System.out.println("Introduce una frase ");
		frase=teclado.nextLine();
		System.out.println("Introduce la llave del cifrado");
		clave=teclado.nextInt();
		frase=frase.toUpperCase();
		System.out.println(cifradoCesar(frase, clave));
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	
	public static String cifradoCesar(String frase, int clave) {
		String alfabeto="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		StringBuilder fraseCifrada= new StringBuilder();
		for (int i = 0; i < frase.length(); i++) {
			char letra= frase.charAt(i);
			if(letra==' ') {
				fraseCifrada.append(' ');
			}else{
				int posicion = (alfabeto.indexOf(letra) + clave) % alfabeto.length();
	            fraseCifrada.append(alfabeto.charAt(posicion));
			}
		}
		return fraseCifrada.toString();
	}
}
