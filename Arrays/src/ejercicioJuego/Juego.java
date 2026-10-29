package ejercicioJuego;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 14/11/2025 
 * Desarrolla un programa en Java que simule un juego competitivo entre 4 jugadores. 
 * El programa debe cumplir con los siguientes requisitos:
 * 
 * Estructura de Partidas y Rondas:
 * 		Se disputarán un máximo de 20 partidas (configurable mediante constantes).
 * 		Cada partida constará de 20 juegos o rondas de acumulación de puntos.
 * 
 * Mecánica de Puntuación:
 * 		En cada ronda, se generará un número aleatorio entre 1 y 4 (inclusivos), 
 * 		representando al jugador ganador de dicha ronda.
 * 		Los puntos obtenidos se deben almacenar y gestionar.
 * 
 * Modularidad y Salida de Datos:
 * 		El programa debe contar con métodos independientes para:
 * 	
 * Al finalizar cada partida, se le debe preguntar al usuario si desea continuar jugando.
 */

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		// Constante JUEGO que indica cuantos juegos va a tener una partida
		// Constante PARTIDASJUGABLES que indica cuantas partidas es el maximo que se
		// puede jugar
		// Constante JUGADORES que indica cuantos JUGADORES estan participando
		final int JUEGO = 20, PARTIDASJUGABLES = 20, JUGADORES = 4;
		// Creamos Objeto de clase Scanner
		Scanner teclado = new Scanner(System.in);
		// Declaramos Variables
		String decicion;
		int[] puntos = new int[4];
		// Inicializamos variables
		int miguel = 0, juanjo = 0, carlos = 0, david = 0;
		int aleatorio = 0, partidas = 0;
		// Salida de datos
		System.out.println("Vamos a jugar!!!! ");

		// Bucle do-while que se ejecutara mientras que partidas sea menor o igual que
		// 20
		// Y decicion sea distinto de enter o s
		do {
			// Usamos bucle for que se repite hasta que se i llegue a JUEGO
			// Lo que quiere decir que se va a dar un punto cada juego en una partida
			// Por ejemplo se reparten 80 puntos en una partida eso quiere decir
			// Que se jugaran 20 veces
			for (int i = 0; i < JUEGO; i++) {
				// Usamos bucle for que se repetira tantos jugadores haya
				// O en otras palabras hasta que j llegue a JUGADORES
				// Cada jugador tiene la oportunidad de ganar un punto
				for (int j = 0; j < JUGADORES; j++) {
					// Llamamos al Metodo NumeroAleatorio para que aleatorio cambie su valor
					// De manera aleatoria entre 1 y 4 y denpendiendo
					aleatorio = numeroAleatorio();
					// Usamos condicional if para evaluar que jugador se ha llevado la victoria
					// Si el numero que salga en aleatorio es igual al que tiene asignado jugador se
					// le
					// Concede la victoria a dicho jugador
					if (aleatorio == 1) {
						miguel++;
					} else if (aleatorio == 2) {
						juanjo++;
					} else if (aleatorio == 3) {
						carlos++;
					} else {
						david++;
					}
				}
			}
			// Suma a partidas 1
			partidas++;
			// Guardar y actualizar los puntos ganados por jugado
			puntos[0] = miguel;
			puntos[1] = juanjo;
			puntos[2] = carlos;
			puntos[3] = david;
			// Salida de datos
			System.out.println("\nLos puntos de los jugadores son: ");
			leerPuntos(puntos);
			// Salida y entrada de datos para saber si se quiere continuar jugando
			System.out.println("\n¿Quieres jugar otra partida? Introduzca 's'" + "\nPor el contrario introduzca 'n'.");
			decicion = teclado.nextLine();
			// Evaluamos condiciones para que el bucle se siga repitiendo
		} while (partidas != PARTIDASJUGABLES && (decicion.equals("") || decicion.toLowerCase().equals("s")));

		// Mensaje que indica que ha llegado al limite de partidas y ya no puede
		// continuar
		if (partidas == PARTIDASJUGABLES) {
			System.out.println("\nHas llegado al limite de partidas jugables\n");
		}
		// Llamamos a metodo que nos indica el jugador con mayor puntaje
		mayorPuntaje(puntos);
		// Mensaje que indica el fin del programa
		System.out.println("Fin del programa");
		// Cerramos Objeto de clase Scanner
		teclado.close();
	}

	// Metodo para visualizar los puntos de los jugadores
	private static void leerPuntos(int[] puntos) {
		// Usamos bucle for para recorrer i hasta puntos y para cada iteracion de i se
		// mostrara los puntos
		// Y el nombre de cada jugador
		for (int i = 0; i < puntos.length; i++) {
			if (i == 0) {
				System.out.println("Miguel " + puntos[i]);
			} else if (i == 1) {
				System.out.println("Juanjo " + puntos[i]);
			} else if (i == 2) {
				System.out.println("Carlos " + puntos[i]);
			} else {
				System.out.println("David " + puntos[i]);
			}
		}
	}

	// Metodo que elije un numero entero aleatorio entre 1 y 4 inclusivos
	private static int numeroAleatorio() {
		// Declaramos variable
		int aleatorio;
		// Le asignamos un valor aleatorio con la clase Math y usando el metodo ramdom
		aleatorio = (int) (Math.random() * 4 + 1);
		// Devolvemos el numero aleatorio (Esto se puede simplificar a una linea)
		return aleatorio;
	}

	// Metodo que muestra el jugador con mas puntos
	private static void mayorPuntaje(int[] puntos) {
		// Usamos estructura condicional if para evaluar el jugador con mas puntos
		if (puntos[0] > puntos[1] && puntos[0] > puntos[2] && puntos[0] > puntos[3]) {
			System.out.println("El jugador con mayor puntaje es Miguel con: " + puntos[0] + " puntos\n");
		} else if (puntos[1] > puntos[2] && puntos[1] > puntos[3]) {
			System.out.println("El jugador con mayor puntaje es Juanjo con: " + puntos[1] + " puntos\n");
		} else if (puntos[2] > puntos[3]) {
			System.out.println("El jugador con mayor puntaje es Carlos con: " + puntos[2] + " puntos\n");
		} else {
			System.out.println("El jugador con mayor puntaje es David con: " + puntos[3] + " puntos\n");
		}
	}

}