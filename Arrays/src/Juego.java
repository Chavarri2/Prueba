import java.util.Scanner;

public class Juego {
/*Carlos Abraham Chavarri Valera
 * 14/11/2025
 * Juego*/
	public static void main(String[] args) {
		// definir
		String decicion;
		int miguel, juanjo, carlos, david;
		Scanner teclado=new Scanner(System.in);
		int ale=0, partidas=1, PAR=20;
		llenar(ale);
		System.out.println("Vamos a jugar!!!! ");
		
		do {
			for(int i=0;i<PAR;i++) {
				for(int j=0;j>4;j++) {
					if(j==ale) {
						if(ale==1) {
							miguel=+1;
						}if(ale==2) {
							juanjo=+1;
						}if(ale==3) {
							carlos=+1;
						}if(ale==4) {
							david=+1;
							
						}
					}
				}
			}
			System.out.println("");
			partidas++;
			System.out.println("Quieres jugar otra partida?");
			decicion=teclado.nextLine();
			if(decicion.equals("n")) {
				break;
			}
			
		}
		while (partidas<=20 && decicion.equals("s"));
		System.out.println("Fin de la pantida");
	}

	private static void llenar(int v) {
		for (int i = 0; i < 1; i++) {
			v=(int)(Math.random()*4+1);
		}
	}

}
