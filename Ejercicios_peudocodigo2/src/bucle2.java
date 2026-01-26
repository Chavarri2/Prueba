import java.util.Scanner;

public class bucle2 {

	public static void main(String[] args) {
		// declaro variables
		int n, contar,contador;
		String i = "";
		contar=1;
		contador=1;
		Scanner teclado=new Scanner(System.in);
		//entrada de datos
		System.out.println("Introduce un numero");
		n= teclado.nextInt();
		while(contar<=n) {
			contar=contar+1;
			i=i+"* ";
		}
		//Proceso y salida
		for ( contador =1; contador <=n; contador++) {
			System.out.println(i);
		}
		System.out.println("_____________________________");
 		System.out.println("Fin del programa");
 		teclado.close();
	}

}
