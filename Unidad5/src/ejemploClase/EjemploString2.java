package ejemploClase;
/*
 *05/11/2025
 *Carlos Abraham Chavarri Valera
 *Las expresiones regulares en java permiten crear patrones para validar, buscar o manipular texto
 */
public class EjemploString2 {

	public static void main(String[] args) {
		// Vamos a utiliar el metodo matches
		// Cadena.matches ("expresion regular")-> devuelve boolean si cadena cumple con la expresion
		String s="";
		String expReg="";
		//Ejemplo 1 Un "." en la expresion regular equivale a cualquier caracter
		expReg=".mor";
		s="clamor";
		System.out.println(s.matches(expReg));
		//Ejemplo 2 [aeiou] seria valido cualquiera de las valores ente corchetes
		expReg="[aeiou]mor";
		s="emor";
		System.out.println(s.matches(expReg));
		//Ejemplo 3 [^aeiou] cualquier caracter menos los de []
		expReg="[^aeiou]mor";
		s="9mor";
		System.out.println(s.matches(expReg));
		// Ejemplo 4 [a-zA-z] se pueden agrupar los caracteres o grupos de estos
		expReg="[0-9]mor";
		s="9mor";
		System.out.println(s.matches(expReg));
		//Ejemplo 5 Palabra que empiece por vocal
		expReg="[aeiouAEIOU]+.*";
		s="A";
		System.out.println(s.matches(expReg));
		//Expresion que valida un numero de telefono
		expReg="[1-9][0-9]{8}";
		s="987654321";
		System.out.println(s.matches(expReg));
		expReg="[0-9]{7}[A-z]";
		s="12345678A";
		//Contraseña con mas de 8 caracteres
		expReg=".{8,}";
		s="ILoveyouso";
		System.out.println(s.matches(expReg));
	}

}
