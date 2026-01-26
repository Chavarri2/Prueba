package ejercicioJuego;

public class TragaBolas{
	//Atributos
	private int bolasComidas;
	private String color;
	private int maxBolas;
	//contructor
	public TragaBolas() {
		bolasComidas=this.bolasComidas;
		color=this.color;
		maxBolas=this.maxBolas;
	}
	public void comer (int bolasComidas) {
        if (bolasComidas <= maxBolas) {
            bolasComidas++;
            System.out.println("Ñam Ñam");
        } else {
            System.out.println("Estoy lleno.");
        }
    }
	public void correr(int bolasComidas) {
		if(bolasComidas>0) {
			bolasComidas--;
			System.out.println("ahs,ahs,ahs");
		}else {
			System.out.println("Tengo mucha hambre");
		}
	}
	public void dormir(int bolasComidas,int maxBolas) {
		if(bolasComidas==maxBolas) {
			bolasComidas--;
			System.out.println("zzzzzzz \nzzzzz \nzzz");
		}else {
			System.out.println("No tengo sueño, Mejor dame de comer");
		}
	}

	public int getBolasComidas() {
		return bolasComidas;
	}
	public void setBolasComidas(int bolasComidas) {
		this.bolasComidas = bolasComidas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxBolas() {
		return maxBolas;
	}
	public void setMaxBolas(int maxBolas) {
		this.maxBolas = maxBolas;
	}

	public String toString() {
	    return " | Color: " + color +
	           " | Bolas comidas: " + bolasComidas +
	           " | Máximo de bolas a comer: " + maxBolas+"\n";	
	    }
	
}