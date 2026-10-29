package ejercicios;

import ejemploClase.Leer;

public class MainIndicador {

	public static void main(String[] args) {
		
		Indicador velocimetro = new Indicador("velocimetro", 0, 200, "Km/h");
		int opcion = 0;
		
		do {
			
			//Escibir el menu
			System.out.println("Opciones: ");
			System.out.println("0: Salir.");
			System.out.println("1: Ver valor actual.");
			System.out.println("2: Aumentar valor actual.");
			System.out.println("3: Disminuir valor actual.");
			System.out.println("4: Ver indicador.");
			
			//Pedir la opcion
			opcion = Leer.leerEntero("Introduce la opción");
			
			//Ejecutar metodo según opcion elegida
			switch (opcion) {
			case 0: 
				System.out.println("Gracias por jugar!");
				break;
			case 1:
				System.out.println("El valor actual es: " + velocimetro.getValorActual() + " " + velocimetro.getUnidades());
				break;
			case 2:
				velocimetro.aumenta();
				break;
			case 3:
				velocimetro.disminuye();
				break;
			case 4:
				System.out.println(velocimetro);
				break;
			default:
				System.out.println("Elección erronea");
			}
			
		} while (opcion != 0);

	}

}
