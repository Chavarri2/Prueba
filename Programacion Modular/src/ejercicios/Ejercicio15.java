package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 30/10/2026
 * Cajero automático
 * Simula un cajero con un saldo inicial de 500 € y este menú: 1. Consultar saldo, 2. Ingresar dinero,
 * 3. Retirar dinero y 4. Salir. El menú se repite hasta elegir la opción 4.
 * Organiza el programa en estos métodos: mostrarMenu(); leerEnteroEnRango(…) para la opción
 * (reutilízala); leerCantidad(Scanner sc), que solo acepta cantidades positivas; ingresar(double
 * saldo, double cantidad) y retirar(double saldo, double cantidad), que devuelven el
 * nuevo saldo; puedeRetirar(double saldo, double cantidad), ya que no se puede sacar más
 * del saldo disponible ni más de 300 € por operación (usa una constante); y mostrarSaldo(double
 * saldo), con dos decimales.
 * El saldo debe ser una variable local del main: no uses variables de clase para guardarlo. ¿Por qué
 * ingresar tiene que devolver el nuevo saldo en lugar de ser un procedimiento void que lo
 * modifique? porque sino no lo podemos guardar en nuestra variable local
 */
public class Ejercicio15 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int opcion;
		double saldo=500,cantidad;
		//bucle do-while
		do {
			mostrarMenu();
			opcion=leerEnteroEnRango(teclado, "", 1, 4);
			switch (opcion) {
			case 1:
				mostrarSaldo(saldo);
				break;
			case 2:
				cantidad=leerCantidad(teclado);
				saldo=ingresar(saldo, cantidad);
				break;
			case 3:
				cantidad=leerCantidad(teclado);
				saldo=retirar(saldo, cantidad);
				break;
			case 4:
				System.out.println("Ha decidido salir.");
				break;
			default:
				System.err.println("Error: La opcion selecionada no es valida");
				break;
			}
		}while(opcion!=4);
		System.out.println("Fin del programa.");
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	public static void mostrarMenu() {
		System.out.println("Introduzca su opcion: "
				+ "\n1. Consultar saldo \n2. Ingresar dinero"
				+ "\n3. Retirar dinero \n4. Salir.");
	}

	public static void mostrarSaldo(double saldo) {
		System.out.printf("Su saldo es %.2f\n\n",saldo);
	}

	public static boolean puedeRetirar(double saldo, double cantidad) {
		//Inicializamos constantes
		double MAXIMOPORRETIRO=300;
		if(saldo>=cantidad && cantidad<=MAXIMOPORRETIRO) {
			return true;
		}else {
			return false;
		}
	}

	public static double retirar(double saldo, double cantidad){
		if(puedeRetirar(saldo, cantidad)) {
			System.out.println("Operacion realizada con exito\n");
			return saldo-cantidad;
		}else {
			System.err.println("Error: No puedes retirar cantidades negativas, ni mas de 300 por operacion");
			return saldo;
		}

	}

	public static double ingresar(double saldo, double cantidad){
		if(cantidad>=0) {
			System.out.println("Operacion realizada con exito\n");
			saldo=saldo+cantidad;
			return saldo;
		}else {
			return saldo;
		}
	}

	public static double leerCantidad(Scanner sc){
		double cantidad;
		do {
			System.out.println("\nIntroduce la cantidad");
			cantidad=sc.nextDouble();
			if (cantidad<0) {
				System.err.println("Error: solo puedes introducir cantidades positivas");
			}else {
				System.out.println("Procesando operacion\n");
			}
		}while(cantidad<0);
		return cantidad;
	}
	public static int leerEnteroEnRango(Scanner sc, String mensaje, int min, int max) {
		int respuesta;
		do {
			System.out.println(mensaje);
			respuesta=sc.nextInt();
			if(respuesta<min || respuesta>max) {
				System.err.println("Error: Valor fuera de rango. Inténtalo de nuevo.\n");
			}
		}while(respuesta<min || respuesta>max);
		return respuesta;
	}
}
