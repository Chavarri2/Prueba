
package modelo;

import excepciones.EdadException;
import excepciones.NombreException;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0 5/2/2026
 */
public class User {
	/**
	 * Atributos
	 */
	private String nombre;
	private int edad;
	private String expReg="^[A-Za-zÁÉÍÓÚáéíóúÑñ ]+";
	/**
	 * @param nombre
	 * @param edad
	 */
	public User(String nombre, int edad) throws NombreException, EdadException {
		this.nombre = nombre;
		this.edad = edad;
		if(!nombre.matches(expReg)) {
			throw new NombreException("El nombre solo puede contener letras");
		}
		if(edad <= 4) {
			throw new EdadException("El valor elegido para la edad esta fuera de los parametro \npruebe de nuevo");			
		}
		
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "User [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
}
