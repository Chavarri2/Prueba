package ejecicioClase;

public class Ejercicio6 {

	public static void main(String[] args) {
		String s;
		s=Leer.leerString("Introduce tu correo: ");
		while(!s.contains("@")) {
			System.out.println("Error: El correo no existe");
			s=Leer.leerString("Vuelve a Introducir tu correo: ");	
		}
		System.out.println("Comprobado que es un correo");
	}

}
