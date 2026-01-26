package ejemploClase;

import java.util.Arrays;

/*Carlos Abraham Chavarri Valera
 * 7/11/2025
 * Ejemplo array*/
public class Ejemplo1Definir {

	public static void main(String[] args) {
		// Declarar un array
		//tipoDato[] (int,long,...) identificador[];
		// String dias[];
		//crear el array
		//identificadores = new tipoDato[dimencion];
		//dimension e.j: 7
		// dias = new String[7];
		//se puede definir tambien
		//String dias[] = new String[7];
		//definimos por enumeracion, esto tambien define la dimension del array
		int datos[] = {3,6,2,7,4,1,0,5};
		//Para acceder a un dato se hace a traves del inice (index) de cada valor,
		//comenzando por el 0, sindo el maximo valor para el indice la cantidad de valores menos 1
		//E.j:tenemos 8 elementos en un array, el ultimo indice para acceder seria 7(datos[7])
		System.out.println(datos[0]);
		System.out.println(datos[7]);
		datos[0]=100; //Asignamos el valor en el indice a 0 con el numero 100
		System.out.println(datos[0]);
		//imprimir el array
		//simplemente, nos imprimira un identificador y no los contenidos
		System.out.println(datos);
		System.out.println(Arrays.toString(datos));
	}

}
