package ejerciciosClase;

public class PrimoCercano {

	public static void main(String[] args) {
		System.out.println(PrimoCercano(Leer.leerEntero("Introduce un numero")));

	}
	//metodo que me calcula la cantidad de divisores de un numero 
		public static int numeroDivisores(int num) {
			
			int contador=0;
			for(int i=1; i<=num;i++) {
				if(num %i ==0) {
					contador++;
				}
			}
			return contador;
		}
		//metodo que comprueba si un numero es primo 
		public static boolean esPrimo(int num) {
			return numeroDivisores(num)==2;
		}
		
		public static int PrimoCercano(int n) {
			int contador=0;
			while(true) {
				contador++;
				if (esPrimo(n+contador))return n+contador;
				if (esPrimo(n-contador))return n-contador;
			}
			
			
		}

}
