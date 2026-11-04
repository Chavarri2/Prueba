package ejercicios_Operadores;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 5/10/2026
 *     3. Declara un entero n = 7.
 *  • Muestra el valor de ++n y de n++.
 *  
 *  • Explica la diferencia entre preincremento y postincremento.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		//Declaramos e inicializamos variables
		int n=7;
		int m,b;
		m=n++;
		b=++n;
		//Salida por pantalla
		//La diferencia es que al hacer el preincrementp n++, se muestra primero el numero y luego le suma 1
		//mientras que si haces el postincremento ++n, primero le suma 1 y luego se muestra el numero
		System.out.println(m);
		System.out.println(b);
	}

}
