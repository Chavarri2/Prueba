package ejemplos;
import java.util.Scanner;

public class bucle3 {

	public static void main(String[] args) {
	// declaro variables
	int n, contar,contador,p,e;
	String i = "";
	contar=1;
	contador=1;
	Scanner teclado=new Scanner(System.in);
	//entrada de datos
	System.out.println("Introduce un numero de * ");
	n= teclado.nextInt();
	System.out.println("Introduce un numero de lineas ");
	e= teclado.nextInt();
	e=e-1;
	p=n-e;
	while(contar<=n) {
		contar=contar+1;
		i=i+"* ";
	}
	//Proceso y salida
	for ( contador =p; contador <=n; contador ++) {
		System.out.println(i);
	}
	System.out.println("_____________________________");
 	System.out.println("Fin del programa");
	teclado.close();	
	}

}
