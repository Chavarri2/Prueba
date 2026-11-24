/*
 * Fecha: 17/11/2025
 * Nombre: Adrian Celestrin
 * Metodo main para crear objetos de la clase Persona y ver sus propiedades
 */

package ejemploClase;

public class MainPersona {

	public static void main(String[] args) {
		//Declarar personas
		Persona p1=new Persona("Adrian",22,"Zaragoza");
		Persona p2=new Persona("Sara",19,"Madrid");
		
		p1.presentar();
		p2.presentar();
		//Definir un array de Personas
		Persona [] listaClase=new Persona[2];
		//Instancio todos los objetos del Array pidiendo los datos con la clase Leer
		for(int i=0;i<listaClase.length;i++) {
			listaClase[i]=new Persona(Leer.leerString("Introduce el nombre"),Leer.leerEntero("Introduce la edad: "),Leer.leerString("Introduce tu ciudad"));
		}
		
		//Imprimi los datos
		for(Persona p:listaClase) {
			p.presentar();
		}

	}

}