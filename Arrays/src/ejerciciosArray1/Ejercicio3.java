package ejerciciosArray1;

public class Ejercicio3 {

	public static void main(String[] args) {
		int[]vector=new int [10];
		llenarArray(vector);
		imprimirVector(vector);
		menorMayor(vector);
	}
	private static void llenarArray(int[]vector) {
		for (int i=0;i<vector.length;i++) {
			vector[i]=(int)(Math.random()*20+1);
		}
	}
	private static void imprimirVector(int[]vector) {
		for (int i=0;i<vector.length;i++) {
			System.out.printf("%4d",vector[i]);
		}
		System.out.println();
	}
	private static void menorMayor (int[]vector) {
		int mayor= vector[0], menor=vector[0], posMayor=0,posMenor=0;
		for(int i=0;i<vector.length;i++) {
			if(mayor<vector[i]) {
				mayor=vector[i];
				posMayor=i;
			}
			if(menor>vector[i]) {
				menor=vector[i];
				posMenor=vector[i];
			}
		}
		System.out.println("El numero mayor es: "+mayor+" y su posicion es: "+posMayor);
		System.out.println("El numero menor es: "+menor+" y su posicion es: "+posMenor);
	}
}
