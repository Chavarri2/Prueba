package Dibujo1;

public class TrianguloInv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 6;
		Dibujar(SIZE);
	}
	
	public static void Dibujar(int size) {
		for (int i = size; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	

}
