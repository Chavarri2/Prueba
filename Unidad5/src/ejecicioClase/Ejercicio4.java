package ejecicioClase;

public class Ejercicio4 {

	public static void main(String[] args) {
		String a,b;
		a=Leer.leerString("Introduce tu nombre");
		b=Leer.leerString("Introduce tu genero (Letra mayuscula M/F)");
		if (b.endsWith("M")) {
			System.out.println("Bienvenido Sr."+a);
		}else if (b.endsWith("F")){
			System.out.println("Bienvenida Sra."+a);
		}else {
			System.out.println("Por favor siga las indicacios la proxima vez");
		}
	}

}
