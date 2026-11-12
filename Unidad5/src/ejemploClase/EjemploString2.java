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
		//Pero un solo caracter a, b, c no ab, cde, ...
		expReg=".mor";
		s="clamor";
		System.out.println(s.matches(expReg));
		//Ejemplo 2 [aeiou] seria valido cualquiera de las valores ente corchetes
		//es decir que una sola letra es valida y siempre y cuando este dentro de los corchetes
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
		// el mas significa una o mas veces, el punto cualquier caracter, y el asterisco una o mas veces
		expReg="[aeiouAEIOU]+.*";
		s="A";
		System.out.println(s.matches(expReg));
		//Expresion que valida un numero de telefono
		expReg="[1-9][0-9]{8}";
		s="987654321";
		System.out.println(s.matches(expReg));
		expReg="[0-9]{7}[A-z]";
		s="12345678A";
		System.out.println(s.matches(expReg));
		//Contraseña con mas de 8 caracteres el punto quiere decir cualquier caracter, y el corchete significa que es un cuantificador
		//el 8 son las veces que se repite lo que haya  antes, y la coma significa dichas veces o mas
		expReg=".{8,}";
		s="ILoveyouSoMuch";
		System.out.println(s.matches(expReg));
	}
}
