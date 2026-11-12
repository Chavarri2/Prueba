package ejerciciosString2;

import java.util.Scanner;

/**
 * @author Carlos
 * @version
 * @since 12/11/2026
 * Escribir un programa que lea códigos de personas de 8 caracteres de modo que los 
 * cuatro primeros sean numéricos y contenidos entre 1990-1995 (un año), el quinto 
 * carácter sea solo (H ó M) sexo, el sexto un numero que representa el curso 
 * 1 ó 2 y los caracteres séptimo y octavo pueden tener cualquier valor. Deben 
 * rechazarse los códigos que no cumplan estas condiciones, la finalización de entrada 
 * de códigos se produce cuando se introduce el código “00000000”. Al final el programa
 * debe sacar un informe indicando cuántos hombres y mujeres hay matriculados en primero 
 * y segundo y cuántos códigos correctos han sido leídos.
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		String expreg="[0-9]{4}[HhMm][1-2].{2}", persona;
		int segundoCursoMujeres=0, primerCursoHombres=0, primerCursoMujeres=0,segundoCursoHombres=0, numeroCodigosCorrectos=0;
		do{
			System.out.println("Introduce un codigo de persona");
			persona=teclado.nextLine();
			if(persona.matches(expreg)) {
				primerCursoHombres=primerCursoHombres+hombresPrimerCurso(persona);
				primerCursoMujeres=primerCursoMujeres+mujeresPrimerCurso(persona);
				segundoCursoHombres=segundoCursoHombres+hombreSegundoCurso(persona);
				segundoCursoMujeres=segundoCursoMujeres+mujeresSegundoCurso(persona);
				numeroCodigosCorrectos++;
			}else {
				System.out.println("\nCodigo no valido\n");
			}
		}while(persona.matches(expreg) || !(persona.equals("00000000")));

		System.out.println("Hay "+primerCursoHombres+" hombres cursando primero"
				+ "\nHay "+primerCursoMujeres+" mujeres cursando primero"
				+ "\nHay "+segundoCursoHombres+" hombre cursando segundo curso"
				+ "\nHay "+segundoCursoMujeres+" mujeres cursando segundo curso"
				+ "\nTotal de codigos correctos ingrasados: "+numeroCodigosCorrectos);

		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	public static int hombresPrimerCurso(String persona) {
		persona=persona.toUpperCase();
		if(persona.charAt(4)=='H' && persona.charAt(5)=='1') {
			return 1;
		}else {
			return 0;
		}
	}
	public static int mujeresPrimerCurso(String persona) {
		persona=persona.toUpperCase();
		if(persona.charAt(4)=='M' && persona.charAt(5)=='1') {
			return 1;
		}else {
			return 0;
		}
	}
	public static int hombreSegundoCurso(String persona) {
		persona=persona.toUpperCase();
		if(persona.charAt(4)=='H' && persona.charAt(5)=='2') {
			return 1;
		}else {
			return 0;
		}
	}

	public static int mujeresSegundoCurso(String persona) {
		persona=persona.toUpperCase();
		if(persona.charAt(4)=='H' && persona.charAt(5)=='2') {
			return 1;
		}else {
			return 0;
		}
	}

}
