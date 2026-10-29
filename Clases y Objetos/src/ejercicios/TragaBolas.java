package ejercicios;
/*
 * 20/11/2025
 * Miguel Chaves
 * Clase Tragabolas
 */
public class TragaBolas {

	//Atributos
	
	private String color; 
	private int bolasComidas;
	private int maxBolas;
	
	
	//Metodo/s constructor
	
	public TragaBolas(String color, int maxBolas) {
		this.color=color;
		this.maxBolas=maxBolas;
		this.bolasComidas=0;
	}
	
	//Metodo que visualiza el tragabolas
	
	public void visualiza() {
		
		System.out.println("Color" + this.color + "maxBolas " + this.maxBolas + "bolasComidas " + this.bolasComidas);
		
	}
	
	//Metodo comer
	
	public void comer() {
		if(bolasComidas<maxBolas) {
			bolasComidas++;
			System.out.println("Ñam Ñam");
		}else {
			System.out.println("No puedo mas");
		}
	}
	
	//Metodo trotar
	
	public void trotar() {
		if(bolasComidas>=1) {
			bolasComidas--;
			System.out.println("A correr!, estoy trotando por cierto");	
		}else {
			System.out.println("No tengo energia pa' correr");
		}
	}
	
	//Metodo dormir
	
	public void dormir() {
		if(bolasComidas==maxBolas) {
			System.out.println("ZZZZZ");
			bolasComidas=bolasComidas/2;
		}else {
			System.out.println("No tengo sueño");
		}
			
	}
	
}
