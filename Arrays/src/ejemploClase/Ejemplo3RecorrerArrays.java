package ejemploClase;
/*carlos abraham
 * 7/11/2025
 * recorre arrays*/
public class Ejemplo3RecorrerArrays {

	public static void main(String[] args) {
		// declarar y definir arrays
		String diasSemana[]= {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		// recorrer el array usando el indice
		for(int i=0;i<diasSemana.length;i++) {
			System.out.println("dia "+i+" "+diasSemana[i]);
		}
		//Usando un foreach
		for(String s:diasSemana) {
		System.out.println(s);
		
		}
		//¡Atencion! Si ponemos un indice mayor que la longutud o menor que 0 salta una excepcion
		System.out.println(diasSemana[8]);
	}

}
