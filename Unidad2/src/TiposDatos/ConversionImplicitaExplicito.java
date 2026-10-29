package TiposDatos;
/*
 * 26/09/2025
 * David
 * Ejemplo para entender la conversion Implicita y Explicita
 */
public class ConversionImplicitaExplicito {

	public static void main(String[] args) {
		byte b;
		int e=12;
		b=12;//esto no da error
		//b=300;
		//b=e; no hace la conversion Implicita
		b=(byte) e;
		System.out.println(b);// imprime el valor 44 porque recorta el numero al primer byte
	}

}
