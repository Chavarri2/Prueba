package ejecicioClase;

public class Ejercicio3 {

	public static void main(String[] args) {
		String a,b,c;
		a=Leer.leerString("Introduce tu nombre");
		b=Leer.leerString("Introduce tu primer apellido");
		c=Leer.leerString("Introduce tu segundo apellido");
		System.out.println("Las iniciales son: "+ a.charAt(0)+"."+b.charAt(0)+"."+c.charAt(0));
	}

}
