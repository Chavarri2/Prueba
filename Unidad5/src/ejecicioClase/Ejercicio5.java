package ejecicioClase;

public class Ejercicio5 {

	public static void main(String[] args) {
		String a;
		a=Leer.leerString("Introduce tu codigo postal (codigo de 5 cifras XXXXX): ");
		if(a.startsWith("50")) {
			System.out.println("Eres de Zaragoza");
			System.out.println("El numero de provincia: "+a.substring(0, 2));
			System.out.println(" El numero de zona postal es: "+a.substring(2,5));
		}else if (a.startsWith("22")) {
			System.out.println("Eres de Huesca");
			System.out.println("El numero de provincia: "+a.substring(0, 2));
			System.out.println(" El numero de zona postal es: "+a.substring(2,5));
		}else if (a.startsWith("44")) {
			System.out.println("Eres de Teruel");
			System.out.println("El numero de provincia: "+a.substring(0, 2));
			System.out.println(" El numero de zona postal es: "+a.substring(2,5));
		}else {
			System.out.println("Eror: Tu provincia no esta registrado o no existe");
		}

	}

}
