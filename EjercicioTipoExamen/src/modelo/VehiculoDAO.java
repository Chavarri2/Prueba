package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import conexion.Conexion;

public class VehiculoDAO {

	// Obtiene la lista de provincias distintas de la tabla 'coches'
	public List<String> obtenerProvincias() throws SQLException {
		List<String> provincias = new ArrayList<>();

		String sql = "SELECT DISTINCT provincia FROM vehiculos ORDER BY provincia";

		try (Connection conn = Conexion.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery()) {

			while (rs.next()) {
				provincias.add(rs.getString("provincia"));
			}
		}

		return provincias;
	}
	
	// Obtiene todos los vehiculos de una provincia concreta
	public List<Vehiculo> obtenerVehiculos(String provincia)throws SQLException{
		List<Vehiculo> lista = new ArrayList<>();

		String sql = "SELECT marca, vehiculo, provincia, matricula, km " +
				"FROM vehiculos WHERE provincia = ?";

		try (Connection conn = Conexion.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {

			// Sustituimos el parámetro ? por la provincia seleccionada
			stmt.setString(1, provincia);

			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					String marca = rs.getString("marca");
					String tipo = rs.getString("vehiculo");
					String prov = rs.getString("provincia");
					String matricula = rs.getString("matricula");
					double km = rs.getDouble("km");

					Vehiculo vehiculo = new Vehiculo(marca, tipo, prov, matricula, km);
					lista.add(vehiculo);
				}
			}
		}

		return lista;
	}
}
