package dibujos;

public class Dibujar {
	public static void dibujarCuadrado1(int i) {
		for(int fila=1;fila<=i;fila++) {
			for (int columna=1;columna<=i;columna++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}	
	public static void dibujarCuadrado2(int i, int e) {
		for(int fila=1;fila<=i;fila++) {
			for (int columna=1;columna<=e;columna++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void dibujarCuadrado3(int i, int e) {
		char letra='C';
		for(int fila=1;fila<=i;fila++) {
			for (int columna=1;columna<=e;columna++) {
				System.out.print(letra+" ");
			}
			System.out.println();
		}
		
	}
}
