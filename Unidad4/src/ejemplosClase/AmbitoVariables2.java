package ejemplosClase;
/*
 * Carlos Abraham Chavarri Valera
 * 23/10/2025
 * Ambito de variables, una variable es accesible dentro del bloque en el que esta definida
 */
public class AmbitoVariables2 {

	public static void main(String[] args) {
		int i=100;
		for ( i=1;i<10;i++) {
			System.out.println(i);
		}
		System.out.println(i+" despues del bucle ");
	}

}
