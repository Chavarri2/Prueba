package ejercicios;

public class Ejercicio8 {

	public static void main(String[] args) {
		System.out.println(digitos(1000));
		System.out.println(digitos2(10000));
		System.out.println(digitos3(32));
	}
	public static int digitos (int n) {
		int contador=0;
		do {
			n=n/10;
			contador++;
		}while (n !=0);
		return contador;
	}
	public static int digitos2 (int n) {
		int contador=0;
		do {
			contador++;
		}while (n/(int) Math.pow(10, contador) !=0);
		return contador;
	}
	//usando String
	public static int digitos3 (int n) {
		String s= n+"";
		return s.length();
	}
}
