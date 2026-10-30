package ejercicios;

public class Ejercicio9 {

	public static void main(String[] args) {
		//
		System.out.println(maximo(3,80,100));
	}
	public static int maximo (int n1, int n2, int n3) {
		int mayor=n1;
		if (n2>=mayor) {
			mayor=n2;
		}
		if (n3>= mayor) {
			mayor=n3;
		} 
		
		return mayor;
	}
}
