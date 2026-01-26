package condicionalif;
/*
 * Carlos Abraham Chavarri Valera
 * 29/09/2025
 * 'programa para aprender a utilizar el operador ternario ?
 * programa que me dice si un numero es par, impar, positivo, negativo o cero
 */
public class CondicionalTernario {

	public static void main(String[] args) {
		//declaro variable
		int num1 = 0;
		String resultadoFinal="";
		//proceso
		resultadoFinal=(num1%2==0)?" es par":" es impar";
		resultadoFinal=resultadoFinal + ((num1>0)?" y es positivo":((num1==0)? " y es 0":" y es negativo"));
		//Salida de datos
		System.out.println("El numero: " +resultadoFinal);
		
		
	}

}
