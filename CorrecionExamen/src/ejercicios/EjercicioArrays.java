package ejercicios;

public class EjercicioArrays {

	public static void main(String[] args) {
		// Definir Arrays
		
		int[]arrayA=new int[10];
		int[]arrayB=new int[10];
		String[] resultado;
		String ganador;
		//LLamamos al metodo llenar
		llenar(arrayA); 
		llenar(arrayB);
		mostrarArray(arrayA);
		mostrarArray(arrayB);
		//Llamamos al metodo comparacion
		resultado=comparacion(arrayA,arrayB);
		
		mostrarArray(resultado);
		
		//Llamamos resultados
		ganador=resultados(resultado);
		System.out.println(ganador);

	}
	private static void mostrarArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%3s",array[i]);
		}
		System.out.println();
		
	}
	private static void mostrarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%3d",array[i]);
		}
		System.out.println();
		
	}
	//Metodo para llenar del 1 al 6 de forma aleatoria.
	private static void llenar (int []array) {
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*6+1);
			
		}
	}
	
	//Nuevo metodo que compara los dos vectores ArrayA y arrayB
	private static String[] comparacion(int []arrayA, int[]arrayB) {
		String[]arrayX= new String[arrayA.length];
		
		//Recorremos el array
		for(int i=0; i<arrayA.length; i++) {
			if(arrayA[i]>arrayB[i]) {
				arrayX[i]="A";
			}if(arrayA[i]<arrayB[i]) {
				arrayX[i]="B";
			}if(arrayA[i]==arrayB[i]) {
				arrayX[i]="X";
			}
		}
		return arrayX;
	}
	private static String resultados(String[]resultado) {
		int A=0,B=0,X=0;
		for (int i = 0; i < resultado.length; i++) {
			if(resultado[i].equals("A")) {
				A++;
			}
			if(resultado[i].equals("B")) {
				B++;
			}
			if(resultado[i].equals("X")) {
				X++;
			}
		}
		
		String ganador="";
		if(A>B) {
			ganador="arrayA";
		}else if (B>A) {
			ganador="arrayB";
		}else{
			ganador="empate";
		}
		return "A:"+A+"\nB:"+B+"\nX:"+X+"\n"+"El ganador es "+ganador;
	}

}
