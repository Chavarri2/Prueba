package examen;

import java.util.Scanner;

public class GestionBiblioteca {

	public static void main(String[] args) {
		int opcion=0, balda, posicion;
		Estanteria ficcion=new Estanteria(4,8,"Ficcion");
		Estanteria ciencias=new Estanteria(4,8,"ciencias");
		Estanteria infantil=new Estanteria(4,8,"infantil");
	
		Estanteria[] estan=new Estanteria[3];
		estan[0]=ficcion;
		estan[1]=ciencias;
		estan[2]=infantil;
		
		Biblioteca num1=new Biblioteca("manolo",estan);
		
		// Crear un objeto de la clase Scanner
		Scanner teclado=new Scanner(System.in);
				
		// Bucle do while para el menu
		do {
			// Opciones del menu
			System.out.println("0.-Salir"+"\n1.-Colocar libro");
			opcion=teclado.nextInt();
			System.out.println();
					
			// Menu con switch
			switch(opcion) {
			case 0:
				System.out.println("Has elegido salir"+"\nFin del programa");
				break;
			case 1:
				System.out.println(num1.mostrarEstanterias());
				System.out.println("Elige en que estanteria quieres poner el libro (número)");
				opcion=teclado.nextInt();
				estan[opcion-1].mostrarOcupacion();
				System.out.println("Dime la balda");
				balda=teclado.nextInt();
				System.out.println("Dime la posición");
				posicion=teclado.nextInt();
				if (estan[opcion-1].colocarlibro(balda, posicion)) {
					System.out.println("Libro colocado correctamente");
				} else {
					System.out.println("Error Damn");
				}
				break;
			default:
				System.out.println("La opcion elegida no es valida");
				break;
					}
				}while(opcion!=0);
				
				
				
		// Cierre del teclado para que no siga consumiendo recursos
		teclado.close();

	}

}
