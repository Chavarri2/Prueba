package ejerciciosArrays2;
/*Generar una matriz de 5x5 (numérica entera con números de 0 a 9) 
 * e imprimir el valor más grande,el más pequeño y los lugares donde 
 * se encuentran.*/
public class Ejecicio2 {

	public static void main(String[] args) {
		int[][]vector=new int [5][5];
		llenarArray(vector);
		imprimirVector(vector);
		menorMayor(vector);
	}
	private static void llenarArray(int[][]vector) {
		for (int f=0;f<vector.length;f++) {
			for (int c=0;c<vector.length;c++) {
				vector[f][c]=(int)(Math.random()*10);
			}
		}
	}
	private static void imprimirVector(int[][]vector) {
		for (int f=0;f<vector.length;f++) {
			for (int c=0;c<vector[f].length;c++) {
				vector[f][c]=(int)(Math.random()*10);
				System.out.printf("%4d",vector[f][c]);
			}
			System.out.println();
		}
	}
	private static void menorMayor (int[][]vector) {
		int mayor= vector[0][0], menor=vector[0][0], filaMayor=0,filaMenor=0,colMayor=0,colMenor=0;
		for (int f=0;f<vector.length;f++) {
			for (int c=0;c<vector[f].length;c++) {
				if(vector[f][c]>mayor) {
					mayor=vector[f][c];
					filaMayor= f;
					colMayor=c;
				}
				if(vector[f][c]<menor) {
					menor=vector[f][c];
					filaMenor=f;
					colMenor=c;
				}
			}
		}
		System.out.println("El numero mayor es: "+mayor+" y su posicion de fila es: "+filaMayor+" y su columna: "+colMayor);
		System.out.println("El numero menor es: "+menor+" y su posicion de fila es: "+filaMenor+" y su columna: "+colMenor);
	}

}
