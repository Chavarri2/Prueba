package examenResuelto;

/**
 * Clase para representar un punto cardinal
 * 
 * @author Abderrahman Labiod
 * @version 1.0_26-11-25
 */
public class Punto {

	/**
	 * Coordenada X de nuestro punto
	 */
	private int x;
	
	/**
	 * Coordenada Y de nuestro punto
	 */
	private int y;
	
	/**
	 * Constructor sin parámetros de Punto
	 * 
	 * Valores X: 0 Y: 0
	 */
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Constructor con los parámetros iniciales de X e Y
	 * @param x - Parámetro X de nuestro constructor
	 * @param y - Parámetro Y de nuestro constructor
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * @return El valor X
	 */
	public int getX() {
		return x;
	}

	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}

	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Incrementa nuestro valor de X en una cantidad determinada
	 * @param cantidad - La cantidad que se quiere aumentar a X
	 */
	public void moverX(int cantidad) {
		this.x += cantidad;
	}
	
	/**
	 * Incrementa nuestro valor de Y en una cantidad determinada
	 * @param cantidad - La cantidad que se quiere aumentar a Y
	 */
	public void moverY(int cantidad) {
		this.y += cantidad;
	}

	/**
	 * Método para visualizar los atributos de nuestro objeto en una String
	 */
	@Override
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
	
	
	/**
	 * Comprueba si 2 puntos son iguales en coordenadas
	 * @param p1 - Punto 1 a comparar
	 * @param p2 - Punto 2 a comparar
	 * @return Si el p1 o p2 se encuentran en la misma posición
	 */
	public static boolean coinciden(Punto p1, Punto p2) {
		return p1.getX() == p2.getX() && p1.getY() == p2.getY();
	}
	
}
