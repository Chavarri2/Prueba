package gestionClases;

import java.util.Arrays;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0_27-11-2025 Clase para representar la entidad alumno
 */
public class Alumno {
	/** nombre y appellido del alumno */
	private String nombreApellidos;
	/** numero de expendiente del alumno */
	private int numeroExpediente;
	/** vector de calificaciones */
	private Calificacion[] calificaciones;

	/**
	 * @param nombreApellidos
	 * @param numeroExpediente
	 * @param calificaciones
	 */
	public Alumno(String nombreApellidos, int numeroExpediente) {
		this.nombreApellidos = nombreApellidos;
		this.numeroExpediente = numeroExpediente;
		this.calificaciones = new Calificacion[6];// He creado un array de 6 calificaciones que son nulas
	}

	/**
	 * 
	 * @param c-> Calificacion a insertar
	 * @return Es booleano si la calificacion ha sido insertada correctamente
	 */
	public boolean insertar(Calificacion c) {
		for (int i = 0; i < calificaciones.length; i++) {
			// si al recorrer los modulos de calificaciones ya hay un modulo
			// entonces haqy un modulo con el mismo nombre
			if (calificaciones[i] == null) {
				calificaciones[i] = c;
				return true;
			} else if (calificaciones[i].getModulo().equals(c.getModulo())) {
				return false;
			}
		}
		return false;
	}

	/**
	 * 
	 * @return mejor calificacion del alumno
	 */
	public Calificacion consultarMejorNota() {
		Calificacion mejorNota = calificaciones[0];
		for (int i = 0; i < calificaciones.length; i++) {
			if (calificaciones[i] != null) {
				if (calificaciones[i].getCalificacion() > mejorNota.getCalificacion()) {
					mejorNota = calificaciones[i];
				}
			}
		}
		return mejorNota;

	}

	/**
	 * 
	 * @param modulo string con la asignatura que quiero buscar la nota
	 * @return calificacion de materia buscada o -1 si no se encuentra la materia
	 */
	public double consultarCalificacion(String modulo) {
		for (Calificacion c : calificaciones) {
			if (c.getModulo().equals(modulo)) {
				return c.getCalificacion();
			}
		}
		return -1; // si llegamos es que modulo no se encuentra en calificaciones
	}

	/**
	 * 
	 * @param nuevaCalificacion objeto Calificacion con nueva calificacion
	 * @return true si calificacion ha sido actualizada
	 */
	public boolean modificarCalificacion(Calificacion nuevaCalificacion) {
		for (Calificacion c : calificaciones) {
			if (c != null) {
				if (c.getModulo().equals(nuevaCalificacion.getModulo())) {
					c.setCalificacion(nuevaCalificacion.getCalificacion());
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * 
	 * @param modulo asignatura que quieres modificar su nota
	 * @param nota   double con nota que quieres sustituir
	 * @return true si has modificado nota con exito
	 */
	public boolean modificarCalificacion(String modulo, double nota) {
		for (Calificacion c : calificaciones) {
			if (c != null) {
				if (c.getModulo().equals(modulo)) {
					c.setCalificacion(nota);
					return true;
				}
			}
		}
		return false;
	}
/**
 * 
 * @return true si todas las notas son mayores o iguales a 5
 */
	public boolean todoAprobado() {
		for (Calificacion c : calificaciones) {
			if (c != null) {
				if (c.getCalificacion() < 5) {
					return false;
				}
			}
		}
		return true;
	}
	/**
	 * 
	 * @return media de notas
	 */
	public double obtenerMedia() {
		//numero de notas
		int contador = 0;
		//suma de notas
		double suma = 0;
		for(Calificacion c: calificaciones) {
			if(c!=null) {
				contador++;
				suma = suma + c.getCalificacion();
			}
		}
	return suma/contador;
	}
	/**
	 * @return the nombreApellidos
	 */
	public String getNombreApellidos() {
		return nombreApellidos;
	}

	/**
	 * @param nombreApellidos the nombreApellidos to set
	 */
	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}

	/**
	 * @return the numeroExpediente
	 */
	public int getNumeroExpediente() {
		return numeroExpediente;
	}

	/**
	 * @param numeroExpediente the numeroExpediente to set
	 */
	public void setNumeroExpediente(int numeroExpediente) {
		this.numeroExpediente = numeroExpediente;
	}

	/**
	 * @return the calificaciones
	 */
	public Calificacion[] getCalificaciones() {
		return calificaciones;
	}

	/**
	 * @param calificaciones the calificaciones to set
	 */
	public void setCalificaciones(Calificacion[] calificaciones) {
		this.calificaciones = calificaciones;
	}

	@Override
	public String toString() {
		return "Alumno [nombreApellidos=" + nombreApellidos + ", numeroExpediente=" + numeroExpediente
				+ ", calificaciones=" + Arrays.toString(calificaciones) + "]";
	}

}
