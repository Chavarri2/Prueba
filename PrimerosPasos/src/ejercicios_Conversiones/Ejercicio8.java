package ejercicios_Conversiones;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 21/10/2026
 * Declara float precio = 9.75f; y conviértelo a int. ¿Qué ocurre con los decimales?
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		//Declaramos variables
		float precio;
		int convertido;
		//Asignamos valores
		precio=9.75f;
		convertido=(int)precio;
		//Salida de datos
		System.out.println("Valor decimal "+precio);
		System.out.println("Valor entero "+convertido);
		//El entero redondea el numero hacia abajo 9.75 --> 9
	}

}
