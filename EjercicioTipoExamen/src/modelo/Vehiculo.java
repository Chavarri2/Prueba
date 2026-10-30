package modelo;

public class Vehiculo {

	private String marca;
	private String tipo;
	private String provincia;
	private String matricula;
	private double km;
	public Vehiculo(String marca, String tipo, String provincia, String matricula, double km) {
		this.marca = marca;
		this.tipo = tipo;
		this.provincia = provincia;
		this.matricula = matricula;
		this.km = km;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getVehiculo() {
		return tipo;
	}
	public void setVehiculo(String vehiculo) {
		this.tipo = vehiculo;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getKm() {
		return km;
	}
	public void setKm(double km) {
		this.km = km;
	}
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", vehiculo=" + tipo + ", provincia=" + provincia + ", matricula="
				+ matricula + ", km=" + km + "]";
	}
	
}
