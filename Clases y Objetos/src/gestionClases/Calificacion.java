package gestionClases;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0_27-11-2025
 * Esta clase representa las calificaciones de un alumno
 * 
 * Mejoras
 * La nota este entre 0 y 10
 * El modulo pertece a una lista*/
public class Calificacion {
	/** nombre del modulo*/
	private String modulo;
	/** Nota en el modulo*/
	private double calificacion;
	/**
	 * @param modulo
	 * @param calificacion
	 */
	public Calificacion(String modulo, double calificacion) {
		this.modulo = modulo;
		this.calificacion = calificacion;
	}
	/**
	 * @return the modulo
	 */
	public String getModulo() {
		return modulo;
	}
	/**
	 * @param modulo the modulo to set
	 */
	public void setModulo(String modulo) {
		this.modulo = modulo;
	}
	/**
	 * @return the calificacion
	 */
	public double getCalificacion() {
		return calificacion;
	}
	/**
	 * @param calificacion the calificacion to set
	 */
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	/** Metodo para visualizar los atributos de la calificacion*/
	@Override
	public String toString() {
		return "Calificacion [modulo=" + modulo + ", calificacion=" + calificacion + "]";
	}
}