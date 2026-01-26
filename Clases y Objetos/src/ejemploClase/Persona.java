/*
 * Fecha: 17/11/2025
 * Nombre: Adrián Celestrín
 */

package ejemploClase;
//Ejemplo creacion de la clase Persona
public class Persona {
	//Definimos los atributos
	private String nombre;
	private int edad;
	private String ciudad;
	//Metodo constructor. Utilizaremos para instanciar objetos de la clase Persona
	
	public Persona(String n,int e,String c) {
		this.nombre=n;
		this.edad=e;
		this.ciudad=c;
	}
	
	//Metodo presentar. El objeto Persona escribirá su nombre,edad y ciudad
	
	public void presentar() {
		System.out.println("Hola me llamo: "+ this.nombre+" y tengo: "+ this.edad+" años y vivo en "+ this.ciudad);
	}
	
	//Metodo cumplir años
	public void cumplirAnyos() {
		this.edad++;
		
	}
	//Metodos getter. Me permiten ver el valor de un atributo. Colocaremos 1 por cada atributo
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public String getCiudad() {
		return this.ciudad;
	}
	
	//Metodos setter. Nos permiten cambiar el valor de un atributo
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad=ciudad;
	}
	
	//Metodo toString
	public String toString() {
		return "Nombre: "+this.nombre+" Edad: "+ this.edad+" Ciudad: "+ this.ciudad;
	}
	
	

	

}