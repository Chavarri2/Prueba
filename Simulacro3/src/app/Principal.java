package app;

import controlador.Controlador;
import modelo.ElectrodomesticoDAO;
import vista.Vista;

public class Principal {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            Vista vista = new Vista();
            ElectrodomesticoDAO dao = new ElectrodomesticoDAO();
            new Controlador(vista, dao);
            vista.setVisible(true);
        });
    }
}
