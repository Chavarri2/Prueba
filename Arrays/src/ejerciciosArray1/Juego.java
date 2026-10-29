package ejerciciosArray1;

public class Juego {

	public static void main(String[] args) {
		final int INTENTOS=10;
		String[] jugadores= {"Juan","Carlos","David","Ana"};
		int[] frecuencias=new int[jugadores.length];//almaceno las veces que gana cada jugador
		
		for (int i = 0; i < INTENTOS; i++) {
			jugar(jugadores,frecuencias);
			mostrarResultados(jugadores,frecuencias);
			Leer.leerString("jugar otra vez");
			
		}
		mostrarganadores(jugadores,frecuencias);
	}
	

	private static void mostrarganadores(String[] jugadores, int[] frecuencias) {
		// Calcular el mayor valor de las frecuencias
		int frecuenciaMayor=frecuencias[0];
		for (int i = 0; i < frecuencias.length; i++) {
			if(frecuencias[i]>frecuenciaMayor) {
				frecuenciaMayor=frecuencias[i];
			}
		}
		// Recorro el vector de jugadores y imprimo los que tienen la frecuenciaMayor
		System.out.println("Los ganadores son: ");
		//recorremos el vector
		for (int i = 0; i < jugadores.length; i++) {
			if(frecuencias[i]==frecuenciaMayor) {
				System.out.println(jugadores[i]+" con: "+frecuencias[i]+" puntos");
			}
		}
		
		
	}


	private static void mostrarResultados(String[] jugadores, int[] frecuencias) {
		for (int i = 0; i < jugadores.length; i++) {
			System.out.printf("%-6s %s%n",jugadores[i],dibujarSimbolo(frecuencias[i]));
		
			
		}
		
	}

	
	private static String dibujarSimbolo(int veces) {
		String resultado="";
		for(int i=0;i<veces;i++) {
			resultado=resultado+"#";
		}
		return resultado;
	}

	private static void jugar(String[] jugadores, int[] frecuencias) {
		//Elegir un numero aleatorio y sumar uno a la frecuencia de partidas ganadas de ese jugador
		int ganadorRonda=(int)(Math.random()*frecuencias.length);
		frecuencias[ganadorRonda]++;
		//muestro el ganador
		System.out.println("El ganador de esta ronda es "+ jugadores [ganadorRonda]);
		
	}

}
