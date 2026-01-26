package bucles;

import java.util.Scanner;

/*
 * Carlos Abraham Chavarri Valera
 * fecha:3/10/2025
 * Programa que esta pidiendo numeros continuamente hasta que introducimos el cero
 */
public class EjemploWhile2 {

	public static void main(String[] args) {
		//Declarar variable
		int numero,contar,suma;
		Scanner teclado=new Scanner(System.in);
		numero=0;
		contar=0;
		suma=0;
		String numerosIntroducidos="";
		//proceso
		System.out.println("Introduce el primer valor: ");
		numero=teclado.nextInt();
		while(numero !=0) {
			contar++;
			suma=suma+numero;
			numerosIntroducidos=numerosIntroducidos +" "+numero;
			System.out.println("Has introducido el nuemro: " + numero);
			System.out.println("Introduce otro numero: ");
			numero=teclado.nextInt();
		}
		System.out.println("Has introducido " +contar+" numeros y la suma de todos los numeros vale: "+ suma+" los numeros que has introducido son:"+numerosIntroducidos);
		System.out.println("Fin del programa");
		teclado.close();
	}

}
