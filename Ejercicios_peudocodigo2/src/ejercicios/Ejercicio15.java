package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 8/10/2026
 * Realizar un programa que elija mediante un menú un tipo de figura:
 *  Triángulo
 *  Cuadrado
 *  Rectángulo
 * Una vez elegida la opción, nos tiene que pedir en cada caso los datos necesarios para
 * calcular su área y mostrarla.
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int opcion;
		double base,altura,resultado;
		//Inicializamos variables
		boolean salida=true;
		//Usamos bucle do-while que repetira mientras salida sea true
		do{
			//Salida y entra de datos
			System.out.println("Introduce una opcion: "

				+ "\n1. Triangulo"
				+ "\n2. Cuadrado"
				+ "\n3. Rectangulo\n");
			opcion=teclado.nextInt();
			
			//Usamos condicional Switch 
			switch (opcion) {
			//Si opcion es igual a cero entonces se saldra del bucle
			case 0:
				salida=false;
				break;
			//En el caso uno se realizara la busqueda del area de un triangulo
			case 1:
				//Salida y entrada de datos
				System.out.println("Introduce la base");
				base=teclado.nextDouble();
				System.out.println("Introduce la altura");
				altura=teclado.nextDouble();
				//Operacion
				resultado=(base*altura)/2;
				//Salida de datos
				System.out.println("El area del triangulo es: "+resultado+" centimetro");
				break;
			//En el caso dos se realizara la busqueda del area de un cuadrado
			case 2:
				//Salida y entrada de datos
				System.out.println("Introduce un lado del cuadrado");
				base=teclado.nextDouble();
				//Operacion
				resultado=base*base;
				//Salida de datos
				System.out.println("El area del cuadrado es: "+ resultado+" centimetro");
				break;
			//En el caso tres de realizara la busqueda del area de un rectangulo
			case 3:
				//Salida y entrada de datos
				System.out.println("Introduce la base");
				base=teclado.nextDouble();
				System.out.println("Introduce la altura");
				altura=teclado.nextDouble();
				//Operacion
				resultado=base*altura;
				//Salida de datos
				System.out.println("El area del rectangulo es: "+resultado+" centimetro cuadrados");
				break;
			//El default va ha ser el mensaje que salga en caso de que no se ingrese un valor correspondiente
			//A los casos disponibles
			default:
				//Salida de mensaje de error
				System.err.println("Error: opcion no valida");
				break;
			}
			//Reasignamos valores a ceros a todas las variables para evitar problemas
			resultado=0;
			opcion=0;
			base=0;
			altura=0;
		}while(salida);
		//Mensaje que indica que el programa a finalizado
		System.out.println("Fin del programa");
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
