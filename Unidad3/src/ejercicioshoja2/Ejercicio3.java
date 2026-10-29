package ejercicioshoja2;
import java.util.Scanner;

/* autor: Adrian Celestrin
 * fecha:08/10/2025
 * Leer un número n que debe filtrarse entre 1 y 100 y a continuación calcular y
escribir la tabla de multiplicar de ese número con el siguiente formato

*/
public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Declaracion de variables:
		int numero;
		Scanner entrada=new Scanner(System.in);
		
		//Entrada de datos:
		
		System.out.println("Introduce un numero entre 1 y 100: ");
		numero=entrada.nextInt();
		
		//Validar que esta entre 1 y 100
		
		while(numero<1 ||numero>100) {
			System.out.println("Numero erróneo");
			System.out.println("Introduce un numero entre 1 y 100: ");
			numero=entrada.nextInt();
		}
		//Salida de resultados
		for(int i=0;i<=10;i++) {
			System.out.println(numero+"* "+i+"= "+numero*i);
		}
		
        entrada.close();
	}

}
