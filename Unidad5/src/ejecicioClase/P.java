package ejecicioClase;

public class P {
	public static void main(String[]args) {
		int cont=0;
		for (int i = 1; i <= 6; i++) {
			for (int x = 1; x <= cont; x++) {
				System.out.print("* ");
			}
			for (int j = cont; j <= 6; j++) {
				System.out.print(i*j+" ");
				
			}
			cont++;
			System.out.println();
		}
	}
}
