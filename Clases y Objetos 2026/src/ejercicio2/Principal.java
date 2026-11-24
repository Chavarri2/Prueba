package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		Bombilla bombilla=new Bombilla(false, 60);
		
		bombilla.encender();
		bombilla.apagar();
		bombilla.pulsarInterruptor();
		bombilla.mostrarEstado();
	}

}
