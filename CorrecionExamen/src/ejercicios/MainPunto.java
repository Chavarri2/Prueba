package ejercicios;

import java.util.Scanner;

public class MainPunto {

    // TAREA 4
    private static boolean coinciden(Punto p1, Punto p2) {
        return p1.getX() == p2.getX() &&
               p1.getY() == p2.getY();
    }

    public static void main(String[] args) {

        // TAREA 2: crear los puntos
        Punto p1 = new Punto();
        Punto p2 = new Punto(5, 7);

        Scanner sc = new Scanner(System.in);
        int opcion;

        // TAREA 5: menú con bucle hasta coincidir
        do {

            System.out.println("\nPosicion Actual = " + p1);
            System.out.println("Posicion Final = " + p2);

            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Mover X +1");
            System.out.println("2. Mover Y +1");
            System.out.print("Elige opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: p1.moverX(1); break;
                case 2: p1.moverY(1); break;
                default: System.out.println("Opción no válida.");
            }

        } while (!coinciden(p1, p2));

        System.out.println("\n¡Los puntos ya coinciden! " + p1);
        sc.close();
    }
}
