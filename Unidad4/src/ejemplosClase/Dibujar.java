package ejemplosClase;

public class Dibujar {
	//metodo que dibuja un cuadrado de * al que le pasamos como argumento el lado
		public static void dibujarCuadrado(int n) {
			for(int f=1;f<=n;f++) {
				for(int c=1;c<=n;c++) {
					System.out.print(" * ");
					
				}
				System.out.println();
			}
		}
}
