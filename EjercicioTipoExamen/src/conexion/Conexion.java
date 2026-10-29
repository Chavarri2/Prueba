package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion{
	private final static String URL="jdbc:sqlite:vehiculos.db";

    // Devuelve una nueva conexión a la BD
    public static Connection getConnection() throws SQLException {
        // No hace falta registrar el driver explícitamente en versiones modernas de Java
        return DriverManager.getConnection(URL);
    }
}
