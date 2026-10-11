package dibujo;

public class TrianguloInv {	
	public static void Dibujar(int size) {
		for (int i = size; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	

}