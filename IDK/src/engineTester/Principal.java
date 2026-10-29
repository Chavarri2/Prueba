package engineTester;

import renderEngine.Ventana;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 22/08/2026
 */
public class Principal {

	public static void main(String[] args) {
		// Creamos una ventana de 1280x720 con un título.
		Ventana ventana = new Ventana(1280, 720, "Vacio");

		// Ejecutamos la ventana (la abre y mantiene funcionando).
		ventana.run();
	}

}