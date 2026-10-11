package dibujo;

public class Marco {
	
	public static void Dibujar(int size) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == 0 || i == size-1) System.out.print("* ");
				else {
					if (j == 0 || j == size-1) System.out.print("* ");
					else System.out.print("  ");
				}
				
			}
			System.out.println("");
		}
	}

}
