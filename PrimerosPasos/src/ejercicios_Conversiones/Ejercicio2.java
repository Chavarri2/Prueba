package ejercicios_Conversiones;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 21/10/2026
 * Convierte un número double = 12.9 en un int. ¿Qué valor se obtiene?
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		//Declaramos variables
		double num1;
		int num2;
		//Asignamos valores
		num1=12.9;
		num2=(int)num1;
		//Salida de datos
		System.out.println("Numero decimal "+num1);
		System.out.println("Numero entero "+num2);
	}

}
