package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 8/10/2026
 * Dado un numero n leído por teclado encontrar el numero p primo mas cercano a él
 * por exceso.
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		//Creamos objeto de clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos e inicializamos variables
		int numero,primo,salida=1,contador=0;
		//Salida y entrada de datos
		System.out.println("Introduce un numero");
		numero=teclado.nextInt();
		//Asignamos a primo el mismo valor que numero
		primo=numero;
		//Hara todas las operaciones siempre que numero sea mayor que cero
		if(numero>0) {
			//Bucle while que se repetira mientras la salida sea 1
			while(salida==1) {
				//Bucle for que se repetira mientras que primo sea mayor que uno
				for (int i = primo; i >= 1; i--) {
					//Si el resto entre primo y iteracion es 0 entonces contador sumara 1
					if(primo%i==0) {
						contador++;
					}
				}
				//Si contador es igual que 1 o 2 entonces cambiara salida a cero
				//Haciendo que el bucle while ya no se repita
				//Sino contador volvera a cero y a primo se le sumara 1
				if(contador==1 || contador==2) {
					salida=0;
				}else {
					contador=0;
					primo++;
				}
			}
			//Salida por consola que mostrara el resultado
			System.out.println("El numero primo mas cercano a "+numero+" es: "+primo);
		}else {
			//Salida por consola que mostrara mensaje de error
			System.out.println("Error el numero no puede ser cero o menor");
		}
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
