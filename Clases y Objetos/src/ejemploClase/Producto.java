package ejemploClase;
/** Clase producto que usaremos como ejemplo para explicar atributos
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0_27-11-2025*/
public class Producto {
	/**
	 * nombre almacena el nombre del producto
	 * */
	private String nombre;
	/**
	 * almacena el precio en euros
	 * */
	private double precioEuros;
	/**
	 * almacena el cambio de euro a dolar*/
	private static double cambioEurosDolar=1.16;
	/**atributo estatico que lleva la cuenta de productos creados*/
	private static int numeroInstancias=0;
	/**Atributo que identifica el producto*/
	private int idProducto;
	/**
	 * @param nombre -> nombre del producto
	 * @param precioEuros -> del producto*/
	public Producto(String nombre, double precioEuros) {
		this.nombre = nombre;
		this.precioEuros = precioEuros;
		numeroInstancias++;//aumentamos en uno el numero de instancias
		this.idProducto=numeroInstancias;
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
	 * @return the precioEuros
	 */
	public double getPrecioEuros() {
		return precioEuros;
	}
	/**
	 * @param precioEuros the precioEuros to set
	 */
	public void setPrecioEuros(double precioEuros) {
		this.precioEuros = precioEuros;
	}
	/**
	 * @return the cambioEurosDolar
	 */
	public double getCambioEurosDolar() {
		return cambioEurosDolar;
	}
	/**
	 * @param cambioEurosDolar the cambioEurosDolar to set
	 */
	public static void setCambioEurosDolar(double valorNuevo) {
		cambioEurosDolar = valorNuevo;
	}
	/**
	 * @return devuelve el precio del producto en dolares*/
	public double getPrecioDolares() {
		return precioEuros*cambioEurosDolar;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio en euros=" + precioEuros + ", precio en Dolares=" + 
				getPrecioDolares()+ ", id del producto "+idProducto+" ,numero de instancias= "+numeroInstancias+ "]";
	}
	
}
