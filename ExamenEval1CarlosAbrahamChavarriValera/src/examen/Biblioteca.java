package examen;
/* C.A Chavarri Valera
 * 05/12/2025
 * Clase biblioteca que sirve para crear biblioteca*/
public class Biblioteca {
	private String nombreBiblioteca;
	private static double valorMedioLibro=6.90;
	Estanteria[] estanterias;
	/**
	 * @param nombreBiblioteca
	 * @param estanterias
	 */
	public Biblioteca(String nombreBiblioteca, Estanteria[] estanterias) {
		super();
		this.nombreBiblioteca = nombreBiblioteca;
		this.estanterias = estanterias;
	}
	/**
	 * @return the nombreBiblioteca
	 */
	public String getNombreBiblioteca() {
		return nombreBiblioteca;
	}
	/**
	 * @param nombreBiblioteca the nombreBiblioteca to set
	 */
	public void setNombreBiblioteca(String nombreBiblioteca) {
		this.nombreBiblioteca = nombreBiblioteca;
	}
	/**
	 * @return the valorMedioLibro
	 */
	public static double getValorMedioLibro() {
		return valorMedioLibro;
	}
	/**
	 * @param valorMedioLibro the valorMedioLibro to set
	 */
	public static void setValorMedioLibro(double valorMedioLibro) {
		Biblioteca.valorMedioLibro = valorMedioLibro;
	}
	/**
	 * @return the estanterias
	 */
	public Estanteria[] getEstanterias() {
		return estanterias;
	}
	/**
	 * @param estanterias the estanterias to set
	 */
	public void setEstanterias(Estanteria[] estanterias) {
		this.estanterias = estanterias;
	}
	public String mostrarEstanterias() {
		String mostrar="";
		for (int i = 0; i < estanterias.length; i++) {
			mostrar=mostrar.concat(estanterias[i].getNombreEstanteria()+"-"+estanterias[i].getCategoria()+"\n");
		}
		
		return mostrar;
	}
}
