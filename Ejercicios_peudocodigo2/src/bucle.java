import java.util.Scanner;

public class bucle {

	public static void main(String[] args) {
		// declaro variables
		int n, contar;
		String i = "*";
		contar=5;
		Scanner teclado=new Scanner(System.in);
		//entrada de datos
		System.out.println("Introduce un numero");
		n= teclado.nextInt();
		//Proceso y salida
		for ( contar =1; contar <=n; contar++) {
			System.out.println(i);
			i=i+"*";			
		}
		System.out.println("_____________________________");
		System.out.println("Fin del programa");
		teclado.close();
	}

}
