package ejercicios;
/**
 * @author Carlos
 * @version 1.0
 * @since 29/10/2026
 * Potencias sin la clase Math
 * Crea la función long potencia(int base, int exponente) que calcule la potencia mediante un
 * bucle, para exponentes mayores o iguales que 0. Recuerda que cualquier número elevado a 0
 * vale 1.
 * En el main, muestra las potencias de 2 desde 2⁰ hasta 2²⁰ y comprueba que 3⁴ = 81, 5⁰ = 1 y (−2)³
 * = −8.
 * ¿Por qué crees que la función devuelve un long y no un int?: Porque devuelve numeros muy grandes
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		//Inicializamos variables
		int num1=2;
		for (int i = 0; i <= 20 ; i++) {
			System.out.println(potencia(num1, i));
		}
		System.out.println(potencia(3, 4));
		System.out.println(potencia(5, 0));
		System.out.println(potencia(-2, 3));
		
	}
	
	
	public static long potencia(int base,int exponente) {
		long resultado=base;
		if(exponente>=1) {
			for (int i = 1; i < exponente; i++) {
				resultado=resultado*base;
			}
			return resultado;
		}else {
			return 1;
		}
	}
}
