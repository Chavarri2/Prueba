package dibujo;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	private static HashMap<Integer, String> availableFigures = new HashMap<>();
	private static int figure;
	private static int size;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		availableFigures.put(0, "Rombo");
		availableFigures.put(1, "Marco");
		availableFigures.put(2, "Priamide Centrada");
		availableFigures.put(3, "Triangulo Derecha");
		availableFigures.put(4, "Triangulo Inverso");
		availableFigures.put(5, "Triangulo Rectángulo");
		Scanner sc = new Scanner(System.in);
		askFigure(sc);
		askSize(sc);
		drawFigure(figure);
	}
	
	private static void drawFigure(int figureId) {
		switch (figureId) {
			case 0:
				DibujaFiguras.Rombo(size);
				break;
			case 1:
				DibujaFiguras.Marco(size);
				break;
			case 2:
				DibujaFiguras.PiramideCentrada(size);
				break;
			case 3:	
				DibujaFiguras.TrianguloDcha(size);
				break;
			case 4:
				DibujaFiguras.TrianguloInv(size);
				break;
			case 5:
				DibujaFiguras.TrianguloRectangulo(size);
				break;
			default:
				println("Figura inexistente");
		}
	}
	
	private static void askFigure(Scanner sc) {
		println("-------- Firugas disponibles --------");
		for (Integer key : availableFigures.keySet()) {
			String name = availableFigures.get(key);
			println(key + " - " + name);
		}
		println("--------------------------------------");
		print("Introduce Nº figura: ");
		try {
			figure = Integer.parseInt(sc.nextLine());
			if (availableFigures.get(figure) == null) {
				println("FIGURA INVÁLIDA!");
				askFigure(sc);
				return;
			}
			println("Figura seleccionada: " + availableFigures.get(figure));
		} catch (Exception ex) {
			println("FIGURA INVÁLIDA!");
			askFigure(sc);
			return;
		}
	}
	
	private static void askSize(Scanner sc) {
		print("Introduce tamaño: ");
		try {
			size = Integer.parseInt(sc.nextLine());
			println("Tamaño seleccionado: " + size);
		} catch (Exception ex) {
			println("TAMAÑO INVÁLIDO!");
			askSize(sc);
			return;
		}
	}
	
	private static void print(String text) {
		System.out.print(text);
	}
	
	private static void println(String text) {
		System.out.println(text);
	}
}
