package modelo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class DAOStudent {
	public static Long crearEstudiantesEjemplo(Student s1) {
		Transaction tx = null;
		// try-with-resources: la sesión se cierra automáticamente al salir del bloque
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction(); // Iniciamos la transacción
			// Sufijo de tiempo para emails únicos en cada ejecución
			
			// persist() marca cada objeto para ser insertado al hacer commit
			session.persist(s1);
			tx.commit(); // Ejecuta los INSERTs en la BD y cierra la transacción
			// Después del commit, Hibernate ha rellenado los IDs generados por la BD
		} catch (Exception e) {
			rollbackSiHaceFalta(tx); // Si hay error, deshacemos todo
			System.err.println("Error en CREATE: " + e.getMessage());
		}
		return s1.getId();
	}
	public static void leerEstudiantePorId(Long id) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// get() busca por clave primaria. Devuelve null si no existe.
			Student student = session.get(Student.class, id);
			if (student != null) {
				System.out.println("Encontrado: " + student);
			} else {
				System.out.println("No existe estudiante con ID " + id);
			}
		} catch (Exception e) {
			System.err.println("Error en READ por ID: " + e.getMessage());
		}
		// No hace falta Transaction para operaciones de solo lectura
	}
	public static void listarTodosLosEstudiantes() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// HQL (Hibernate Query Language): usa nombres de CLASES, no de tablas
			// "from Student" equivale a "SELECT * FROM students"
			List<Student> estudiantes = session
					.createQuery("from Student", Student.class)
					.list();
			if (estudiantes.isEmpty()) {
				System.out.println("No hay estudiantes registrados.");
			} else {
				estudiantes.forEach(System.out::println);
			}
		} catch (Exception e) {
			System.err.println("Error en listado: " + e.getMessage());
		}
	}
	public static void actualizarEstudiante(Long id, String nuevoNombre, Integer
			nuevaEdad) {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			// Paso 1: Cargamos el objeto desde la BD
			Student student = session.get(Student.class, id);
			if (student != null) {
				// Paso 2: Modificamos el objeto Java como siempre
				student.setNombre(nuevoNombre);
				student.setEdad(nuevaEdad);
				// Paso 3: merge() genera automáticamente el UPDATE en SQL
				session.merge(student);
				tx.commit();
				System.out.println("Estudiante actualizado correctamente.");
			} else {
				System.out.println("No se puede actualizar: ID " + id + " no existe");
				rollbackSiHaceFalta(tx);
			}
		} catch (Exception e) {
			rollbackSiHaceFalta(tx);
			System.err.println("Error en UPDATE: " + e.getMessage());
		}
	}
	public static void eliminarEstudiante(Long id) {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			// Cargamos el objeto para verificar que existe
			Student student = session.get(Student.class, id);
			if (student != null) {
				// remove() marca el objeto para ser eliminado al hacer commit
				session.remove(student);
				tx.commit();
				System.out.println("Estudiante eliminado correctamente.");
			} else {
				System.out.println("No se puede eliminar: ID " + id + " no existe");
				rollbackSiHaceFalta(tx);
			}
		} catch (Exception e) {
			rollbackSiHaceFalta(tx);
			System.err.println("Error en DELETE: " + e.getMessage());
		}
	}
	public static void deleteAllStudents() {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
				int filas= session.createMutationQuery("DELETE FROM Student").executeUpdate();
				tx.commit();
				System.out.println(filas+" estudiantes eliminados correctamente.");
				
		} catch (Exception e) {
			rollbackSiHaceFalta(tx);
			System.err.println("Error en DELETE: " + e.getMessage());
		}
	}
	public static void rollbackSiHaceFalta(Transaction tx) {
		if (tx != null) {
			try {
				if (tx.isActive()) {
					tx.rollback(); // Deshace todos los cambios de la transacción
				}
			} catch (Exception ex) {
				System.err.println("No fue posible hacer rollback: " + ex.getMessage());
			}
		}
	}
}
