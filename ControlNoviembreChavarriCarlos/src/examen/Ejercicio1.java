package examen;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Declarar Variables
		int arrayA[]=new int [10];
		int arrayB[]=new int [10];
		//llamar variables
		llenar(arrayA);
		llenar(arrayB);
		//salida de datos
		System.out.println("Comparacion entre arrayA y arrayB");
		comparacion(arrayA,arrayB);
		System.out.println("");
		System.out.println("");
		resultado(arrayA,arrayB);
	}
	//metodo para rellenar arrays
	private static void llenar(int[]array) {
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)(Math.random()*6+1);
			//muestra por pantalla el array con separacion de 3
			System.out.printf("%3s",array[i]);
		}
		System.out.println("");
		
	}
	//metodo para comparar arrays
	private static void comparacion(int[]arrayA,int[]arrayB) {
		//declaro variables
		String[] arrayX=new String[10];
		//hago un for para recorrer los arrays, comparo A con B y lo plasmo en un nuevo array
		for (int i = 0; i < arrayA.length; i++) {
			if(arrayA[i]>arrayB[i]) {
				arrayX[i]="A";
			} else if(arrayA[i]<arrayB[i]){
				arrayX[i]="B";
			}else if(arrayA[i]==arrayB[i]) {
				arrayX[i]="X";
			}
			//muestra por pantalla el arrayX con separacion de 3
			System.out.printf("%3s",arrayX[i]);
		}
	}
	//metodo para ver los resultados, es decir la cantidad de veces que hay numeros iguales, mas grande que el otro o menor que el otro
	private static void resultado(int[]arrayA,int[]arrayB) {
		//defino variable
		int[] resultado=new int[3];
		//recorro las variables como el metodo comparacion
		for (int i = 0; i < arrayA.length; i++) {
			if(arrayA[i]>arrayB[i]) {
				resultado[0]++;
			} else if(arrayA[i]<arrayB[i]){
				resultado[1]++;
			}else if(arrayA[i]==arrayB[i]) {
				resultado[2]++;
			}
		
		}
		//muestro los resultados
		System.out.println("Hay "+resultado[0]+" letras A");
		System.out.println("Hay "+resultado[1]+" letras B");
		System.out.println("Hay "+resultado[2]+" letras X");
	}
	
}
