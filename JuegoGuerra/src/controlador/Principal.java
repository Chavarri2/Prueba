
package controlador;

import excepciones.EdadException;
import excepciones.NombreException;
import modelo.User;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0 5/2/2026
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User carlos;
		try {
			carlos=new User("Carlos",20);
			System.out.println("Into Try");
		} catch (NombreException e) {
			System.out.println("Mal nombre");
		} catch (EdadException e) {
			System.out.println("Mal edad");
		}
		System.out.println("Fin ");
	}

}
