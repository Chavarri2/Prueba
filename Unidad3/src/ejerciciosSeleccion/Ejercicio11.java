package ejerciciosSeleccion;

import java.util.Scanner;

/**
 * @author Alumno
 * @version 1.0
 * @since 22/10/2026
 * Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente.
 */
public class Ejercicio11 {

	public static void main(String[] args) {
		//Creamos objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
		//Declaramos variables
		int segundos,minutos,horas;
		//Entrada y salida de datos
		do {
			System.out.println("Introduce las horas");
			horas=teclado.nextInt();
			System.out.println("Introduce los minutos");
			minutos=teclado.nextInt();
			System.out.println("Introduce los segundos");
			segundos=teclado.nextInt();
			if(segundos<0 || segundos>60||minutos<0 || minutos>60||horas<0 || horas>60) {
				System.err.println("Error: Valores invalidos");
			}
			
		}while(segundos<0 || segundos>60||minutos<0 || minutos>60||horas<0 || horas>23);

		segundos++;
		// Comprobamos si los segundos desbordan (llegan a 60)
        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }

        // Comprobamos si los minutos desbordan (llegan a 60)
        if (minutos == 60) {
            minutos = 0;
            horas++;
        }

        // Comprobamos si las horas desbordan (llegan a 24)
        if (horas == 24) {
            horas = 0;
        }
        
        // Mostramos el resultado formateado (opcionalmente puedes usar %02d para que salga con dos dígitos, ej: 09:05:03)
        System.out.printf("La hora en el segundo siguiente es: %02d:%02d:%02d\n", horas, minutos, segundos);
		
		//Cerramos objeto de la clase Scanner
		teclado.close();
	}

}
