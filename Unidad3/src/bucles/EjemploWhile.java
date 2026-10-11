package bucles;
/*
 * Carlos Abraham Chavarri Valera
 * fecha:3/10/2025
 * Es un Ejercicio para explicar while
 */
public class EjemploWhile {

	public static void main(String[] args) {
		// Declarar variables
		int numero=0;
		//while en el que no se entra
/*		System.out.println("Antes del bucle");
		while (numero<0) {
			System.out.println("Dentro del bucle");
		}

		System.out.println("Fuera del bucle");
		//while infinito
		System.out.println("Antes del bucle");
		while (numero>0) {
			System.out.println("Dentro del bucle");
		}
		System.out.println("Fuera del bucle");*/
		//while finito
		//System.out.println("Antes del bucle, el valor del numero"+numero);
		while (numero <10) {
			System.out.println("Dentro del bucle, el valor del numero es: "+numero);
			numero=numero+1;
		}
		System.out.println("Despues del bucle, el valor del numero: "+ numero);
	}

}
