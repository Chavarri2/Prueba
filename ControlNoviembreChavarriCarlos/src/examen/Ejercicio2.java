package examen;

public class Ejercicio2 {

	public static void main(String[] args) {
		String p1,p2;
		p1=Leer.leerString("Introduce una palabra con mas de 8 letras");
		p2=Leer.leerString("Introduce otra palabra con mas de 8 letras");
		System.out.println("");
		do{
			System.out.println("No has cumplido las intrucciones");
			p1=Leer.leerString("Introduce una palabra con mas de 8 letras");
			p2=Leer.leerString("Introduce otra palabra con mas de 8 letras");
		}while(validar(p1)&&validar(p2));
//		unirCadenas();
		
	}
/*	private static void unirCadenas(String p1, String p2) {
		char p3;
		for(int c = 0; c<p1.length();c++) {
			p3=p1.charAt(c);
		}
		
	}*/
	private static boolean validar(String p1) {
		String s="";
		String expReg="";
		expReg="[A-Za-z]{8,}";
		s=p1;
		return s.matches(expReg);
	}
	
	

}
