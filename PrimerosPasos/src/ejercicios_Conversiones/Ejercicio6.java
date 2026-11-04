package ejercicios_Conversiones;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 21/10/2026
 * Declara int a = 7, b = 2;.
 * ●	Calcula a / b (entero).
 * ●	Convierte a double y calcula la división real.
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		//Declaramos variables
		int a, b;
		//Asignamos valores
		a=7;
		b=2;
		//Salida de datos
		System.out.println("Division con enteros "+(a/b));
		System.out.println("Division real "+((double)a/(double)b));
	}

}
