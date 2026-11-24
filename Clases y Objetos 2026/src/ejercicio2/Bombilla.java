package ejercicio2;

public class Bombilla {
	private boolean encendida;
	private int potencia;
	private int vecesEncedida;
	public Bombilla(boolean encendida, int potencia) {
		this.encendida = encendida;
		this.potencia = potencia;
	}
	
	public void encender() {
		encendida=true;
		vecesEncedida++;
	}
	
	public void apagar() {
		encendida=false;
	}
	
	public void pulsarInterruptor() {
		if(encendida==true) {
			encendida=false;
		}else {
			encendida=true;
			vecesEncedida++;
		}
	}
	
	public void mostrarEstado() {
		String estado;
		if(encendida==true) {
			estado="encendida";
		}else {
			estado="apagada";
		}
		System.out.println("Bombilla de "+potencia+" W: "+estado+" (encendida "+vecesEncedida+")");
	}
}
