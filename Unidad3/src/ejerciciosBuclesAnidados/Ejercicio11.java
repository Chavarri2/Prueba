package ejerciciosBuclesAnidados;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 21/10/2026
 * Ejercicio 11. Notas de un grupo
 * Escribe un programa que pida cuántos alumnos tiene un grupo. Para cada alumno, pide la
 * nota (número entero) de sus 3 módulos. Cada nota debe estar entre 0 y 10; si no lo está, se
 * vuelve a pedir.
 * Para cada alumno, muestra su media con decimales y si aprueba (media mayor o igual que
 * 5). Al final, muestra la media del grupo y qué alumno ha obtenido la mejor media.
 * ¿Cuántos alumnos? 2
 * Alumno 1
 * Nota del módulo 1: 7
 * Nota del módulo 2: 12
 * Nota del módulo 2: 6
 * Nota del módulo 3: 4
 * Media: 5.666666666666667 -> Aprueba
 * Alumno 2
 * Nota del módulo 1: 3
 * Nota del módulo 2: 5
 * Nota del módulo 3: 4
 * Media: 4.0 -> Suspende
 * Media del grupo: 4.833333333333334
 * Mejor media: alumno 1
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos e Inicializamos variables
		int alumno,mejor=0;
		double grupo=0, media=0, modulo1=0,modulo2=0,modulo3=0,mayor=0;
		//Entrada y Salida de datos
		do {
			System.out.println("Introduce el numero de alumnos del grupo");
			alumno=teclado.nextInt();
		}while(alumno<1);
		
		//Bucle for que se repetira tantos alumnos haya
		for (int i = 1; i <= alumno; i++) {
			//Bucle while que se repetira mientras los datos introducidos por el usuario
			//sean menor que cero y mayor que 10
			do {
				//Entrada y salida de datos
				System.out.println("\nAlumno "+i);
				System.out.println("Introduce la nota del modulo 1");
				modulo1=teclado.nextInt();
				System.out.println("Introduce la nota del modulo 2");
				modulo2=teclado.nextInt();
				System.out.println("Introduce la nota del modulo 3");
				modulo3=teclado.nextInt();
			}while((modulo1<0 || modulo1>10) || (modulo2<0 || modulo2>10) || (modulo3<0 || modulo3>10));
			//Operacion para medir la nota media del alumno
			media=(modulo1+modulo2+modulo3)/3;
			//Suma la media de cada alumno introducido a grupo
			grupo=grupo+media;
			//Condicional if para evaluar si la nota es mayor o igual que 5
			if(media>=5) {
				//Mensaje de aprobado
				System.out.println("\nMedia: "+media+" Aprobado");
			}else {
				//Mensaje de reprobado
				System.out.println("\nMedia: "+media+" Reprobado");
			}
			//Usamos condicional if que vera si mayor es menor que media entonces
			//Actualizara mayor para que sea esa media y actualizara mejor y le pondra i
			//Que indica el alumno con mejor nota
			if(mayor<media) {
				mayor=media;
				mejor=i;
			}
		}
		//Operacion media del grupo
		grupo=grupo/(double)alumno;
		//Salida y entrada de datos
		System.out.println("\nLa media del grupo es: "+ grupo);
		System.out.println("La media mas alta es del alumno "+mejor);
		System.out.println("Su media es: "+mayor);
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
