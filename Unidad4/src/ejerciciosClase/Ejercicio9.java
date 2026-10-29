package ejerciciosClase;
/*
 * Nombre: Abderrahman Ladiod
 * Fecha: 27/10/2025
 * Crear una método maximo(int n1, int n2, int n3) que devuelva el valor máximo de los tres números
 */
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maximo(8, 5, 10));
	}
	
	public static int maximo(int n1, int n2, int n3) {
		int mayor = n1;
		if (n2 >= mayor) {
			mayor = n2;
		}
		
		if (n3 >= mayor) {
			mayor = n3;
		}
		
		return mayor;
	}

}
