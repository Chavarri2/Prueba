package examen;
/*C.A Chavarri Valera
 * 05/12/2025
 * Clase que Adivina contraseña*/
/**
 * @author Carlos Abraham chavarri Valera
 * @version 1.0_05/12/2025
 * Clase que adivina contraseña
 */
public class AdivinaPassword {
	
	public static void main(String[] args) {
		final String CONTRASEÑAFINAL="NEKO";// Constante String
		
		
		String combinacion;
		int contador=0, media=0;
		boolean cierto=false;
		
		for (int i = 1; i <= 10; i++) {
			while(cierto==false){
				combinacion=generarLetras();
				cierto=siNo(combinacion, CONTRASEÑAFINAL);
				contador++;
				System.out.println("intento "+contador+" "+ combinacion);
			}
			cierto=false;
			media=media+contador;
		}
		System.out.println("Contraseña: "+CONTRASEÑAFINAL+" Adivinada en "+contador +" intentos");
		System.out.println("La media de intentos es de "+((float)media/10));
	}
	/**
	 * 
	 * @return combinacion de 4 letras aleatorias
	 */
	public static String generarLetras() {
		String regExp="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
		String combinacion="";
		for (int i = 0; i <=3; i++) {
			combinacion=combinacion+regExp.charAt((int) (Math.random() * regExp.length()));
		}
		return combinacion;
	}
	/**
	 * 
	 * @param combinacion 4 letras aleatorias de la A-Z 
	 * @param contraseña 4 letras
	 * @return es cierto si la combinacion es igual a la contraseña
	 */
	public static boolean siNo(String combinacion, String contraseña) {
		boolean cierto;
		
		if (combinacion.equals(contraseña)) {
			cierto=true;
		}else {
			cierto=false;
		}
		return cierto;
	}
}
