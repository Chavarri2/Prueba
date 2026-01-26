package examen;
/* C.A Chavarri Valera
 * 05/12/2025
 * Clase estanteria que sirve para saber si colocar o no libro*/
public class Estanteria {
	//Atributos
	private static double valorLibro=6.90;
	private String nombreEstanteria;
	private static int numeroEstanterias=0;
	private int numeroBaldas;
	private int librosPorBalda;
	private boolean[][] mapaOcupacion;
	private String categoria;
	/**
	 * @param numeroBaldas
	 * @param librosPorBalda
	 * @param categoria
	 */
	public Estanteria(int numeroBaldas, int librosPorBalda, String categoria) {
		super();
		this.numeroBaldas = numeroBaldas;
		this.librosPorBalda = librosPorBalda;
		this.categoria = categoria;
		this.mapaOcupacion=new boolean [numeroBaldas][librosPorBalda];
		for (int i = 0; i < mapaOcupacion.length; i++) {
			for (int j = 0; j < mapaOcupacion.length; j++) {
				mapaOcupacion[i][j]=false;
			}
		}
		numeroEstanterias++; //Aumenta en una unidad cada vez que se genera un objeto
		this.nombreEstanteria="estanteria"+numeroEstanterias;// Los nombre se crean automaticamente aumentando en una unidad cada vez que se genere un objeto
	}
	
	public boolean colocarlibro(int balda, int posicion) {
		boolean siNo=true;
		if(mapaOcupacion[balda][posicion]==false) {
			siNo=true;
			mapaOcupacion[balda][posicion]=true;
		}else if(mapaOcupacion[balda][posicion]==true) {
			siNo=false;
		}
		
		return siNo;
	}
	
	public double calcularValorInventartio() {
		double valorTotal=0;
		for (int i = 0; i < mapaOcupacion.length; i++) {
			for (int j = 0; j < mapaOcupacion.length; j++) {
				if(mapaOcupacion[i][j]==true) {
					valorTotal=valorTotal+valorLibro;
				}
			}
		}
		return valorTotal;
	}
	
	public void reiniciarOcupacion() {
		for (int i = 0; i < mapaOcupacion.length; i++) {
			for (int j = 0; j < mapaOcupacion.length; j++) {
				mapaOcupacion[i][j]=false;
			}
		}
	}
	
	public void mostrarOcupacion() {
		for (int i = 0; i < mapaOcupacion.length; i++) {
			for (int j = 0; j < mapaOcupacion[i].length; j++) {
				if(mapaOcupacion[i][j]==true) {
					System.out.print(" L");
				}else if(mapaOcupacion[i][j]==false){
					System.out.print(" -");
				}
			}
			System.out.println();
		}
	}
	
	/**
	 * @return the nombreEstanteria
	 */
	public String getNombreEstanteria() {
		return nombreEstanteria;
	}
	/**
	 * @return the mapaOcupacion
	 */
	public boolean[][] getMapaOcupacion() {
		return mapaOcupacion;
	}
	/**
	 * @param mapaOcupacion the mapaOcupacion to set
	 */
	public void setMapaOcupacion(boolean[][] mapaOcupacion) {
		this.mapaOcupacion = mapaOcupacion;
	}
	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}
	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Estanteria [nombreEstanteria=" + nombreEstanteria + ", numeroBaldas=" + numeroBaldas
				+ ", librosPorBalda=" + librosPorBalda + ", categoria=" + categoria + "]";
	}
	
}
