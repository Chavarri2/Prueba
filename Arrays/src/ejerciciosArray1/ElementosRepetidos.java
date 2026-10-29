package ejerciciosArray1;
/*Carlos abraham chavarri valera
 * 14/11/2025
 * Generar  dos vectores de dimensión  10 (dar valores aleatorios entre 1 y 5) y comprobar para 
cada uno de los elementos  del primer vector cuántas veces está en el segundo, es decir 
     primero: 3,7,2 
     segundo: 3,3,5 
     el resultado debe ser: 
     elemento 1: 2 veces 
     elemento 2: 0 veces 
     elemento 3: 0 veces*/
public class ElementosRepetidos {

	public static void main(String[] args) {
		// Generar vectores
		int [] vector1=new int [10];
		int [] vector2=new int [10];
		//La componente i del resultado contiene la cantidad de veces que aparece vector1[i] en vector2
		int [] resultado=new int [vector1.length];
		
		llenarVector(vector1);
		llenarVector(vector2);
		mostrarVector(vector1);
		mostrarVector(vector2);
		resultado=generarFrecuencias(vector1,vector2);
		//mostrar resultados
		for(int i=0;i<resultado.length;i++) {
			System.out.println("La componente "+ i+ " aparece " + resultado[i]);
		}
	}
	private static void llenarVector(int[]vector) {
		for(int i=0;i<vector.length;i++) {
			vector[i]=(int)(Math.random()*5+1);
		}
	}
	private static void mostrarVector(int[]vector) {
		for(int i=0;i<vector.length;i++) {
			System.out.printf("%4d",vector[i]);
		}
		System.out.println("");
	}
	private static int [] generarFrecuencias (int []v1,int []v2) {
		int [] resultado=new int[v1.length];
		for(int i=0;i<v1.length;i++) {//recorro v1
			for(int j=0;j<v2.length;j++) {
				if (v2[j]==v1[i]) {
					resultado[i]++;
				}
			}
		}
		
		return resultado;
	}
	
}
