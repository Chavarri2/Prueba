package controlador;

import modelo.*;
import vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

public class Controlador implements ActionListener {

    private Vista vista;
    private ElectrodomesticoDAO dao;

    public Controlador(Vista vista, ElectrodomesticoDAO dao) {
        this.vista = vista;
        this.dao = dao;
        vista.addListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Object src = e.getSource();

            if (src == vista.btnInsertar) insertar();
            else if (src == vista.btnActualizar) actualizar();
            else if (src == vista.btnEliminar) eliminar();
            else if (src == vista.btnBuscarId) buscarId();
            else if (src == vista.btnBuscarMarca) buscarMarca();
            else if (src == vista.btnBuscarCategoria) buscarCategoria();
            else if (src == vista.btnMostrarTodos) mostrarTodos();

        } catch (Exception ex) {
            vista.txtResultados.setText("ERROR: " + ex.getMessage());
        }
    }

    private Electrodomestico leerSinId() {
        return new Electrodomestico(
            vista.txtNombre.getText(),
            vista.txtMarca.getText(),
            Double.parseDouble(vista.txtPrecio.getText()),
            Integer.parseInt(vista.txtStock.getText()),
            vista.txtCategoria.getText()
        );
    }

    private void insertar() throws SQLException {
        dao.insertar(leerSinId());
        vista.txtResultados.setText("Insertado correctamente\n");
        mostrarTodos();
    }

    private void actualizar() throws SQLException {
        int id = Integer.parseInt(vista.txtId.getText());
        Electrodomestico e = leerSinId();
        e.setId(id);
        dao.actualizar(e);
        vista.txtResultados.setText("Actualizado correctamente\n");
        mostrarTodos();
    }

    private void eliminar() throws SQLException {
        int id = Integer.parseInt(vista.txtId.getText());
        dao.eliminar(id);
        vista.txtResultados.setText("Eliminado correctamente\n");
        mostrarTodos();
    }

    private void buscarId() throws SQLException {
        int id = Integer.parseInt(vista.txtId.getText());
        Electrodomestico e = dao.buscarPorId(id);
        vista.txtResultados.setText(e == null ? "No encontrado" : e.toString());
    }

    private void buscarMarca() throws SQLException {
        List<Electrodomestico> lista = dao.buscarPorMarca(vista.txtMarca.getText());
        mostrarLista(lista);
    }

    private void buscarCategoria() throws SQLException {
        List<Electrodomestico> lista = dao.buscarPorCategoria(vista.txtCategoria.getText());
        mostrarLista(lista);
    }

    private void mostrarTodos() throws SQLException {
        mostrarLista(dao.obtenerTodos());
    }

    private void mostrarLista(List<Electrodomestico> lista) {
        StringBuilder sb = new StringBuilder();
        for (Electrodomestico e : lista) sb.append(e).append("\n");
        vista.txtResultados.setText(sb.toString());
    }
}
