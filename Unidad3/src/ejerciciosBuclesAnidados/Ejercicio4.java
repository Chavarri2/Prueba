package ejerciciosBuclesAnidados;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 20/10/2026
 * Ejercicio 4.El cine, versión real
 * Mejora el plano del ejercicio 1 para que se parezca al de una sala real:
 * Las filas se identifican con letras de la A a la E, y cada butaca con su letra y su número
 * ( A1 , A2 …). Las letras deben obtenerse a partir del número de fila, sin escribirlas una a
 * una.
 * Hay un pasillo central entre las butacas 4 y 5.
 * Las butacas C3, C4, C5 y C6 están reservadas y deben aparecer como XX .
 * A1 A2 A3 A4 A5 A6 A7 A8
 * B1 B2 B3 B4 B5 B6 B7 B8
 * C1 C2 XX XX XX XX C7 C8
 * D1 D2 D3 D4 D5 D6 D7 D8
 * E1 E2 E3 E4 E5 E6 E7 E8
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			char letra=(char)('A'+i);
			for (int j = 1; j <= 8; j++) {
				if(letra=='C' && j==3 || j==4 ||j==5 || j==6) {
					System.out.print("XX ");
				}else {
				System.out.print(letra+""+j+" ");
				}
				if(j==4) {
					System.out.print("    ");
				}
			}
			System.out.println();
		}

	}

}
