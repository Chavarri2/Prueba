package examenResuelto;

/**
 * Clase para demostrar como funciona la clase Utilidades con ejemplos varios
 * 
 * @author Abderrahman Labiod
 * @version 1.0_26-11-25
 */
public class GestionCadenas {

	public static void main(String[] args) {
		
		String cad1 = "";
		String cad2 = "";
		String union12 = "";
		
		do {
			do {
				cad1 = Leer.leerString("Introduce una cadena a concatenar: ");
			} while (!Utilidades.esValido(cad1));
			
			do {
				cad2 = Leer.leerString("Introduce la siguiente cadena a concatenar: ");
			} while (!Utilidades.esValido(cad2));
			
			union12 = Utilidades.concatenar(cad1, cad2);
			
			System.out.println("Las cadenas introducidas se concatenan: " + union12);
			
			if (Utilidades.esPalindromo(union12)) System.out.println("Esta unión es palíndroma!");
			else System.out.println("Esta unión no es palíndroma...");
		} while(!Utilidades.esPalindromo(union12));
	}

}
