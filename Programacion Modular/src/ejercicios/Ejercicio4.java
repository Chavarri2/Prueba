package ejercicios;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 27/10/2026
 * Crea un procedimiento mostrarProgreso(int porcentaje) que dibuje una barra de 20
 * posiciones en la que cada # representa un 5 % y el resto se rellena con puntos. Al final se muestra
 * el porcentaje. Por ejemplo, mostrarProgreso(45) mostrará:
 * [#########...........] 45%
 * Si el porcentaje no está entre 0 y 100, el procedimiento mostrará un mensaje de error en lugar de
 * la barra.
 * Desde el main, muestra la barra para 0, 10, 20… hasta 100, y prueba también un valor no válido.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		//Inicializamos variables
		int num1=-5;
		//bucle for que recorrera desde 0 hasta 100 de 10 en 10
		for (int i = 0; i <= 100; i+=10) {
			barraCarga(i);
		}
		barraCarga(num1);
	}
	//Metodo que muestra una barra de carga
	public static void barraCarga(int porcentaje) {
		if(porcentaje>=0 && porcentaje<=100) {
			System.out.print("[");
			for (int i = 0; i <= porcentaje; i+=5) {
				System.out.print("#");
			}
			for (int i = porcentaje; i < 100; i+=5) {
				System.out.print(".");
			}
			System.out.print("] "+porcentaje+"%");
		}else {
			System.err.println("Error: valor no valido");
		}
		System.out.println();
	}
}
