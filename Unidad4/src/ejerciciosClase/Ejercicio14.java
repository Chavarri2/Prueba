/*
 * Crea una método int lanzarDado() que simule el lanzamiento de un dado. Utilizala para
crear un programa que simula el lanzamiento de un dado 1000 veces y cuente y muestre el
numero de veces que ha salido cada número.
Fecha: 29/10/2025
Nombre: Adrian Celestrin

 */



package ejerciciosClase;

public class Ejercicio14 {

	public static void main(String[] args) {
		int contador1=0;
		int contador2=0;
		int contador3=0;
		int contador4=0;
		int contador5=0;
		int contador6=0;
		for(int i=1;i<=100;i++) {
			int numeroLanzado=lanzarDado();
			switch(numeroLanzado) {
			case 1:
				contador1++;
			    break;
			case 2:
				contador2++;
				break;
				
			case 3:
				contador3++;
				break;
				
			case 4:
				contador4++;
				break;
				
			case 5:
				contador5++;
				break;
				
			case 6:
				contador6++;
				break;
				
		}
		
		}
		
		System.out.println("El numero 1 ha salido: "+contador1+ " veces");
		System.out.println("El numero 2 ha salido: "+contador2+ " veces");
		System.out.println("El numero 3 ha salido: "+contador3+ " veces");
		System.out.println("El numero 4 ha salido: "+contador4+ " veces");
		System.out.println("El numero 5 ha salido: "+contador5+ " veces");
		System.out.println("El numero 6 ha salido: "+contador6+ " veces");
		
		int frecuenciaMaxima=contador1;
		int numeroMasRepetido=1;
		if(contador2>=frecuenciaMaxima) {
			frecuenciaMaxima=contador2;
			numeroMasRepetido=2;
		}
		
		if(contador3>=frecuenciaMaxima) {
			frecuenciaMaxima=contador3;
			numeroMasRepetido=3;
			
		}
		
		if(contador4>=frecuenciaMaxima) {
			frecuenciaMaxima=contador4;
			numeroMasRepetido=4;
		}
		
		if(contador5>=frecuenciaMaxima) {
			frecuenciaMaxima=contador5;
			numeroMasRepetido=5;
		}
		
		if(contador6>=frecuenciaMaxima) {
			frecuenciaMaxima=contador6;
			numeroMasRepetido=6;
		}
		
		System.out.println("El numero que mas ha salido es: "+ numeroMasRepetido+" que ha salido "+ frecuenciaMaxima+" veces");

	}
	
	public static int lanzarDado() {
		return (int) (Math.random()*6+1);
	}

}
