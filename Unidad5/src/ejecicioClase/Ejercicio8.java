package ejecicioClase;

public class Ejercicio8 {

	public static void main(String[] args) {
		String s;
		s=Leer.leerString("Escribe una palabra");
		int vocales=contarVocales(s);
		System.out.println("La palabra '"+s+"' tiene "+vocales+" vocales!");

	}
	public static int contarVocales(String s) {
		String pal = s.toLowerCase();
		int contadorVocales=0;
		for (int i =0;i<pal.length();i++) {
			char letra = pal.charAt(i);
			if (letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u') {
			contadorVocales++;
			}
		}
		return contadorVocales;
		
	}

}
