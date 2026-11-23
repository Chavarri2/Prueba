package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Carlos
 * @version 1.0
 * @since 23/11/2026
 * Programa el juego del tres en raya para dos jugadores usando un tablero de
 * 3x3 de tipo char. Tras cada movimiento se mostrará el tablero y se comprobará
 * si hay casilla ocupada, victoria por fila, columna o diagonal, o empate.
 */
public class Ejercicio20 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		char[][] tablero=new char[3][3];
		//Salida y entrada de datos
		rellenarMatriz(tablero);
		gestionJuego(teclado, tablero);
		System.out.println("Fin de la partida");
		if(ganador(tablero)==' ') {
			System.out.println("Hubo un empate bien jugado");
		}else {
			System.out.println("El ganador es "+ganador(tablero));
		}
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

	//Metodo para comprobar el ganador
	public static char ganador(char[][] matriz) {
		char diagonalPrincipal = diagonalPrincipalHecha(matriz);
		char diagonalSecundaria = diagonalSecundariaHecha(matriz);
		char fila = filaHecha(matriz);
		char columna = columnaHecha(matriz);
		if(diagonalPrincipal == 'X' ||
				diagonalSecundaria == 'X' ||
				fila == 'X' ||
				columna == 'X') {
			return 'X';
		}

		if(diagonalPrincipal == 'O' ||
				diagonalSecundaria == 'O' ||
				fila == 'O' ||
				columna == 'O') {
			return 'O';
		}
		
		return ' ';
	}
	//Metodo para comprobar la diagonal secundaria
	public static char diagonalSecundariaHecha(char[][] matriz) {
		//Comprobacion de que realmente existe una diagonal completa
		if(matriz.length!=matriz[0].length) {
			return ' ';
		}

		//Declaramos variables
		char simbolo= matriz[0][matriz.length-1];

		//Si el simbolo es distinto de X o O entonces no devuleve nada
		if(simbolo=='_') {
			return ' ';
		}
		//Comprobamos de que toda la diagonal tenga el mismo simbolo
		for (int i = 0; i < matriz.length; i++) {
			if(matriz[i][matriz.length-1-i]!=simbolo) {
				return ' ';
			}
		}
		return simbolo;
	}


	//Metodo para comprobar la diagonal principal
	public static char diagonalPrincipalHecha(char[][] matriz) {
		//Comprobacion de que realmente existe una diagonal completa
		if(matriz.length!=matriz[0].length) {
			return ' ';
		}

		//Declaramos variables
		char simbolo= matriz[0][0];

		//Si el simbolo es distinto de X o O entonces no devuleve nada
		if(simbolo=='_') {
			return ' ';
		}
		//Comprobamos de que toda la diagonal tenga el mismo simbolo
		for (int i = 0; i < matriz.length; i++) {
			if(matriz[i][i]!=simbolo) {
				return ' ';
			}
		}
		return simbolo;
	}

	//Metodo para comprobar las columnas
	public static char columnaHecha(char[][]matriz) {
		for (int i = 0; i < matriz[0].length; i++) {
			char simbolo=matriz[0][i];

			if (simbolo != '_') {

				boolean completa = true;

				for (int j = 1; j < matriz.length && completa; j++) {
					if (matriz[j][i] != simbolo) {
						completa = false;
					}
				}

				if (completa) {
					return simbolo;
				}
			}
		}

		return ' ';
	}

	//Metodo para comprobar filas
	public static char filaHecha(char[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			char simbolo=matriz[i][0];

			if (simbolo == '_') {
				continue;
			}
			boolean completa = true;

			for (int j = 1; j < matriz[i].length && completa; j++) {
				if (matriz[i][j] != simbolo) {
					completa = false;
				}
			}

			if (completa) {
				return simbolo;
			}
		}

		return ' ';
	}

	//Metodo para gestionar el juego
	public static void gestionJuego(Scanner teclado,char[][] matriz) {
		char turno='X';
		boolean ganador=false;
		do {
			System.out.println("Turno de " + turno);
			mostrarMatriz(matriz);
			if(colocarPosicion(pedirPosicion(teclado, matriz), matriz, turno)) {
				turno = (turno == 'X') ? 'O' : 'X';
			}
			if(ganador(matriz)=='X'||ganador(matriz)=='O') {
				ganador=true;
			}
		}while(hayHuecos(matriz) && !ganador);
		mostrarMatriz(matriz);
	}
	//Metodo para colocar la posicion
	public static boolean colocarPosicion(int[] posicion,char[][] matriz, char turno) {
		if(matriz[posicion[0]][posicion[1]]=='_') {
			matriz[posicion[0]][posicion[1]]=turno;
			return true;
		}else {
			return false;
		}
	}
	//Metodo para seleccionar posicion
	public static int[] pedirPosicion(Scanner teclado, char[][] matriz) {
		int[] posicion=new int[2];
		do {
			System.out.println("Introduce la fila (0-2)");
			posicion[0]=teclado.nextInt();
			System.out.println("Introduce la columna (0-2)");
			posicion[1]=teclado.nextInt();
			if(posicion[0] < 0 || posicion[0] >= matriz.length ||
					posicion[1] < 0 || posicion[1] >= matriz.length) {
				System.err.println("Error: posicion incorrecta");
			}
		}while(posicion[0] < 0 || posicion[0] >= matriz.length ||
				posicion[1] < 0 || posicion[1] >= matriz.length);
		return posicion;
	}
	//Metodo para comprobar que el tablero ya esta lleno
	public static boolean hayHuecos(char[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == '_') {
					return true;
				}
			}
		}
		return false;
	}
	//Metodo para rellenar el tablero con guiones 
	public static void rellenarMatriz(char[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]='_';
			}
		}
	}
	//Metodo que coloca la jugada en la posicion seleccionada
	public static void mostrarMatriz(char[][] matriz) {
		for (char[] i : matriz) {
			System.out.println(Arrays.toString(i)+" ");
		}
	}

}