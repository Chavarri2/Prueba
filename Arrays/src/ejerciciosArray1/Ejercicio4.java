package ejerciciosArray1;
/*
 * Generar  dos vectores de dimensión  10 (dar valores aleatorios entre 1 y 5) y comprobar para 
cada uno de los elementos  del primer vector cuántas veces está en el segundo, es decir 
     primero: 3,7,2 
     segundo: 3,3,5 
     el resultado debe ser: 
     elemento 1: 2 veces 
     elemento 2: 0 veces 
     elemento 3: 0 veces 
     */
import java.util.Arrays;

public class Ejercicio4 {

    public static void main(String[] args) {
        int [] vector1 = new int[10];
        int [] vector2 = new int[10];

        vector1(vector1);
        vector2(vector2);

        System.out.println("Vector 1: " + Arrays.toString(vector1));
        System.out.println("Vector 2: " + Arrays.toString(vector2));

        int[] result = numeroElementosComun(vector1, vector2);

        // Mostrar resultados
        for (int i = 0; i < result.length; i++) {
            System.out.println("Elemento " + (i) +": "+ result[i] + " veces");
        }
    }

    private static void vector1(int[] vector1) {
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (int)(Math.random() * 5 + 1);
        }
    }

    private static void vector2(int[] vector2) {
        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = (int)(Math.random() * 5 + 1);
        }
    }

    private static int[] numeroElementosComun(int[] vector1, int[] vector2) {
        int[] result = new int[vector1.length];
        for (int i = 0; i < vector1.length; i++) {
            for (int e = 0; e < vector2.length; e++) {
                if (vector1[i] == vector2[e]) {
                    result[i]++;
                }
            }
        }
        return result;
    }
}