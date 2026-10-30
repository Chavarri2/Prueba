package entornos;

import java.util.ArrayList;
import java.util.List;

public class GestionPedidos {

	// Clase auxiliar estática para representar un producto
	static class Producto {

		private String nombre;
		private double precioBase;
		private int stock;

		public Producto(String nombre, double precioBase, int stock) {
			this.nombre = nombre;
			this.precioBase = precioBase;
			this.stock = stock;
		}

		public String getNombre() {
			return nombre;
		}

		public double getPrecioBase() {
			return precioBase;
		}

		public int getStock() {
			return stock;
		}

		public void reducirStock(int cantidad) {
			this.stock -= cantidad;
		}
	}

	public static void main(String[] args) {
		System.out.println("=== INICIANDO PROCESAMIENTO DE PEDIDOS ===");

		List<Producto> catalogo = new ArrayList<>();

		catalogo.add(new Producto("Monitor 4K", 280.00, 5));
		catalogo.add(new Producto("Teclado Mecánico", 75.50, 12));
		catalogo.add(new Producto("Ratón Ergonómico", 42.00, 0)); // Sin stock
		catalogo.add(new Producto("Auriculares USB", 59.99, 8));

		int[] cantidadesSolicitadas = { 2, 1, 1, 3 };
		double costeTotal = procesarLote(catalogo, cantidadesSolicitadas);

		System.out.printf("Importe total procesado: %.2f €%n", costeTotal);
		System.out.println("=== PROCESO FINALIZADO ===");
	}

	public static double procesarLote(List<Producto> productos, int[] cantidades) {
		double acumulador = 0.0;

		for (int i = 0; i < productos.size(); i++) {

			Producto p = productos.get(i);
			int cantidad = cantidades[i];

			System.out.println("Evaluando artículo: " + p.getNombre());

			if (p.getStock() >= cantidad) {
				double subtotal = calcularImporteConDescuento(p.getPrecioBase(), cantidad);
				p.reducirStock(cantidad);
				acumulador += subtotal;
			} else {
				System.out.println("-> [ALERTA] Stock insuficiente para " + p.getNombre());
			}
		}
		return acumulador;
	}

	public static double calcularImporteConDescuento(double precio, int unidades) {
		double total = precio * unidades;
		// Descuento del 10% si se compran 3 o más unidades
		if (unidades >= 3) {
			// ¡OJO AL BUG AQUÍ!
			total = total * 0.10; // Debería restar el 10% o multiplicar por 0.90
		}
		return total;
	}
}