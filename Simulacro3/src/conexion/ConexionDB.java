package conexion;

import java.sql.*;

public class ConexionDB {

    private static final String URL = "jdbc:sqlite:electrodomesticos.db";

    public static Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(URL);
        //crearTabla(conn);
        return conn;
    }

    private static void crearTabla(Connection conn) throws SQLException {
        String sql = """
            CREATE TABLE IF NOT EXISTS electrodomesticos (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                nombre TEXT NOT NULL,
                marca TEXT NOT NULL,
                precio REAL NOT NULL,
                stock INTEGER NOT NULL,
                categoriaEnergetica TEXT NOT NULL
            );
        """;
        String sql2 = """
                INSERT INTO electrodomesticos
                (nombre, marca, precio, stock, categoriaEnergetica)
                VALUES
                ('Lavadora', 'Samsung', 399.27, 10, 'A+++'),
                ('Frigorífico', 'LG', 599.99, 5, 'A++'),
                ('Lavavajillas', 'Bosch', 450.50, 7, 'A+++'),
                ('Horno', 'Balay', 320.00, 8, 'A+'),
                ('Microondas', 'Xiaomi', 89.90, 20, 'A');
            """;

        conn.createStatement().execute(sql);
        conn.createStatement().execute(sql2);
    }
}
