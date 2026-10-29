package ejercicios;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 29/10/2026
 * Áreas y perímetros con sobrecarga
 * Crea estos métodos sobrecargados: area(double lado) para el cuadrado y area(double base,
 * double altura) para el rectángulo; perimetro(double lado) para el cuadrado,
 * perimetro(double base, double altura) para el rectángulo y perimetro(double a, double
 * b, double c) para un triángulo del que conocemos sus tres lados.
 * Ahora quieres añadir el área de un triángulo (base · altura / 2) con el nombre area. ¿Qué ocurre?
 * Explica por qué y resuélvelo. Lo que ocurre es que el tipo las variables locales, el numero de variables y el nombre del  metodoson iguales 
 * por lo que el metodo no tiene forma de saber cual de los dos se esta llamando La solucion 1 es cambiar el tipo, 
 * la opcion 2 es cambiar el nombre del metodo y la opcion 3 agragar una variable mas
 * Desde el main, calcula el área y el perímetro de un cuadrado de lado 4, un rectángulo de 3 × 5 y
 * un triángulo de lados 3, 4 y 5 (base 4 y altura 3).
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		area(4);
		area(3, 5);
		areaT(4, 3);
		perimetro(4);
		perimetro(3, 5);
		perimetro(3, 4, 5);
	}
	public static double perimetro(double lado) {
		return 4*lado;
	}
	public static double perimetro(double base, double altura) {
		return base*2+altura*2;
	}
	public static double perimetro(double a, double b, double c) {
		return a+b+c;
	}
	
	
	public static double area(double lado) {
		return lado*lado;
	}
	
	public static double area(double base, double altura) {
		return base*altura;
	}
	public static double areaT(double b, double a) {
		return b*a/2;
	}
	/*
	public static double area(double base, double altura) {
		return base*altura/2;
	}
	*/
}
