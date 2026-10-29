package ejerciciosClase;

/*
 * Nombre: Abderrahman Ladiod
 * Fecha: 27/10/2025
 * Crea un método contarDigitos(int n) que te devuelva el numero de cifras de n.
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		System.out.println(digitos3(10));
	}
	
	public static int digitos(int num) {
		int contador = 0;
		do {
			num = num/10;
			contador++;
		} while (num != 0);
		return contador;
	}
	
	public static int digitos2(int num) {
		int contador = 0;
		do {
			contador++;
		} while (num/(int) Math.pow(10, contador) != 0);
		return contador;
	}
	
	// Usando strings
	public static int digitos3(int num) { 
		String s = num+"";
		return s.length();
	}

}
