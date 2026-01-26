package ejemploClase;
/*
 * Fecha: 30/10/2025
 * Carlos Abraham Chavarri Valera
 * Ejemplos uso Strings (Metodos, cadenas, ...)
 */
public class EjemploString {

	public static void main(String[] args) {
		String s1 = "casa";
		String s2 = new String("casa");
		System.out.println(s1==s2); // False
		System.out.println(s1.equals(s2)); // True
		
		// Metodos de acceso
		// Atencion: Se empieza a contar desde el 0. Si nos pasamos del indice se producira un error
		// Ejemplo: Tiene una longitud de 4 (sin incluir) y accedemos al caracter 4 
		// se produce una excepcion (StringIndexOutOfBoundsExepcion)
		System.out.println("Caracter 0 de " + s1 + ": "+ s1.charAt(0));
		System.out.println("Caracter 1 de " + s1 + ": "+ s1.charAt(1));
		System.out.println("Caracter 2 de " + s1 + ": "+ s1.charAt(2));
		System.out.println("Caracter 3 de " + s1 + ": "+ s1.charAt(3));
		System.out.println("");
		// Ejemplo: (quitar comentario para probar):
		// System.out.println("Caracter 4 de " + s1 + ": "+ s1.charAt(4));
		
		// Conocer longitud de una cadena (String)
		System.out.println("Longitud de "+s1+": "+s1.length());
		//recorrer una cadena (loop for)
		// Atencion: Menor estricto. Si incluimos la longitud entera nos dara error (IndexOutOfBounds)
		for(int c = 0; c<s1.length();c++) {
			System.out.println(s1.charAt(c));
			
		}
		System.out.println("");
		// Metodo subString
		System.out.println(s1.substring(0));
		System.out.println("");
		s1="carton mojado";
		System.out.println(s1.substring(0, 12));
		
		// Metodo indexOf
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf("moja"));
		System.out.println(s1.indexOf('u'));
		System.out.println("");
		// Metodo startsWith();
		// Devuelve True si la cadena empieza con un dereminado texto
		System.out.println(s1.startsWith("c"));
		System.out.println("");
		// Metodo replaceFirst y replaceAll
		// No modifican el objeto original, te devuelvan otra nueva
		System.out.println(s1.replaceFirst("a","u"));
		System.out.println("");
		System.out.println(s1.replaceAll("a","u"));
		System.out.println("");
		// Metodo toUpperCase y toLowerCase
		// Transforma de mayusculas a minusculas y viciversa
		s1= "ManUel";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
	}

}
