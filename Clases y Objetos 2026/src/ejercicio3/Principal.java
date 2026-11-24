package ejercicio3;

public class Principal {

	public static void main(String[] args) {
		Rectangulo folio= new Rectangulo(21, 29.7);
		Rectangulo baldosa=new Rectangulo(30);
		System.out.println(folio.area());
		System.out.println(folio.perimetro());
		System.out.println(baldosa.area());
		System.out.println(baldosa.perimetro());
		baldosa.mostrar();
		folio.mostrar();
		folio.escalarse(2);
		folio.mostrar();
	}

}
