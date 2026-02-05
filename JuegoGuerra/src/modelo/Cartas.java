
package modelo;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0 5/2/2026
 */
public class Cartas {
	//Atributo
	private int numero;
	private String palo;

	/**
	 * @param numero
	 * @param palo
	 * @param tipo
	 */
	public Cartas(int numero, String palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}
	
	
	@Override
	public String toString() {
		return "Cartas [numero=" + numero + ", palo=" + palo + "]";
	}
	
}
