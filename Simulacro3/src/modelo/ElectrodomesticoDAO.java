package modelo;

import java.sql.*;
import java.util.*;

import conexion.ConexionDB;

public class ElectrodomesticoDAO {

    private Electrodomestico map(ResultSet rs) throws SQLException {
        return new Electrodomestico(
            rs.getInt("id"),
            rs.getString("nombre"),
            rs.getString("marca"),
            rs.getDouble("precio"),
            rs.getInt("stock"),
            rs.getString("categoriaEnergetica")
        );
    }

    public void insertar(Electrodomestico e) throws SQLException {
        String sql = """
            INSERT INTO electrodomesticos
            (nombre, marca, precio, stock, categoriaEnergetica)
            VALUES (?, ?, ?, ?, ?)
        """;

        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {

            st.setString(1, e.getNombre());
            st.setString(2, e.getMarca());
            st.setDouble(3, e.getPrecio());
            st.setInt(4, e.getStock());
            st.setString(5, e.getCategoriaEnergetica());
            st.executeUpdate();
        }
    }

    public void actualizar(Electrodomestico e) throws SQLException {
        String sql = """
            UPDATE electrodomesticos
            SET nombre=?, marca=?, precio=?, stock=?, categoriaEnergetica=?
            WHERE id=?
        """;

        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {

            st.setString(1, e.getNombre());
            st.setString(2, e.getMarca());
            st.setDouble(3, e.getPrecio());
            st.setInt(4, e.getStock());
            st.setString(5, e.getCategoriaEnergetica());
            st.setInt(6, e.getId());
            st.executeUpdate();
        }
    }

    public void eliminar(int id) throws SQLException {
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement st = conn.prepareStatement("DELETE FROM electrodomesticos WHERE id=?")) {
            st.setInt(1, id);
            st.executeUpdate();
        }
    }

    public Electrodomestico buscarPorId(int id) throws SQLException {
        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement st = conn.prepareStatement("SELECT * FROM electrodomesticos WHERE id=?")) {

            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            return rs.next() ? map(rs) : null;
        }
    }

    public List<Electrodomestico> buscarPorMarca(String marca) throws SQLException {
        List<Electrodomestico> lista = new ArrayList<>();
        String sql = "SELECT * FROM electrodomesticos WHERE marca LIKE ?";

        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {

            st.setString(1, "%" + marca + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) lista.add(map(rs));
        }
        return lista;
    }

    public List<Electrodomestico> buscarPorCategoria(String cat) throws SQLException {
        List<Electrodomestico> lista = new ArrayList<>();
        String sql = "SELECT * FROM electrodomesticos WHERE categoriaEnergetica=?";

        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement st = conn.prepareStatement(sql)) {

            st.setString(1, cat);
            ResultSet rs = st.executeQuery();
            while (rs.next()) lista.add(map(rs));
        }
        return lista;
    }

    public List<Electrodomestico> obtenerTodos() throws SQLException {
        List<Electrodomestico> lista = new ArrayList<>();

        try (Connection conn = ConexionDB.getConnection();
             PreparedStatement st = conn.prepareStatement("SELECT * FROM electrodomesticos ORDER BY marca, nombre");
             ResultSet rs = st.executeQuery()) {

            while (rs.next()) lista.add(map(rs));
        }
        return lista;
    }
}
