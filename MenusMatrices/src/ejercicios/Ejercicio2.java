package ejercicios;

import java.util.Scanner;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 25/11/2026
 * Gestión de Butacas de Cine. Desarrolla una aplicación para gestionar una sala de cine
 * representada por una matriz de caracteres (char[][]) de 8 filas y 10 columnas. Inicialmente,
 * todas las butacas estarán libres ('L'). Implementa un menú interactivo con:
 * 1. Mostrar el mapa de la sala indicando números de fila y columna.
 * 2. Reservar una butaca pidiendo fila y columna (si ya está ocupada 'O', mostrar aviso de error).
 * 3. Cancelar una reserva (cambiar de 'O' a 'L').
 * 4. Reservar automáticamente N butacas contiguas en una misma fila (indicando si no hay hueco 
 * suficiente).
 * 5. Mostrar estadísticas: total de recaudación (a 8,50 € la entrada) y porcentaje de ocupación.
 * 6. Salir.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		char[][] sala=new char[8][10];
		//Llamamos al metodo mostrar menu
		rellenarMatriz(sala);
		mostrarMenu(teclado, sala);
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

	//Metodo para mostrar menu
	public static void mostrarMenu(Scanner teclado, char[][] sala) {
		int opcion;
		do {
			menu();
			opcion=teclado.nextInt();
			switch (opcion) {
			case 0:
				System.out.println("Ha decidido salir");
				break;
			case 1:
				mostrarMatriz(sala);
				break;
			case 2:
				if(colocarPosicion(pedirPosicion(teclado, sala), sala, 'O')) {
					System.out.println("Posicion colocada correctamente");
				}else {
					System.out.println("Error: no se ha podido colocar la posicion");
				}
				break;
			case 3:
				if(cancelarPosicion(pedirPosicion(teclado, sala), sala, 'L')) {
					System.out.println("Posicion cancelada correctamente");
				}else {
					System.out.println("Error: no se ha podido cancelar la posicion");
				}
				break;
			case 4:
				int butacas;
				System.out.println("Introduce el numero de butacas");
				butacas=teclado.nextInt();
				reservarAsientosContiguos(sala, butacas);
				break;
			case 5:
				System.out.println("La recaudacion es de "+mostrarRecaudaciones(sala)+" € y el porcentaje de asientos ocupados es: "+porcentajeAsientosOcupados(sala)+"%");
				break;
			default:
				System.out.println("Error: opcion no valida");;
			}
		}while(opcion!=0);
	}
	//Metodo para calcular el porcentaje de hacientos ocupados
	public static double porcentajeAsientosOcupados(char[][] sala) {
		int total= sala.length*sala[0].length;
		System.out.println(total);
		System.out.println(asientosOcupados(sala));
		return ((double)asientosOcupados(sala)/(double)total)*100;
	}
	//Comprobar asientos ocupados
	public static int asientosOcupados(char[][] sala) {
		int contador=0;
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[i].length; j++) {
				if(sala[i][j]=='O') {
					contador++;
				}
			}
		}
		return contador;
	}
	//Metodo para reservar asientos contiguos
	public static void reservarAsientosContiguos(char[][] sala, int butacas) {
		int[] posicion=comprobarAsientosContiguos(sala, butacas);
		boolean cierto=posicion[0] != -1 && posicion[1] != -1;;
		for (int i = 0; i < butacas && cierto; i++) {
			sala[posicion[0]][posicion[1]+i]='O';
		}
		if(cierto) {
			System.out.println("Reservada correctamente");
		}else {
			System.out.println("Error: no hay suficientes asientos contiguos");
		}
	}
	
	//Metodo para comprobar las butacas contiguas disponibles
	private static int[] comprobarAsientosContiguos(char[][] sala, int butacas) {
		int disponibles=0;
		int[] posicion=new int[2];
		for (int i = 0; i < sala.length; i++) {
			disponibles=0;
			for (int j = 0; j < sala[i].length; j++) {
				if(sala[i][j]=='L') {
					disponibles++;
				}else {
					disponibles=0;
				}
				if(disponibles==butacas) {
					posicion[0]=i;
					posicion[1]=j-butacas+1;
					return posicion;
				}
				
			}
		}
		return new int[] { -1, -1 };
	}
	/*//Metodo para reservar asientos contiguos
	private static void reservarAsientosContiguos(char[][] sala, int[] posicion, int butacas) {
		boolean cierto=comprobarAsientosContiguos(sala, posicion, butacas);
		for (int i = 0; i < butacas && cierto; i++) {
			sala[posicion[0]][posicion[1]+i]='O';
		}
		if(cierto) {
			System.out.println("Reservada correctamente");
		}else {
			System.out.println("Error: hay asientos ocupados");
		}

	}
	//Metodo para comprobar los asientos contiguos
	public static boolean comprobarAsientosContiguos(char[][] sala, int[] posicion, int butacas) {
		if(posicion[1]+butacas>sala[0].length) {
			return false;
		}
		for (int i = 0; i < butacas; i++) {
			if(sala[posicion[0]][posicion[1]+i]=='O') {
				return false;
			}
		}
		return true;
	}*/

	//Metodo para saber cuanto se ha recaudado
	public static double mostrarRecaudaciones(char[][] sala) {
		int asientosOcupados=0;
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[0].length; j++) {
				if(sala[i][j]=='O') {
					asientosOcupados++;
				}
			}
		}
		return 8.50*asientosOcupados;
	}

	//Metodo para colocar la posicion
	public static boolean cancelarPosicion(int[] posicion,char[][] matriz, char ocupado) {
		if(matriz[posicion[0]][posicion[1]]=='O') {
			matriz[posicion[0]][posicion[1]]=ocupado;
			return true;
		}else {
			return false;
		}
	}

	//Metodo para colocar la posicion
	public static boolean colocarPosicion(int[] posicion,char[][] matriz, char ocupado) {
		if(matriz[posicion[0]][posicion[1]]=='L') {
			matriz[posicion[0]][posicion[1]]=ocupado;
			return true;
		}else {
			return false;
		}
	}

	//Metodo para seleccionar posicion
	public static int[] pedirPosicion(Scanner teclado, char[][] matriz) {
		int[] posicion=new int[2];
		do {
			System.out.println("Introduce la fila (0-"+(matriz.length-1)+")");
			posicion[0]=teclado.nextInt();
			System.out.println("Introduce la columna (0-"+(matriz[0].length-1)+")");
			posicion[1]=teclado.nextInt();
			if(posicion[0] < 0 || posicion[0] >= matriz.length ||
					posicion[1] < 0 || posicion[1] >= matriz[0].length) {
				System.err.println("Error: posicion incorrecta");
			}
		}while(posicion[0] < 0 || posicion[0] >= matriz.length ||
				posicion[1] < 0 || posicion[1] >= matriz[0].length);
		return posicion;
	}

	//Metodo para mostrar el menu
	public static void menu() {
		System.out.println("Introduce una opcion.\n"
				+ "0. Salir\n"
				+ "1. Mostrar el mapa de la sala\n"
				+ "2. Reservar butaca\n"
				+ "3. Cancelar reserva\n"
				+ "4. Reservar un numero de butacas contiguas\n"
				+"5. Mostrar estadisticas\n");
	}

	//Metodo que coloca la jugada en la posicion seleccionada
	public static void mostrarMatriz(char[][] matriz) {
		System.out.print("   ");
		for(int i = 0; i < matriz[0].length; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i = 0; i < matriz.length; i++) {
			System.out.print(i + "  ");
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	//Metodo para rellenar el tablero con guiones 
	public static void rellenarMatriz(char[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]='L';
			}
		}
	}
}