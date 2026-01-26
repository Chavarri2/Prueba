package ejecicioClase;
/*
 * Carlos Abraham Chavarri Valera
 * 30/10/2025
 *  Hacer un captcha en el que la persona tenga que demostrar que no es un robot
 *	escribiendo una cadena compleja. Por ejemplo: “A5-jk7Y”.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		do {
			
		}while(!validar());
		System.out.println("Validado");
	}
	//Metodo que me devuelva una letra mayuscula
	public static char generaMayus() {
		String s = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		return s.charAt((int) (Math.random() * s.length()));
	}
	//Metodo que me devuelva una letra minuscula
	public static char generaMinus() {
		String s = "abcdefghijklmnñopqrstubwxyz";
		return s.charAt((int) (Math.random() * s.length()));
	}
	//Metodo que me devuelva un numero
	public static char generaNum() {
		String s = "1234567890";
		return s.charAt((int) (Math.random() * s.length()));
	}
	//Metodo que me devuelva un simbolo
	public static char generaSim() {
		String s = "|@#~€¬'¡ª!·$%&/()=?¿`+´ç,.-;:_¨Ç*}{][";
		return s.charAt((int) (Math.random() * s.length()));
	}
	// Metodo que genera un Captcha
	public static String captcha () {
		return ""+generaMayus()+generaMinus()+generaNum()+generaSim()+generaMayus()+generaMinus();
	}
	//metodo para validar captcha
	public static boolean validar() {
		String c = captcha();
		System.out.println(c);
		return c.equals(Leer.leerString("Introduce el captcha"));
	}
}
