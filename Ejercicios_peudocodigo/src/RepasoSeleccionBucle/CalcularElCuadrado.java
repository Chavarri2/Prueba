package RepasoSeleccionBucle;

public class CalcularElCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero,var1;
		numero=0;
		while (numero <9){
			numero=numero+1;
			var1=(int) Math.pow(numero, 2);
			System.out.println("El cuadrado de "+ numero +" es: "+ var1);
		}
		System.out.println("El programa ha terminado");
	}

}
