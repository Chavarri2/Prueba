/**
 * Controlador exclusivo para la carga inicial y organización de todas las escenas del juego.
 * 
 * RESPONSABILIDAD ÚNICA:
 * - Leer el archivo JSON (Script.json) a través de InstanciaJuego.
 * - Instanciar objetos Escena y Respuestas para cada evento definido en el JSON.
 * - Añadir las respuestas (opciones) a cada escena.
 * - Guardar cada escena en el mapa pasado por parámetro (clave = ID de escena).
 * 
 * Se llama UNA SOLA VEZ al inicio de cada partida (desde Juego.playJuego()).
 * Permite que el juego sea completamente escalable: basta con editar Script.json para añadir/modificar escenas sin tocar código Java.
 * 
 * Cumple requisito indirecto:
 * - Uso de JSON externo para narrativa (escalabilidad).
 * - Relación 1:N con Escena y Respuestas.
 * 
 * Relación con otras clases:
 * - Lee JSON desde InstanciaJuego.getTexto().
 * - Crea objetos Escena y Respuestas.
 * - Guarda escenas en mapa de Juego (getEscenas()).
 * - Llamado desde Juego.playJuego().
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package controlador;

import java.util.Map;
import com.fasterxml.jackson.databind.JsonNode;
import modelo.Escena;
import modelo.InstanciaJuego;
import modelo.Respuestas;

public class ControladorEscena {
	/**
	 * Método único y estático que inicializa el mapa de escenas.
	 * 
	 * FUNCIONAMIENTO DETALLADO:
	 * - Accede al JsonNode raíz desde instancia.getTexto().
	 * - Para cada escena definida en el JSON (inicio, huir, acercarse, atacar, finales, etc.):
	 *   - Crea un objeto Escena con nombre y texto descriptivo.
	 *   - Lee las opciones/respuestas asociadas desde la sección "OPCIONES" del JSON.
	 *   - Instancia objetos Respuestas (texto visible + clave de siguiente escena).
	 *   - Añade cada Respuestas a la lista interna de menus de la Escena.
	 *   - Guarda la Escena completa en el mapa usando el ID como clave.
	 * 
	 * El mapa se pasa por parámetro porque Juego lo mantiene como atributo y lo usa en el bucle jugarPartida().
	 * 
	 * Uso principal:
	 * - Llamado una sola vez en Juego.playJuego() antes de empezar la partida.
	 * 
	 * @param instancia objeto que contiene el JsonNode ya cargado (Script.json)
	 * @param escenas mapa vacío o parcial donde se almacenarán todas las escenas (clave = ID del JSON)
	 */
	public static void inicializarEscenas(InstanciaJuego instancia, Map<String, Escena> escenas) {
		// ESCENA INICIAL - Punto de entrada del juego (CAP1 - ESCENAINICIAL)
		JsonNode escenaInicio = instancia.getTexto().path("EVENTOS").path("CAP1").path("ESCENAINICIAL");
		Escena inicio = new Escena(escenaInicio.path("NOMBRE").asText(), escenaInicio.path("TEXTO").asText());

		// Carga las opciones iniciales del jugador (normalmente "Huir", "Acercarse", "Atacar")
		JsonNode opcionesEscenaInicio = instancia.getTexto().path("EVENTOS").path("OPCIONES").path("OPCIONESCOMIENZO");
		for (JsonNode Item : opcionesEscenaInicio) {
			// Cada opción genera un objeto Respuestas: texto que ve el jugador + clave de la escena siguiente
			inicio.getMenus().add(new Respuestas(Item.path("OPCION").asText(), Item.path("CLAVE").asText()));
		}
		// Guarda en el mapa con su ID único
		escenas.put(escenaInicio.path("ID").asText(), inicio);

		// ESCENA "HUIR" - Respuesta 1 de la escena inicial
		JsonNode escenaInicioHuir = instancia.getTexto().path("EVENTOS").path("CAP1").path("RESPUESTAINICIAL1");
		Escena inicioHuir = new Escena(escenaInicioHuir.path("NOMBRE").asText(), escenaInicioHuir.path("TEXTO").asText());

		JsonNode opcionesEscenaHuir = instancia.getTexto().path("EVENTOS").path("OPCIONES").path("OPCIONESCOMIENZOHUIR");
		for (JsonNode Item : opcionesEscenaHuir) {
			inicioHuir.getMenus().add(new Respuestas(Item.path("OPCION").asText(), Item.path("CLAVE").asText()));
		}
		escenas.put(escenaInicioHuir.path("ID").asText(), inicioHuir);

		// ESCENA "ACERCARSE" - Respuesta 2 de la escena inicial
		JsonNode escenaInicioAcercarse = instancia.getTexto().path("EVENTOS").path("CAP1").path("RESPUESTAINICIAL2");
		Escena inicioAcercarse = new Escena(escenaInicioAcercarse.path("NOMBRE").asText(), escenaInicioAcercarse.path("TEXTO").asText());

		JsonNode seguirCap2 = instancia.getTexto().path("EVENTOS").path("OPCIONES").path("SEGUIRCAPITULO2");
		inicioAcercarse.getMenus().add(new Respuestas(seguirCap2.path("OPCION").asText(), seguirCap2.path("CLAVE").asText()));

		escenas.put(escenaInicioAcercarse.path("ID").asText(), inicioAcercarse);

		// ESCENA "ATACAR" - Respuesta 3 de la escena inicial
		JsonNode escenaInicioAtacar = instancia.getTexto().path("EVENTOS").path("CAP1").path("RESPUESTAINICIAL3");
		Escena inicioAtacar = new Escena(escenaInicioAtacar.path("NOMBRE").asText(), escenaInicioAtacar.path("TEXTO").asText());

		JsonNode opcionesContinuar = instancia.getTexto().path("EVENTOS").path("OPCIONES").path("OPCIONESFINAL");
		inicioAtacar.getMenus().add(new Respuestas(opcionesContinuar.path("OPCION").asText(), opcionesContinuar.path("CLAVE").asText()));

		escenas.put(escenaInicioAtacar.path("ID").asText(), inicioAtacar);

		// FINAL MALO - Río Estigio (uno de los finales negativos)
		JsonNode finalRioestigio = instancia.getTexto().path("EVENTOS").path("FINALES").path("MALO");
		Escena finalMalo = new Escena(finalRioestigio.path("NOMBRE").asText(), finalRioestigio.path("TEXTO").asText());

		JsonNode acabar = instancia.getTexto().path("EVENTOS").path("OPCIONES").path("ACABA");
		finalMalo.getMenus().add(new Respuestas(acabar.path("OPCION").asText(), acabar.path("CLAVE").asText()));

		escenas.put(finalRioestigio.path("ID").asText(), finalMalo);

		// ESCENA EMBARCAR - Llegada al Vacío (CAP2)
		JsonNode escenaEmbarcar = instancia.getTexto().path("EVENTOS").path("CAP2").path("LLEGADAVACIO");
		Escena embarcar = new Escena(escenaEmbarcar.path("NOMBRE").asText(), escenaEmbarcar.path("TEXTO").asText());

		JsonNode respuestasEmbarcar = instancia.getTexto().path("EVENTOS").path("OPCIONES").path("OPCIONESVACIO");
		embarcar.getMenus().add(new Respuestas(respuestasEmbarcar.path("OPCION").asText(), respuestasEmbarcar.path("CLAVE").asText()));

		escenas.put(escenaEmbarcar.path("ID").asText(), embarcar);

		// ESCENA INTRODUCCIÓN AL COMBATE (CAP2)
		JsonNode introduceEncuentro = instancia.getTexto().path("EVENTOS").path("CAP2").path("INTRODUCCIONCOMBATE");
		Escena encuentro = new Escena(introduceEncuentro.path("NOMBRE").asText(), introduceEncuentro.path("TEXTO").asText());

		JsonNode respuestasencuentro = instancia.getTexto().path("EVENTOS").path("OPCIONES").path("OPCIONESCAP2");
		for (JsonNode Item : respuestasencuentro) {
			encuentro.getMenus().add(new Respuestas(Item.path("OPCION").asText(), Item.path("CLAVE").asText()));
		}
		escenas.put(introduceEncuentro.path("ID").asText(), encuentro);


		// ESCENA PRIMER COMBATE (CAP2)
		JsonNode primerEncuentro = instancia.getTexto().path("EVENTOS").path("CAP2").path("PRIMERCOMBATE");
		Escena encuentro1 = new Escena(primerEncuentro.path("NOMBRE").asText(), primerEncuentro.path("TEXTO").asText());

		JsonNode respuestasprimerencuentro = instancia.getTexto().path("EVENTOS").path("OPCIONES").path("OPCIONESCOMBATE");
		for (JsonNode Item : respuestasprimerencuentro) {
			encuentro1.getMenus().add(new Respuestas(Item.path("OPCION").asText(), Item.path("CLAVE").asText()));
		}
		escenas.put(primerEncuentro.path("ID").asText(), encuentro1);


		// FINAL MALO 2 - Huir
		JsonNode finalHuir = instancia.getTexto().path("EVENTOS").path("FINALES").path("MALO2");
		Escena huir = new Escena(finalHuir.path("NOMBRE").asText(), finalHuir.path("TEXTO").asText());

		JsonNode respuestaHuir = instancia.getTexto().path("EVENTOS").path("OPCIONES").path("OPCIONESHUIR");
		huir.getMenus().add(new Respuestas(respuestaHuir.path("OPCION").asText(), respuestaHuir.path("CLAVE").asText()));
		escenas.put(finalHuir.path("ID").asText(), huir);

		// FINAL MALO 1 - Perdido
		JsonNode finalPerdido = instancia.getTexto().path("EVENTOS").path("FINALES").path("MALO1");
		Escena perdido = new Escena(finalPerdido.path("NOMBRE").asText(), finalPerdido.path("TEXTO").asText());

		JsonNode respuestaPerdido = instancia.getTexto().path("EVENTOS").path("OPCIONES").path("ACABA");
		perdido.getMenus().add(new Respuestas(respuestaPerdido.path("OPCION").asText(), respuestaPerdido.path("CLAVE").asText()));

		escenas.put(finalPerdido.path("ID").asText(), perdido);
	}
}
