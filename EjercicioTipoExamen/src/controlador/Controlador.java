package controlador;

// CocheController.java
// Controlador: coordina la vista y el modelo (DAO)
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import modelo.Vehiculo;
import modelo.VehiculoDAO;
import vista.Vista;

public class Controlador {

    private Vista vista;
    private VehiculoDAO dao;

    public Controlador(Vista vista, VehiculoDAO dao) {
        this.vista = vista;
        this.dao = dao;

        // Al crear el controlador, cargamos las provincias en el combo
        cargarProvincias();

        // Registramos el listener del botón "Mostrar coches"
        this.vista.addMostrarVehiculosListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarVehiculosPorProvincia();
            }
        });
    }

    // Parte 1: cargar provincias al iniciar
    private void cargarProvincias() {
        try {
            List<String> provincias = dao.obtenerProvincias();
            vista.setProvincias(provincias);
        } catch (SQLException ex) {
            ex.printStackTrace();
            vista.mostrarError("Error al cargar provincias: " + ex.getMessage());
        }
    }

    // Parte 2: filtrar coches cuando se pulsa el botón
    private void mostrarVehiculosPorProvincia() {
        String provinciaSeleccionada = vista.getProvinciaSeleccionada();

        if (provinciaSeleccionada == null) {
            vista.mostrarError("No hay ninguna provincia seleccionada.");
            return;
        }

        try {
            List<Vehiculo> vehiculos = dao.obtenerVehiculos(provinciaSeleccionada);

            if (vehiculos.isEmpty()) {
                vista.mostrarResultados("No hay coches para la provincia: " + provinciaSeleccionada);
            } else {
                StringBuilder sb = new StringBuilder();
                for (Vehiculo v : vehiculos) {
                    // Usamos el toString() de Coche: "1234ABC - Toyota Corolla (2018)"
                    sb.append(v.toString()).append("\n");
                }
                vista.mostrarResultados(sb.toString());
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            vista.mostrarError("Error al obtener coches: " + ex.getMessage());
        }
    }
}

