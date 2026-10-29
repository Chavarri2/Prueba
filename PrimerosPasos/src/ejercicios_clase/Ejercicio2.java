package ejercicios_clase;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 19/10/2026
 * Programa que muestra por consola la tabla de multiplicar hasta el 6
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		/**Ejercicio realizado por Carlos
		Inizializamos variables
		int contador=0,valor=1;
		para cada numero i=1 hasta 6 a i se le suma uno
		for (int i = 1; i <= 6; i++) {
			Para cada numero j=1 hasta contador j se le suma uno
			for (int j = 1; j <= contador; j++) {
				muestra por pantalla un asterisco
				System.out.print("* ");
			}
			Para cada j=valor hasta 6 j mas uno
			for (int j = valor; j <= 6; j++) {
				se multiplica i por j y se le agrega un espacio a la
				derecha
				System.out.print(i*j + " ");
			}
			aumentamos el valor de las variables
			valor++;
			contador++;
			Salto de linea
			System.out.println();
		}
		*/
		//Solicion Ejercicio bucles anidados
		for (int i = 1; i <= 6; i++) {
		    for (int j = 1; j <= 6; j++) {
		    	//Si j es menor que i entonces muesta por pantalla un punto
		        if (j < i) {
		            System.out.print("*\t");
		            //sino multiplica i*j 
		        } else {
		            System.out.print((i * j) + "\t");
		        }
		    }
		    //Salto de linea
		    System.out.println();
		}
	}

}
