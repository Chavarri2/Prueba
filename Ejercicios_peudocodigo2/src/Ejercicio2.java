import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Declaración de variables
        int n, suma = 0;
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese numero: ");
        n = scanner.nextInt();

        // Proceso: suma de cuadrados de pares
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) { // Verifica si i es par
                suma += i * i; // Suma el cuadrado de i
            }
        }

        // Salida de datos
        System.out.println("\nLa suma de los cuadrados de los números pares entre 1 y " + n + " es: " + suma);
        System.out.println("Fin del programa");
        scanner.close();
	}

}
