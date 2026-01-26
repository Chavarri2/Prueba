package ejemplosClase;
/*
 * Carlos Abraham Chavarri Valera
 * 22/10/2025
 * Ejemplos creacion de metodos
 */
public class Ejemplo1 {

	public static void main(String[] args) {
		saludar();
		saludar("Carlos");
		saludar("carlos",4);
		dibujarCuadrado(8);
	}
	//metodo que salude
	public static void saludar() {
		System.out.println("Hola soy alumno bienvenido a clase");
	}
	//metodo que al saludar al que le paso como argumento el nombre persona
	public static void saludar(String s) {
		System.out.println("Hola soy "+s+" bienvenido a clase");
	}
	//metodo saludar al que le paso como argumento el nombre y el numero de veces que 
	public static void saludar(String s,int v) {
		for (int i=1;i<=v;i++) {
			System.out.println("Hola soy "+s+" bienvenido a clases");
		}
	}
	//metodo que dibuja in cuadrado de * al que le pasamos como argumento el lado
	public static void dibujarCuadrado(int n) {
		for (int fila = 1; fila <= n; fila++) {
		    for (int columna = 1; columna <= n; columna++) {
		        System.out.print("* ");
		    }
		System.out.println(); 
		}
	}
}