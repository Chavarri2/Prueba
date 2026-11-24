package ejercicio1;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 24/11/2026
 * Una clase para llevar la cuenta de por qué página vas de un libro
 */
public class Principal {

	public static void main(String[] args) {
		Libro libro1=new Libro("El Quijote", "Cervantes", 0, 1250);
		Libro libro2=new Libro("Etereo", "Joana Marcus", 300, 528);
		System.out.println(libro1.estaTerminado());
		libro1.mostrarInformacion();
		libro2.mostrarInformacion();
		libro2.leer(200);
		libro2.mostrarInformacion();
		libro2.leer(28);
		libro2.mostrarInformacion();
		System.out.println(libro2.estaTerminado());
		libro2.leer(6);
	}

}
