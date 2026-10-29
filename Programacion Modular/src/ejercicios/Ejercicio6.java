package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 28/10/2026
 * Nota final de la asignatura
 * La nota final de una asignatura se calcula con un 60 % de teoría y un 40 % de práctica, pero solo
 * se hace la media si las dos partes tienen al menos un 4. Crea estas funciones:
 * calcularNotaFinal(double teoria, double practica) devuelve la media ponderada.
 * puedeHacerMedia(double teoria, double practica) devuelve si las dos notas llegan al 4.
 * estaAprobado(double teoria, double practica) devuelve si se puede hacer media y la nota
 * final es al menos un 5; debe usar las dos funciones anteriores.
 * El main pedirá las dos notas y mostrará uno de estos mensajes, con la nota en dos decimales
 * usando printf: «Aprobado con un 6,10», «Suspenso con un 4,80» o «Suspenso: necesitas al
 * menos un 4 en cada parte».
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		double teoria,practica;
		//Entrada y salida de datos
		System.out.println("Introduce la nota de teoria");
		teoria=teclado.nextDouble();
		System.out.println("Introduce la nota de la practica");
		practica=teclado.nextDouble();
		System.out.printf(" %2d",calcularNotaFinal(teoria, practica));
		
		//System.out.println(puedeHacerMedia(teoria, practica));
		//System.out.println(estaAprobado(teoria, practica));
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	public static boolean puedeHacerMedia(double teoria, double practica){
		if(teoria >4 && practica>4) {
			return true;
		}else {
			return false;
		}
	}

	public static double calcularNotaFinal(double teoria, double practica){
		double resultadoF, resultadoT, resultadoP;
		resultadoT=teoria*6/10;
		resultadoP=practica*4/10;
		resultadoF=resultadoP+resultadoT;
		return resultadoF;
	}
	public static String estaAprobado(double teoria, double practica){
		double resultadoF, resultadoT, resultadoP;
		resultadoT=teoria*6/10;
		resultadoP=practica*4/10;
		resultadoF=resultadoP+resultadoT;
		if(resultadoF >=5.0 && (resultadoP>=2.4 && resultadoT>=1.6)) {
			return "Felicidades estas aprobado"+"\nTu nota es: "+resultadoF;
		}else {
			return "Estas suspenso"+"\nTu nota es: "+resultadoF+" porque suspendiste un apartado";
		}
	}
}
