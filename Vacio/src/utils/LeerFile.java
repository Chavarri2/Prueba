/**
 * Clase auxiliar dedicada exclusivamente a la lectura de archivos JSON desde el sistema de archivos.
 * 
 * RESPONSABILIDAD ÚNICA:
 * - Cargar un archivo JSON (ej: Script.json) desde una ruta absoluta o relativa al proyecto.
 * - Convertirlo en un objeto JsonNode (estructura de árbol de Jackson).
 * - Devolver null y mostrar error si falla (no lanza excepción para no romper el juego).
 * 
 * Uso principal:
 * - Se llama desde Utilidades.leerArchivo() (una sola vez al inicio del programa).
 * - El resultado se guarda en InstanciaJuego.setTexto() para que ControladorEscena y Vista accedan al mismo JSON.
 * 
 * CARACTERÍSTICAS IMPORTANTES:
 * - Usa Files.readString(Paths.get(path)) → lee directamente del disco (ruta relativa al directorio de ejecución).
 * - Depende de Jackson (ObjectMapper) → ya incluido en librerías del proyecto.
 * - No usa getResourceAsStream → por eso funciona solo si el archivo está en el directorio correcto del proyecto (no en JAR exportado sin ajustes).
 * 
 * No se instancia la clase (método estático) → se llama directamente: LeerFile.GetJsonNode(...)
 * 
 * Limitación conocida:
 * - Si el proyecto se exporta a JAR, Paths.get() busca en el disco del usuario (no dentro del JAR).
 * - Recomendación futura: cambiar a getResourceAsStream para compatibilidad total con ejecutables.
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0 (versión inicial con lectura desde disco)
 * @since 2026-02-11
 */
package utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LeerFile {

	/**
	 * Método único y estático que carga un JSON desde el sistema de archivos y lo convierte en JsonNode.
	 * 
	 * FUNCIONAMIENTO DETALLADO:
	 * 1. Crea un ObjectMapper (Jackson) para parsear el contenido JSON.
	 * 2. Lee TODO el archivo como String usando Files.readString(Paths.get(path)).
	 *    - Paths.get(path) convierte la ruta en objeto Path.
	 *    - Files.readString lee todo el contenido en memoria (adecuado para archivos pequeños como Script.json).
	 * 3. Parsea la cadena JSON con mapper.readTree() → genera árbol JsonNode.
	 * 4. Devuelve el nodo raíz.
	 * 
	 * Manejo de errores:
	 * - Captura Exception amplia (IOException, JsonParseException, etc.).
	 * - Muestra solo el mensaje de error (e.getMessage()).
	 * - Devuelve null (no crashea el programa → el juego puede continuar sin escenas o con fallback).
	 * 
	 * Uso principal:
	 * - Utilidades.leerArchivo() → path = "resources/Script.json" (o ruta configurada).
	 * - Resultado se guarda en InstanciaJuego.texto.
	 * - Luego usado en ControladorEscena para crear escenas y respuestas desde el JSON.
	 * 
	 * Limitaciones:
	 * - Requiere que Script.json esté físicamente en la ruta indicada (ej: carpeta resources del proyecto).
	 * - No funciona correctamente en JAR exportado (Paths.get busca fuera del JAR).
	 * - Para JAR: cambiar a getResourceAsStream (versión futura recomendada).
	 * 
	 * @param path ruta relativa o absoluta del archivo JSON (ej: "resources/Script.json" o "/Script.json")
	 * @return JsonNode raíz del JSON o null si error (archivo no encontrado, formato inválido, permisos, etc.)
	 */
	public JsonNode GetJsonNode(String path) {
		try {
			ObjectMapper mapper = new ObjectMapper();// Jackson para parsear JSON a árbol

			// Lee TODO el archivo como String (adecuado para archivos pequeños < 1MB)
			// Paths.get(path) convierte cadena en objeto Path
			String json=Files.readString(Paths.get(path));

			// Parsea la cadena JSON en estructura de árbol (JsonNode)
			JsonNode root = mapper.readTree(json);
			return root;

		} catch (Exception e) {
			// Captura amplia: IOException (no existe, sin permisos), JsonParseException (JSON mal formado), etc.
			System.out.println(e.getMessage());// Muestra solo mensaje (no traza completa para no saturar consola)
			return null;// Devuelve null → el juego continúa sin contenido JSON (puede mostrar error genérico)
		}
	}
}
