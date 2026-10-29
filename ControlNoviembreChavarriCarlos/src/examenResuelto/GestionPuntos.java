package examenResuelto;

/**
 * Clase ejecutable que muestra como usar la clase Punto
 * 
 * @author Abderrahman Labiod
 * @version 1.0_26-11-25
 */
public class GestionPuntos {

	public static void main(String[] args) {
		// Instanciamos puntos
		Punto inicio = new Punto();
		Punto diana = new Punto(5, 7);
		
		// Repetimos mientras nuestros puntos no coincidan
		do {
			// Mostrar el menú de opciones
			System.out.println("---------- PUNTOS ----------");
			System.out.println("- Posición inicial: " + inicio);
			System.out.println("- Posición final: " + diana);
			System.out.println();
			System.out.println("---------- ACCIONES ----------");
			System.out.println("1. Mover X");
			System.out.println("2. Mover Y");
			System.out.println();
			// Pedir opción
			int opcion = Leer.leerEntero();
			
			// Ejecutar acción según opcion
			switch (opcion) {
				case 1:
					inicio.moverX(Leer.leerEntero("Cantidad a mover X: "));
					break;
				case 2:
					inicio.moverY(Leer.leerEntero("Cantidad a mover Y: "));
					break;
				default:
					System.out.println("OPCIÓN INVÁLIDA!");
					System.out.println("");
					break;
			}
		} while (!Punto.coinciden(inicio, diana));
		
		System.out.println();
		System.out.println("Los puntos han coincidido!");
	}

}
