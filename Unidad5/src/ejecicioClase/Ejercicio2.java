package ejecicioClase;

public class Ejercicio2 {

	public static void main(String[] args) {
		int n;
		String s, m;
		m="";
		s= Leer.leerString("Introduce un verbo en infinitivo ");
		s=s.toLowerCase();
		if (s.endsWith("ar")) {	
			n=s.indexOf("ar");
		}else if (s.endsWith("er")) {
			n=s.indexOf("er");
		}else if (s.endsWith("ir")) {
			n=s.indexOf("ir");
		}else {
			n=0;
		}
		for(int i = n; i<s.length();i++) {
			m= (String) m+s.charAt(i);
		}
		if (m.equals("ar") | m.equals("er") | m.equals("ir")) {
			System.out.println("El verbo "+s+" es un verbo en infinitivo");
		}else {
			System.out.println("El verbo "+s+" no es un verbo en infinitivo");
		}
	}

}