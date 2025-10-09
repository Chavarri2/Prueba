import java.util.Scanner;

public class Ejercicio4 {
	/*
	 *Carlos Abraham Chavarri Valera 
	 * 8/10/2025
	 * Escribir un programa que una vez que lea un número n por teclado calcule y escriba
	 * sus divisores por la pantalla
	 */
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
        System.out.println("Los divisores de " + n + " son:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // Verifica si i es divisor de n
                System.out.print(i + " ");
            }
        }
        System.out.println("\nFin del programa");
        scanner.close();
	}

}
