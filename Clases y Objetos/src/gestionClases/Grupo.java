package gestionClases;

import java.util.Arrays;

/**
 * @author Manuel Loren Ferrer
 * @version 1.0_28-11-2025
 */
public class Grupo {
	private String nombre;
	private Alumno[] alumnos;
/**
 * 
 * @param nombre del grupo
 * @param max maximo numero de alumnos del grupo
 */
	public Grupo(String nombre, int max) {
		this.nombre = nombre;
		alumnos = new Alumno[max];
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the alumnos
	 */
	public Alumno[] getAlumnos() {
		return alumnos;
	}

	/**
	 * @param alumnos the alumnos to set
	 */
	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	@Override
	public String toString() {
		return "Clase [nombre=" + nombre + ", alumnos=" + Arrays.toString(alumnos) + "]";
	}

	public boolean insertar(Alumno alumno) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alumno;
				return true;
			}
		}
		return false;
	}
/**
 * 
 * @param numExpediente numero de expediente de alumno
 * @return calificaciones del alumno con ese numero de expediente
 */
	public Calificacion[] consultarCalificacionesAlumno(int numExpediente) {
		for (Alumno a : alumnos) {
			if (a != null) {
				if (a.getNumeroExpediente() == numExpediente) {
					return a.getCalificaciones();
				}
			}
		}
		return null;
	}
	
	/**
	 * Devuelve un objeto de grupo con solo los alumnos que tengan todo aprobado
	 * 
	 * @return grupo El grupo con los alumnos con todo aprobado
	 */
	public Grupo consultarAlumnosConTodoAprobado() {
		Grupo grupo = new Grupo("aprobados", alumnos.length);
		for (Alumno alumno : alumnos) {
			// 'continue' indica un salto a la siguiente iteración dentro de un loop tanto 'for' como 'while'
			// y no devuelve nada
			if (alumno == null) continue;
			if (alumno.todoAprobado()) grupo.insertar(alumno);
		}
		return grupo;
	}
	
	/**
	 * Devuelve un objeto de grupo con solo los alumnos que tengan media mayor de 5
	 * 
	 * @return grupo El grupo con los alumnos con media mayor a 5
	 */
	public Grupo consultarAlumnosMediaMayor5() {
		Grupo grupo = new Grupo("MM5", alumnos.length);
		for (Alumno alumno : alumnos) {
			// 'continue' indica un salto a la siguiente iteración dentro de un loop tanto 'for' como 'while'
			// y no devuelve nada
			if (alumno == null) continue;
			if (alumno.obtenerMedia() > 5) grupo.insertar(alumno);
		}
		return grupo;
	}
}
