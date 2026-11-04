package ejecicioClase;

public class Ejercicio7 {

	public static void main(String[] args) {
		String s;
		s=Leer.leerString("Introduce tu correo: ");
		while(!correoValidado(s)) {
			System.out.println("Error: El correo no existe");
			s=Leer.leerString("Vuelve a Introducir tu correo: ");	
		}
		System.out.println("Comprobado que es un correo");
	}
	public static boolean correoValidado (String s) {
		int a, b;
		a=s.indexOf('@');
		b=s.lastIndexOf('.');
		return a>0 && b>a;
	}

}
