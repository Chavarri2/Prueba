package ejercicio1;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 24/11/2026
 * Una clase para llevar la cuenta de por qué página vas de un libro
 */
public class Libro {
	private String titulo;
	private String autor;
	private int numeroPaginas;
	private int paginaActual;
	
	public Libro(String titulo, String autor, int paginaActual, int numeroPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.paginaActual = paginaActual;
	}
	
	public void leer(int paginasLeidas) {
		paginasLeidas+=paginaActual;
		if(paginasLeidas<=numeroPaginas && paginasLeidas>0 && paginaActual<=numeroPaginas) {
			paginaActual=paginasLeidas;
		}else {
			System.out.println("Error: el valor introducido no es valido");
		}
	}
	
	public boolean estaTerminado() {
		if(paginaActual==numeroPaginas) {
			return true;
		}else {
			return false;
		}
	}
	
	public void mostrarInformacion() {
		System.out.println("Titulo del libro: "+titulo+"\n"
				+ "Autor del libro: "+autor+"\n"
						+ "Pagina "+paginaActual+" de "+numeroPaginas);
	}
}
