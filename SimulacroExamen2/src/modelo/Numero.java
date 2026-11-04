package modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Modelo encargado de gestionar el fichero numeros.txt.
 * Se encarga de escribir números y leerlos para realizar operaciones.
 */
public class Numero {

    private final File fichero;

    public Numero() {
        fichero = new File("numeros.txt");
    }

    /**
     * Añade un número entero al fichero, creando el fichero si no existe.
     *
     * @param numero Número entero a guardar.
     * @throws IOException Si ocurre un error al escribir.
     */
    public void guardarNumero(int numero) throws IOException {
        FileWriter fw = new FileWriter(fichero, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(String.valueOf(numero));
        bw.newLine();
        bw.close();
    }

    /**
     * Lee todos los números del fichero y los devuelve en una lista.
     *
     * @return Lista de enteros leídos del fichero.
     * @throws IOException Si ocurre un error al leer.
     */
    public List<Integer> leerNumeros() throws IOException {
        List<Integer> lista = new ArrayList<>();

        if (!fichero.exists()) {
            return lista; // Si no existe, devolvemos lista vacía
        }

        BufferedReader br = new BufferedReader(new FileReader(fichero));
        String linea;

        while ((linea = br.readLine()) != null) {
            try {
                lista.add(Integer.parseInt(linea));
            } catch (NumberFormatException e) {
                // Si una línea no es válida, la ignoramos
            }
        }

        br.close();
        return lista;
    }
}

