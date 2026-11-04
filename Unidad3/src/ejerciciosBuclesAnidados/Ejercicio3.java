package ejerciciosBuclesAnidados;
/**
 * @author Carlos Abraha Chavarri Valera
 * @version 1.0
 * @since 19/10/2026
 * Ejercicio 3.Tabla de descuentos de una tienda
 * Una tienda quiere una tabla para consultar rápidamente el precio final de un artículo
 * según su descuento. Las filas son precios de 25 € a 125 €, de 25 en 25. Las columnas son
 * descuentos del 5 % al 25 %, de 5 en 5. Cada celda muestra el precio final con el descuento
 * aplicado.
 * Ejercicios de bucles anidados
 * Page 1 of 5
 * Precio 5% 10% 15% 20% 25%
 * 25 23.75 22.5 21.25 20.0 18.75
 * 50 47.5 45.0 42.5 40.0 37.5
 * ...
 * 125 118.75 112.5 106.25 100.0 93.75
 * Ampliación. Añade una segunda tabla que muestre los mismos precios finales sin
 * decimales, convirtiendo el resultado a int . Explica en un comentario qué ocurre con los
 * ºcéntimos.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		double descuento=0;
		for (int i = 5; i <=25; i+=5) {
			descuento=(100-i);
			descuento=(double)(descuento/100);
			System.out.print(i+"% ");
			for (int j = 25; j <= 125; j+=25) {
				System.out.print("\t["+j*descuento+"]");
			}
			System.out.println();
		}

	}

}
