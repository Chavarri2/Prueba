package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 28/10/2026
 * @since 28/10/2026
 * Conversor de temperaturas
 * Crea dos funciones: celsiusAFahrenheit(double celsius) y fahrenheitACelsius(double
 * fahrenheit), que devuelvan la temperatura convertida. Las fórmulas son F = C · 9 / 5 + 32 y C =
 * (F − 32) · 5 / 9.
 * En el main, muestra una tabla de conversión de −10 ºC a 40 ºC de 10 en 10. Después, comprueba
 * que tus funciones son correctas convirtiendo 25 ºC a Fahrenheit y el resultado otra vez a Celsius:
 * debe volver a dar 25.
 * Ninguna de las dos funciones debe imprimir nada: solo calculan y devuelven.
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		/*Declaramos e inicializamos variables
		double celsius=25,fahrenheit;
		System.out.println("Celsius"+"\tFahrenheit");
		//bucle for
		for (int i = -10; i <= 40; i+=10) {
			System.out.println(i+"ºC\t=\t"+celsiusAFahrenheit(i)+"ºF");
		}
		//Salida y entrada de datos
		//Llamamos al metodo celsiusAFahrenheit
		fahrenheit=celsiusAFahrenheit(celsius);
		System.out.println("Fahrenheit "+fahrenheit);
		//Llamamos al metodo fahrenheitACelsius
		celsius=fahrenheitACelsius(fahrenheit);
		//Comprobamos que sigue valiendo lo mismo que al inicio
		System.out.println("Celsius "+celsius);*/
		
		//Cramos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos e inicializamos variables
		int opcion;
		double c,f; //c significa Celsius y f significa Fahrenheit
		//Salida y entrada de datos 
		System.out.println("Calculadora de Fahrenheit/Celsius."
				+ "\n1. Convertir a Celcius."
				+ "\n2. Convertir a Fahrenheit.");
		opcion=teclado.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Introduce la temperatura");
			f=teclado.nextDouble();
			System.out.println("La temperatura es de "+fahrenheitACelsius(f)+" ºC");
			break;
		case 2:
			System.out.println("Introduce la temperatura");
			c=teclado.nextDouble();
			System.out.println("La temperatura es de "+celsiusAFahrenheit(c)+" ºF");
			break;
		default:
			System.err.println("Opcion no valida");
			break;
		}
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	//Metodo fahrenheitACelsius que le pasamos un dato de tipo double
	//y devuelve un double
	private static double fahrenheitACelsius(double fahrenheit) {
		return (fahrenheit - 32.0) * 5.0 / 9.0;
	}

	//Metodo fahrenheitACelsius que le pasamos un dato de tipo double
	//y devuelve un double
	private static double celsiusAFahrenheit(double celsius) {
		return celsius * 9.0 / 5.0 + 32.0;
	}

}
