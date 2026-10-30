import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EjemploCrud {
	static String url="jdbc:oracle:thin:@localhost:1521/XEPDB1";
	static String user = "PRUEBA";
	static String pass = "1";
	public static void main(String[] args) {
		crearUsuario("Laura", 29); 
		leerUsuarios(); 
		actualizarUsuario(1, "Ana Actualizada", 26); 
		leerUsuarios(); 
		eliminarUsuario(2); 
		leerUsuarios();
	}
	//Metodos
	
	// Metodo para crear usuario
	
	public static void crearUsuario(String nombre, int edad) { 
		String sql = "INSERT INTO usuarios(nombre, edad) VALUES(?, ?)"; 
		try (Connection conn = DriverManager.getConnection(url, user, pass); 
				PreparedStatement pstmt = conn.prepareStatement(sql)) { 
			pstmt.setString(1, nombre); 
			pstmt.setInt(2, edad); 
			pstmt.executeUpdate(); 
			System.out.println("Usuario creado"); 
		} catch (SQLException e) { 
			System.out.println(e.getMessage()); 
		} 
	}
	
	// Metodo para leer usuarios
	
	public static void leerUsuarios() { 
		String sql = "SELECT * FROM usuarios"; 
		try ( Connection conn = DriverManager.getConnection(url, user, pass); 
				Statement stmt = conn.createStatement(); 
				ResultSet rs = stmt.executeQuery(sql)) { 
			while (rs.next()) { 
				System.out.println(rs.getInt("id") + " - " + 
						rs.getString("nombre") + " - " +
						rs.getInt("edad") 
						); 
			} 
		} catch (SQLException e) { 
			System.out.println(e.getMessage()); 
		} 
	}
	
	//Metodo para Actualizar los usuarios
	
	public static void actualizarUsuario(int id, String nombre, int edad) { 
		String sql = "UPDATE usuarios SET nombre = ?, edad = ? WHERE id = ?"; 
		try (Connection conn = DriverManager.getConnection(url, user, pass); 
				PreparedStatement pstmt = conn.prepareStatement(sql)) { 
			pstmt.setString(1, nombre); pstmt.setInt(2, edad); pstmt.setInt(3, id); 
			pstmt.executeUpdate(); System.out.println("Usuario actualizado"); 
		} catch (SQLException e) { 
			System.out.println(e.getMessage()); 
		} 
	}
	
	// Metodo para eliminar un usuario
	
	public static void eliminarUsuario(int id) { 
		String sql = "DELETE FROM usuarios WHERE id = ?"; 
		try (Connection conn = DriverManager.getConnection(url, user, pass); 
				PreparedStatement pstmt = conn.prepareStatement(sql)) { 
			pstmt.setInt(1, id); pstmt.executeUpdate(); 
			System.out.println("Usuario eliminado"); 
		} catch (SQLException e) { 
			System.out.println(e.getMessage()); 
		} 
	}
}
