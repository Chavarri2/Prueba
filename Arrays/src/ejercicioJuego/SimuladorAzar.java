package ejercicioJuego;

//import java.util.Random;

public class SimuladorAzar{
	
	//private int tiradasRegistradas=0;
	
	public int simularLanzamientos(int cantidad){
		int contadorSeises=0;
		for(int i=0;i < cantidad;i++){
			
			int r=(int)(Math.random()*6+1);
			//int resultado=r.nextInt(6)+ 1;
			//boolean esSeis=(resultado==6);
			
			if(r==6){
				contadorSeises++;
			}
		}
		return contadorSeises;
	}
}

