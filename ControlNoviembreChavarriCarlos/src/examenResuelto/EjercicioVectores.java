package examenResuelto;
/**
 * Ejercicio 1 del examen sobre arrays
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0-26-11-25
 * */
public class EjercicioVectores {

	public static void main(String[] args) {
		// Definir arrays
		final int DIMENSION =10;
		int [] arrayA=new int [DIMENSION];
		int [] arrayB=new int [DIMENSION];
		char[] arrayX=new char [DIMENSION];
		// Llenar arrays
		llenarArray(arrayA);
		llenarArray(arrayB);
		// Mostrar arrays
		mostrarArray(arrayA);
		mostrarArray(arrayB);
		// Generar comparacion
		arrayX=comparar(arrayA,arrayB);
		// Mostrar array
		mostrarArray(arrayX);
		// Analizar y mostrar resultados
		analizarResultado(arrayX);
	}
	
	private static void analizarResultado(char[] arrayX) {
		int contadorA=0,contadorB=0,contadorX=0;
		for (int i = 0; i < arrayX.length; i++) {
			if(arrayX[i]=='A') {
				contadorA++;
			}
			if(arrayX[i]=='B') {
				contadorB++;
			}
			if(arrayX[i]=='X') {
				contadorX++;
			}
		}
		System.out.println("A: "+contadorA+"\nB: "+contadorB+"\nX: "+contadorX);
		if (contadorA>contadorB) {
			System.out.println("Ganador A");
		}else if (contadorA<contadorB) {
			System.out.println("Ganador B");
		}else {
			System.out.println("empatados");
		}
	}

	private static char[] comparar(int[] arrayA, int[] arrayB) {
		// Defino vector
		char[] vector=new char[arrayA.length];
		// Recorro los vectores
		for (int i = 0; i < arrayB.length; i++) {
			if(arrayA[i]>arrayB[i]) {
				vector[i]='A';
			}else if(arrayA[i]<arrayB[i]) {
				vector[i]='B';
			}else{
				vector[i]='X';
			}
		}
		return vector;
	}

	// Metodo que llena array
	private static void llenarArray(int []v) {
		for (int i = 0; i < v.length; i++) {
			v[i]=(int)(Math.random()*6+1);
		}
	}
	
	// Metodo que muestra arrays
	private static void mostrarArray(int []v) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%3d",v[i]);
		}
		System.out.println();
	}
	// Metodo que muestra arrays
	private static void mostrarArray(char []v) {
		for (int i = 0; i < v.length; i++) {
			System.out.printf("%3c",v[i]);
		}
		System.out.println();
	}
}
