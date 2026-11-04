package app;
import javax.swing.SwingUtilities;

import controlador.Controlador;
import modelo.CocheDAO;
import vista.Vista;
//Main.java
//Punto de entrada de la aplicación: crea modelo, vista y controlador
public class Principal {
    public static void main(String[] args) {
        // Ejecutar la creación de la interfaz en el hilo de eventos de Swing
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Vista vista = new Vista();
                CocheDAO dao = new CocheDAO();
                new Controlador(vista, dao);

                vista.setVisible(true);
            }
        });
    }
}
