package ejercicios;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 27/10/2026
 * Crea un procedimiento dibujarLinea() que imprima una línea formada por 40 signos =.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		//Inicilizamos contantes IGUALES
		final int IGUALES=40;
		//Inicializamos variables
		String persona1="Ana Garcia",persona2="Luis Martin",persona3="Marta lopez";
		//Salida de datos
		dibujarLinea(IGUALES);
		System.out.println("       Lista de Alumnos");
		dibujarLinea(IGUALES);
		System.out.println(persona1+"\n"+persona2+"\n"+persona3);
		dibujarLinea(IGUALES);
	}
	
	//Metodo para cologar una fila de iguales
	public static void dibujarLinea(int iguales) {
		for (int i = 0; i < iguales; i++) {
			System.out.print("=");
		}
		System.out.println();
	}

}
