package ejercicios;

import java.util.Scanner;

public class Principal {

    // Método para pedir cadena validada — recomendado en el enunciado
    public static String pedirCadena(Scanner sc) {
        String cadena;
        do {
            System.out.print("Introduce una cadena válida (solo letras, mínimo 8 caracteres): ");
            cadena = sc.nextLine();
        } while (!Utilidades.validar(cadena));  // repetimos hasta que sea válida
        return cadena;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resultado;

        // TAREAS 2 + 3 (en un solo main)
        do {
            System.out.println("\n--- NUEVO INTENTO ---");

            // TAREA 2: pedir cadenas validadas
            String c1 = pedirCadena(sc);
            String c2 = pedirCadena(sc);

            // TAREA 3: concatenar
            resultado = Utilidades.concatenar(c1, c2);

            System.out.println("Resultado concatenado: " + resultado);

        } while (!Utilidades.esPalindromo(resultado)); 
        // repetir hasta que resultado sea palíndromo

        System.out.println("\n¡La cadena resultante ES un palíndromo!");
    }
}
