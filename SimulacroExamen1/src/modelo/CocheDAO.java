package modelo;

// CocheDAO.java
// Clase que encapsula todas las operaciones SQL sobre la tabla 'coches'
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import conexion.ConexionBD;

public class CocheDAO {

    // Obtiene la lista de provincias distintas de la tabla 'coches'
    public List<String> obtenerProvincias() throws SQLException {
        List<String> provincias = new ArrayList<>();

        String sql = "SELECT DISTINCT provincia FROM coches ORDER BY provincia";

        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                provincias.add(rs.getString("provincia"));
            }
        }

        return provincias;
    }

    // Obtiene todos los coches de una provincia concreta
    public List<Coche> obtenerCochesPorProvincia(String provincia) throws SQLException {
        List<Coche> coches = new ArrayList<>();

        String sql = "SELECT matricula, anio, marca, modelo, provincia " +
                     "FROM coches WHERE provincia = ? ORDER BY anio DESC";

        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Sustituimos el parámetro ? por la provincia seleccionada
            stmt.setString(1, provincia);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    String matricula = rs.getString("matricula");
                    int anio = rs.getInt("anio");
                    String marca = rs.getString("marca");
                    String modelo = rs.getString("modelo");
                    String prov = rs.getString("provincia");

                    Coche coche = new Coche(matricula, anio, marca, modelo, prov);
                    coches.add(coche);
                }
            }
        }

        return coches;
    }
}
