package app;

import java.util.ArrayList;
import java.util.List;

import modelo.DAOStudent;
import modelo.Student;
import util.HibernateUtil;

public class Principal {

	public static void main(String[] args) {
		System.out.println("=== INICIO PRÁCTICA HIBERNATE + SQLITE ===\n");
		List<Long> idsCreados= new ArrayList<>();
		String sufijo = String.valueOf(System.currentTimeMillis());
		// Creamos objetos Java normales (aún no están en la BD)
		Student s1 = new Student("Ana", "García López", 20,
				"ana.garcia." + sufijo + "@example.com");
		Student s2 = new Student("Carlos", "Pérez Martín", 22,
				"carlos.perez." + sufijo + "@example.com");
		Student s3 = new Student("Lucía", "Ruiz Torres", 21,
				"lucia.ruiz." + sufijo + "@example.com");
		// 1) CREATE: insertar estudiantes, obtener sus IDs
		idsCreados.add(DAOStudent.crearEstudiantesEjemplo(s1));
		idsCreados.add(DAOStudent.crearEstudiantesEjemplo(s2));
		idsCreados.add(DAOStudent.crearEstudiantesEjemplo(s3));
		if (!idsCreados.isEmpty()) {
			Long idPrimero = idsCreados.get(0);
			Long idUltimo = idsCreados.get(idsCreados.size() - 1);
			// 2) READ: buscar por ID y listar todos
			DAOStudent.leerEstudiantePorId(idPrimero);
			DAOStudent.listarTodosLosEstudiantes();
			// 3) UPDATE: modificar nombre y edad del primero
			DAOStudent.actualizarEstudiante(idPrimero, "Lucía (actualizado)", 23);
			// 4) DELETE: eliminar el último
			DAOStudent.eliminarEstudiante(idUltimo);
			DAOStudent.listarTodosLosEstudiantes();
			//DAOStudent.deleteAllStudents();
		}
		HibernateUtil.shutdown(); // Cierra conexiones al terminar
		System.out.println("\n=== FIN PRÁCTICA ===");
	}

}
