package ejercicios;

import ejemploClase.Leer;

/*
 * 20/11/2025
 * Miguel Chaves
 * Gestion TragaBolas
 */
public class GestionTragaBolas {

	public static void main(String[] args) {
		// Crear tragabolas y jugar
		TragaBolas t=null;
		int opcion=0;
		do {
			//Dibujar el menu

			System.out.println("Opciones");

			System.out.println("Opcion 0. Salir");

			if(t==null) {
				System.out.println("Opción 1. crear tragabolas ");
			}

			System.out.println("Opcion 2. Comer");

			System.out.println("Opcion 3. Trotar");

			System.out.println("Opcion 4. Dormir");

			System.out.println("Opcion 5. Mostrar");


			//Preguntar la opcion (Leer)

			opcion=Leer.leerEntero("Introduce una opcion");

			//Ejecutar la accion segun la opcion elegida (Switch)

			switch(opcion) {
			case 0: System.out.println("Adios");
			break;
			case 1: 
				if (t==null) {
					t=new TragaBolas(Leer.leerString("Introduce Color" ),Leer.leerEntero("Introduce Bolas Maximas "));
				}else {
					System.out.println("Tragabolas ya esta creado ");
				}
				break;
			case 2:
				if (t!=null) {
					t.comer();
				}else {
					System.out.println("Primero crea el tragabolas");
				}
				break;
			case 3:
				if (t!=null) {
					t.trotar();
				}else {
					System.out.println("Primero crea el tragabolas");
				}
				break;
			case 4:
				if (t!=null) {
					t.dormir();
				}else {
					System.out.println("Primero crea el tragabolas");
				}
				break;

			case 5:
				if (t!=null) {
					t.visualiza(); 
				}else {
					System.out.println("Primero crea el tragabolas");
				}
				break;
			default:
				System.out.println("Opcion error");
			}

		}while(opcion!=0);



	}
}
