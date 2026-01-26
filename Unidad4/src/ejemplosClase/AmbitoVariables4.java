package ejemplosClase;
/*
 * Carlos Abraham Chavarri Valera
 * 23/10/2025
 * Ambito de variables, una variable es accesible dentro del bloque en el que esta definida
 */
public class AmbitoVariables4 {
	public static int i=28;
	public static void main(String[] args) {
		/*prueba();
		prueba2();
		System.out.println(i);
		prueba3();
		System.out.println(i);*/
		prueba4(i);
		System.out.println(i);
	}
	public static void prueba () {
		i++;
	}
	public static void prueba2 () {
		System.out.println(i);
	}
	public static void prueba3() {
		int i=5;
		System.out.println(i+" Dentro de prueba3");
	}
	public static void prueba4 (int x) {
		i++;
		System.out.println(i+" Dentro de prueba4");
	}
}
