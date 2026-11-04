/*
 * Fecha: 17/11/2025
 * Nombre: Adrian Celestrin
 * Metodo main para crear objetos de la clase Persona y ver sus propiedades
 */
package ejemploClase;

public class Main2Persona {

	public static void main(String[] args) {
		//Declarar personas
		Persona p1=new Persona("Adrian",22,"Zaragoza");
		Persona p2=new Persona("Sara",19,"Madrid");
				
		p1.presentar();
		p2.presentar();
		p1.cumplirAnyos();
		
		
		p1.presentar();
		
		//Podemos acceder a los atributos del objeto directamente si no lo hemos definido privados
		//p1.edad=66;
		//Si definimos los atributos como privados no podemos acceder a ellos
		p1.presentar();
		//Esta forma de acceder a los atributos de un objeto va en contra de la POO
		System.out.println(p1.getCiudad());
		p1.setCiudad("Cuenca");
		p1.presentar();
		
		p1.setEdad(44);
		p1.presentar();
		System.out.println(p1);

	}

}