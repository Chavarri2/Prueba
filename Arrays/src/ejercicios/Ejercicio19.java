package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 23/11/2026
 * Crea un array irregular en el que cada fila represente un grupo de alumnos.
 * El usuario indicará cuántos alumnos tiene cada grupo y sus notas. Muestra la
 * media de cada grupo y el grupo con mejor media.
 */
public class Ejercicio19 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int numeroGrupos;
		//Salida y entrada de datos
		System.out.println("Introduce cuantos grupos hay");
		numeroGrupos=teclado.nextInt();
		//Declaramos variables
		double[][] grupos=new double[numeroGrupos][];
		pedirAlumnosPorGrupo(grupos, teclado);
		pedirNotaDeAlumnos(grupos, teclado);
		mostrarMediaDeGrupos(grupos);
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}
	
	private static void mostrarMediaDeGrupos(double[][] grupos) {
		double mayorMedia=0;
		int grupo=0;
		for (int i = 0; i < grupos.length; i++) {
			double media=0;
			for (int j = 0; j < grupos[i].length; j++) {
				media=media+grupos[i][j];
			}
			media=media/grupos[i].length;
			System.out.println("La media del grupo "+i+" es: "+media);
			if(mayorMedia<media) {
				mayorMedia=media;
				grupo=i;
			}
		}
		System.out.println("El grupo con mejor media es "+grupo+" y su media es "+mayorMedia);
	}

	private static void pedirNotaDeAlumnos(double[][] grupos, Scanner teclado) {
		for (int i = 0; i < grupos.length; i++) {
			for (int j = 0; j < grupos[i].length; j++) {
				double notaAlumno;
				System.out.println("Introduce la nota del alumno "+j+" del grupo "+i);
				notaAlumno=teclado.nextDouble();
				if(notaAlumno<0 || notaAlumno>10) {
					System.out.println("Nota invalida");
					j--;
				}else {
					grupos[i][j]=notaAlumno;
				}
			}
		}
		
	}

	private static void pedirAlumnosPorGrupo(double[][] grupos, Scanner teclado) {
		int contador=0;
		do {
			int numeroAlumnos;
			System.out.println("Introduce el numero de alumnos que hay en el grupo "+contador);
			numeroAlumnos=teclado.nextInt();
			if(numeroAlumnos>0) {
				grupos[contador]=new double[numeroAlumnos];
				contador++;
			}else {
				System.out.println("El numero de alumnos no puede ser menor que 1");
			}
		}while(contador<grupos.length);
	}

}
