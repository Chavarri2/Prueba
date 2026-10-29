package ejercicios;
/*
 * Christian Lazaro Manzueta
 * 17/11/2005
 * Desarrollar un programa en Java que utilice una clase que se llame Indicador que sea la 
representación de un indicador de la vida real (indicadores de nivel, de velocidad, tacómetros, 
etc). La clase deberá tener los atributos valorMinimo, valorMaximo, valorActual, unidades y 
nombre del indicador. En el momento de la creación de cada objeto se asignarán todos los 
elementos salvo el valorActual. Entre los métodos que se programarán deberán estar el de 
asignación del valorActual, imprimir el valor, imprimir el indicador e incrementar y disminuir el 
valorActual con el que cuentan. En ese programa (el principal), crearás un elemento indicador 
y un menú con las opciones para ver el indicador, ver el valor actual, aumentar y disminuir el 
indicador.
 */

public class Indicador {

	//Definir atributos
	private double valorMinimo;
	private double valorMaximo;
	private double valorActual;
	private String unidades;
	private String nombre;
	
	//Constructor
	//no pasamos el valorActual porque no lo pide el enunciado
	//por defecto al ser un double tendria valor = 0
	public Indicador(String nombre, double valorMinimo, double valorMaximo, String unidades) {
		this.nombre = nombre;
		this.valorMinimo = valorMinimo;
		this.valorMaximo = valorMaximo;
		this.unidades = unidades;
		//podemos dar por defecto un valor a valorActual
		this.valorActual = valorMinimo;
	}
	
	public double getValorMinimo() {
		return valorMinimo;
	}

	public double getValorMaximo() {
		return valorMaximo;
	}

	public double getValorActual() {
		return valorActual;
	}

	public void setValorActual(double valorActual) {
		this.valorActual = valorActual;
	}

	public String getUnidades() {
		return unidades;
	}

	public String getNombre() {
		return nombre;
	}

	//metodo setter para asignar el valorActual
	public void asignarValorActual(double valorActual) {
		this.valorActual = valorActual;
	}
	
	//metodo que incrementa el valorActual
	public void aumenta() {
		if (valorActual < valorMaximo) {
			valorActual++;
		}
	}
	
	//metodo que disminuye el valorActual
	public void disminuye() {
		if (valorActual > valorMinimo) {
			valorActual--;
		}
	}
	
	public String toString() {
		
		return "Nombre: " + this.nombre + " Unidades: " + this.unidades + 
				" vMaximo: " + this.valorMaximo + " vMinimo: " + this.valorMinimo + 
				" vActual " + this.valorActual;
	}
	
}
