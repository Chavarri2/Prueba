package ejemplosClase;
/*
 * Carlos Abraham Chavarri Valera
 * 23/10/2025
 * Ambito de variables, una variable es accesible dentro del bloque en el que esta definida
 */
public class AmbitoVariables {

	public static void main(String[] args) {
		for (int i =1;i<10;i++) {
			System.out.println(i);
		}
		//La variable i no esta definida fuera del for y nos da error
		//System.out.println(i);
	}

}
