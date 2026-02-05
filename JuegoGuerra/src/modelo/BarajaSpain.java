
package modelo;

import java.util.ArrayList;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0 5/2/2026
 */
public class BarajaSpain extends Cartas {
	//Atributos
	private ArrayList<Cartas> mazo;

	/**
	 * @param numero
	 * @param palo
	 * @param mazo
	 */
	public BarajaSpain(int numero, String palo, ArrayList<Cartas> mazo) {
		super(numero, palo);
		this.mazo = mazo;
	}
	
}
