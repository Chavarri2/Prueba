package ejercicios;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Declaración de variables
        int n;
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese un numero: ");
        n = scanner.nextInt();

        // Salida: divisores de n
        if (n % 2 == 0) {
        System.out.println("\n"+n + " es un numero no es un numero");
        } else {
        	System.out.println("\n"+n + " es un numero primos");
        }
        System.out.println("\nFin del programa");
        scanner.close();
	}

}
