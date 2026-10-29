package ejemplosClase;
/*
 * Carlos Abraham Chavarri Valera
 * 23/10/2025
 * Ambito de variables, una variable es accesible dentro del bloque en el que esta definida
 */
public class AmbitoVariables3 {

	public static void main(String[] args) {
		int i=28;
		prueba(i);
		System.out.println(i);
	}
	public static void prueba(int i) {
		//El paso de argumetos en java es por valor, se pasa una copia del valor de la variable
		i++;
		System.out.println(i+" dentro del metodo");
	}

}
