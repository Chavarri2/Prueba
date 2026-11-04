package ejercicios;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 27/10/2026
 * Crea un procedimiento mostrarTabla(int n) que muestre la tabla de multiplicar del número n,
 * del 1 al 10, con el formato 7 x 3 = 21. La primera línea debe indicar de qué tabla se trata.
 * Desde el main, llama a mostrarTabla dentro de un bucle para mostrar las tablas del 1 al 5,
 * separadas por una línea en blanco.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		//bucle for que mostrara las tablas de multiplicar del 1 al 5
		//El bucle se recorrera desde 1 hasta 5
		for (int i = 1; i <= 5; i++) {
			System.out.println();
			//Llamamos al metodo tablaMultiplicar
			tablaMultiplicar(i);
		}
		

	}
	//Metodo que hace la tabla de multiplicar de un numero introducido por el usuario
	//Hasta 10
	private static void tablaMultiplicar(int num1) {

		System.out.println("==============================");
		System.out.println("TABLA DE MULTIPLICAR DE "+num1);
		System.out.println("==============================");

		//Si numero es mayor que 1 o menor que 100 entonces hace el bucle for
		if(num1>1 || num1<100) {
			//Este bucle se repite 10 veces
			for (int i = 1; i <= 10; i++) {
				//Imprime por pantalla num1*iteracion=resultado de multiplicacion
				System.out.println(num1+" * "+ i +" = "+ (i*num1));
			}
		}

		//Salida por pantalla
		System.out.println("==============================");

	}

}
