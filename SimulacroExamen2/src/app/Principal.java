package app;

import controlador.Controlador;
import modelo.Numero;
import vista.Vista;

public class Principal {
    public static void main(String[] args) {
        Numero model = new Numero();
        Vista view = new Vista();
        new Controlador(model, view);
        view.setVisible(true);
    }
}
