package ejercicios_Conversiones;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 21/10/2026
 * Declara un long con valor 32000. Conviértelo a short y observa el resultado. */
public class Ejercicio5 {

	public static void main(String[] args) {
		//Declaramos una variable
		long num1;
		short num2;
		//Asignamos valores
		num1= 32000l;
		num2=(short)num1;
		System.out.println("Valor con long "+num1);
		System.out.println("Valor con short "+num2);
	}

}
