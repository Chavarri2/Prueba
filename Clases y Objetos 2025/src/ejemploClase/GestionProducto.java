package ejemploClase;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0_21-11-2025
 * Clase para gestionar el producto*/
public class GestionProducto {

	public static void main(String[] args) {
		// Creo el producto
		Producto p1=new Producto("iman de nevera",2.0);
		// Muestro susu propiedades
		System.out.println(p1);
		// Cambio precio euros
		p1.setPrecioEuros(3.0);
		System.out.println(p1);
		Producto p2=new Producto("llaveros del pilar",10.0);
		Producto.setCambioEurosDolar(2.0);
		System.out.println(p1);
		System.out.println(p2);
		//array de productos
		Producto[] array=new Producto[2];
		array[0] = new Producto("mantel",6);
		array[1] = new Producto("tenedor",1.5);
		// Producto [] array1 ={new Producto ("mantel",6), new Producto("tenedor",1.5),p1,p2}
		System.out.println(p1);
		System.out.println(array[0]);
		Producto p3=new Producto ("juguete",14);
		System.out.println(p3);
		
		
		
	}

}
