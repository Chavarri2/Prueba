package controlador;

import modelo.Numero;
import vista.Vista;
import java.io.IOException;
import java.util.List;

/**
 * Controlador que gestiona la lógica entre la vista y el modelo.
 */
public class Controlador {

    private final Numero model;
    private final Vista view;

    public Controlador(Numero model, Vista view) {
        this.model = model;
        this.view = view;

        initController();
    }

    /**
     * Asocia los listeners de los botones.
     */
    private void initController() {
        view.getBtnAgregar().addActionListener(e -> agregarNumero());
        view.getBtnContar().addActionListener(e -> contarMultiplos());
    }

    /**
     * Valida y agrega un número al fichero.
     */
    private void agregarNumero() {
        String texto = view.getCampoNumero().getText().trim();

        if (texto.isEmpty()) {
            view.mostrarMensaje("El campo está vacío.");
            return;
        }

        try {
            int numero = Integer.parseInt(texto);
            model.guardarNumero(numero);
            view.mostrarMensaje("Número guardado correctamente.");
            view.getCampoNumero().setText("");

        } catch (NumberFormatException ex) {
            view.mostrarMensaje("Debe introducir un número entero válido.");

        } catch (IOException ex) {
            view.mostrarMensaje("Error al guardar el número: " + ex.getMessage());
        }
    }

    /**
     * Lee el fichero y cuenta cuántos números son múltiplos de 3.
     */
    private void contarMultiplos() {
        try {
            List<Integer> numeros = model.leerNumeros();

            long cantidad = numeros.stream()
                    .filter(n -> n % 3 == 0)
                    .count();

            view.mostrarResultado("Hay " + cantidad + " múltiplos de 3.");

        } catch (IOException ex) {
            view.mostrarMensaje("Error al leer el fichero: " + ex.getMessage());
        }
    }
}
