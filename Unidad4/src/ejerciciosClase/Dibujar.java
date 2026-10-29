package ejerciciosClase;
/*
 * Carlos Abraham Chavarri Valera
 * 27/10/2025
 * Metodos para los ejercicios de dibujar un cuadrado (ejercicios 3,4,5)
 */
public class Dibujar {
	//Metodo que dibuja un cuadrado de lado n de "*"
	public static void dibujarCuadrado (int n) {
		for (int f=1;f<=n;f++) { //f de filas
			for (int c=1;c<=n;c++) { //c de columnas
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//Metodo que dibuja un rectangulo de medidas n x m
	public static void dibujarCuadrado (int n, int m) {
		for (int f=1;f<=n;f++) { //f de filas
			for (int c=1;c<=m;c++) { //c de columnas
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//Metodo que dibuja un rectangulo de n*m del caracter que le indicamos
	public static void dibujarCuadrado (int n, int m, char ch) {
		for (int f=1;f<=n;f++) { //f de filas
			for (int c=1;c<=m;c++) { //c de columnas
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}
