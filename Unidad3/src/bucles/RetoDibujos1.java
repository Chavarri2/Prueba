package bucles;

public class RetoDibujos1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int TAMANO = 6;
		
		
		for (int fila = 1; fila <= TAMANO; fila++) {
			for (int columna = 1; columna <= TAMANO; columna++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
