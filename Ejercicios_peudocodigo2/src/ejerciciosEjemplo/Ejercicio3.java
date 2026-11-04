package ejerciciosEjemplo;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Declaración de variables
        int n;
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos con validación
        System.out.print("Ingrese un numero (entre 1 y 100): ");
        n = scanner.nextInt();
        while (n < 1 || n > 100) {
            System.out.println("\nError: el numero debe estar entre 1 y 100");
            System.out.print("Ingrese un numero: ");
            n = scanner.nextInt();
        }

        // Salida: tabla de multiplicar
        System.out.println("\nTABLA DE MULTIPLICAR DE " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        System.out.println("Fin del programa");
        scanner.close();
	}

}
