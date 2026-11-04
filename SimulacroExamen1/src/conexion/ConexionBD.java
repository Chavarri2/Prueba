package conexion;

// ConexionBD.java
// Clase responsable de crear y devolver la conexión a la base de datos SQLite
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    // Ruta del fichero SQLite (ajústala a donde tengas el .db)
    private static final String URL = "jdbc:sqlite:coches.db";

    // Devuelve una nueva conexión a la BD
    public static Connection getConnection() throws SQLException {
        // No hace falta registrar el driver explícitamente en versiones modernas de Java
        return DriverManager.getConnection(URL);
    }
}
