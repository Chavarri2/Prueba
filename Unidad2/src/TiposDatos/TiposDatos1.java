package TiposDatos;
/*
 * Programa para aprender a utilizar tipos de datos en java 
 * 22/09/2025
 * Autor: Gonzalo
 * 
 */

public class TiposDatos1 {

	public static void main(String[] args) {
		//Definir variables
		int numero1 = 10; //Definimos una variable de tipo int y la inicializamos al valor 10
		int numero2 = 3; 
		int suma, resta, multiplicacion;
		double division;
		//Calculamos la suma,resta,division y multiplicacion
		suma =numero1+numero2;
		resta =numero1-numero2;
		multiplicacion=numero1*numero2;
		division=(double)numero1/numero2;
		//Salida de datos por pantalla
		System.out.println (  "la suma vale"+ resta + "HOLA");
		System.out.println("la resta vale" + resta);
		System.out.println("la multiplicacion vale" + multiplicacion);
		System.out.println("la division vale" + division);
	}

}
