/**
 * Clase auxiliar con métodos estáticos de utilidades generales que NO pertenecen a ninguna entidad concreta.
 * 
 * RESPONSABILIDADES:
 * - Leer el archivo JSON principal (Script.json).
 * - Convertir nodos JSON en listas de strings (para menús y títulos).
 * - Mostrar texto con efecto "máquina de escribir" (typeWriter).
 * - Personalizar textos según género del personaje (reemplaza @ por a/o/e).
 * 
 * Todos los métodos son estáticos → no se instancia la clase.
 * Se usa en casi todo el flujo del juego: Juego, Vista, Escena, etc.
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package utils;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.JsonNode;

public class Utilidades {
	/**
	 * Lee y devuelve el nodo raíz del archivo Script.json.
	 * 
	 * FUNCIONAMIENTO:
	 * - Crea una instancia de LeerFile.
	 * - Llama a GetJsonNode("/Script.json") → carga desde recursos (ruta en classpath).
	 * - Devuelve el JsonNode completo o null si falla.
	 * 
	 * Uso principal: se llama una vez al inicio (en Juego.constructor) y se guarda en InstanciaJuego.
	 * 
	 * @return JsonNode raíz del archivo Script.json o null si error
	 */
	public static JsonNode leerArchivo () {
		LeerFile leer = new LeerFile();
		return leer.GetJsonNode("resources/Script.json");// Ruta relativa en classpath (dentro de src o resources)
	}
	/**
	 * Convierte un nodo JSON (array de strings) en una lista de String Java.
	 * 
	 * FUNCIONAMIENTO:
	 * 1. Comprueba si el nodo es un array.
	 * 2. Recorre cada elemento y añade su valor como texto (asText()).
	 * 3. Devuelve lista vacía si no es array.
	 * 
	 * Uso principal: en Vista para cargar textos de MENUS/INICIO del JSON.
	 * 
	 * @param json nodo JSON que debe ser un array de strings
	 * @return lista de strings extraídas o lista vacía si no es array
	 */
	public static List < String> jsonToList(JsonNode json){
		List <String> resultado = new ArrayList<>();
		if (json.isArray()) {
			for (JsonNode n : json) {
				resultado.add(n.asText());
			}
		}
		return resultado;

	}
	/**
	 * Muestra texto por consola con efecto "máquina de escribir".
	 * 
	 * FUNCIONAMIENTO:
	 * - Recorre cada carácter del texto.
	 * - Imprime uno a uno con un pequeño retraso (delayMs milisegundos).
	 * - Al final añade salto de línea.
	 * 
	 * Uso principal: en Juego.jugarPartida() para mostrar descripción de escenas.
	 * Da sensación narrativa y tensión.
	 * 
	 * @param texto cadena completa a mostrar
	 * @param delayMs tiempo de espera entre cada carácter (ms)
	 */
	public static void typeWriter(String texto, long delayMs) {
		for (char c : texto.toCharArray()) {
			System.out.print(c);
			try {
				Thread.sleep(delayMs);// Pausa entre caracteres
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();// Restaura estado de interrupción
			}
		}
		System.out.println();// Salto de línea final
	}
	/**
	 * Personaliza textos según género del personaje.
	 * Reemplaza el carácter especial '@' por la vocal correspondiente:
	 *   - 'a' si género = "mujer"
	 *   - 'o' si género = "hombre"
	 *   - 'e' si género = "desconocido" (neutro)
	 * 
	 * FUNCIONAMIENTO:
	 * - Decide vocal según valor de género (case sensitive).
	 * - Usa String.replace() para sustituir todos los @.
	 * 
	 * Uso principal: en Juego.jugarPartida() antes de mostrar texto de escena.
	 * Permite frases como: "Te acerc@s al río" → "Te acercas", "Te acercas", "Te acercas".
	 * 
	 * @param texto texto original con @ donde debe cambiar la vocal
	 * @param genero valor del atributo genero del Personaje ("hombre", "mujer", "desconocido")
	 * @return texto modificado con vocal adecuada
	 */
	public static String cambiarGenero(String texto, String genero) {
		char letra;
		if(genero=="mujer") {
			letra='a';
		}else if(genero=="hombre") {
			letra='o';
		}else {
			letra='e';// Neutro por defecto
		}
		return texto.replace('@', letra);// Reemplaza todos los @ de una vez
	}
}