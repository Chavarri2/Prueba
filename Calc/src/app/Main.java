package app;
import modelo.ModeloCalculadora;
import vista.Vista;

public class Main {

	public static void main(String[] args) {
		ModeloCalculadora calculo=new ModeloCalculadora();
		Vista nvista=new Vista(calculo);
		nvista.setVisible(true);

	}

}
