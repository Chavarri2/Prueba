package ejercicios;
/**
 * @author Carlos
 * @version 1.0
 * @since 16/11/2026
 * Crea un array de String con los días de la semana y muéstralos uno por
 * línea usando un for-each.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		//Inicializamos variables
		String[] listaDiasSamana= {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
		//Salida de datos
		for (String llave : listaDiasSamana) {
			System.out.println(llave);
		}
		
		
	}

}
