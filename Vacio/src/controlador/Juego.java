
/**
 * Clase central y más importante del proyecto "Vacío".
 * Gestiona TODO el flujo de ejecución del juego una vez iniciada la partida.
 * 
 * RESPONSABILIDADES PRINCIPALES:
 * - Almacenar el mapa de escenas cargadas desde JSON (clave = ID).
 * - Mantener referencia estática a la partida en curso (partidaActual).
 * - Controlar bandera de juego activo (juegoEnCurso).
 * - Iniciar partida completa (playJuego).
 * - Ejecutar bucle principal escena a escena (jugarPartida).
 * - Gestionar transiciones, combate, finales y puntuación.
 * 
 * Se instancia:
 * - Una vez en Vacio.main() → se crea y se pasa al menú.
 * - Es el "cerebro" que coordina controladores, vistas y modelo.
 * 
 * Cumple requisitos indirectos:
 * - Orquesta herencia, interfaces, excepciones, JSON, multimedia.
 * - Centraliza lógica de flujo (MVC-like: Juego = controlador).
 * 
 * Relación con otras clases:
 * - Recibe InstanciaJuego (usuario y JSON).
 * - Usa ControladorUsuario, ControladorPartida, ControladorEscena.
 * - Usa Vista (indirectamente vía mostrar), Utilidades, Validaciones, Musica.
 * - Modifica Partida (partidaActual) y Usuario (añade partida al finalizar).
 * - Llama a Combatir cuando clave = "combate".
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package controlador;

import java.util.HashMap;
import java.util.Map;
import controlador.Juego;
import excepcion.Excepciones;
import modelo.Combatir;
import modelo.Escena;
import modelo.EstadoJuego;
import modelo.InstanciaJuego;
import modelo.Partida;
import modelo.Puntuacion;
import modelo.Respuestas;
import modelo.Usuario;
import utils.Utilidades;
import utils.Validaciones;
import java.util.ArrayList;
import java.util.List;

public class Juego {
	/**
	 * Atributos principales de la clase Juego.
	 */
	private final InstanciaJuego instancia;// Contenedor global (usuario actual + JSON cargado)
	private Map<String, Escena> escenas = new HashMap<>();// Mapa clave=ID → objeto Escena cargada
	private static Partida partidaActual;// Partida en curso (static para acceso fácil desde cualquier punto)
	private static boolean juegoEnCurso = false;// Bandera que controla el bucle principal (true = jugando)
	private static List<Usuario> usuarios = new ArrayList<>();// Lista estática de todos los usuarios creados (global en la ejecución)
	/**
	 * Constructor principal.
	 * 
	 * FUNCIONAMIENTO:
	 * - Recibe la instancia global del juego (usuario y JSON).
	 * - Recibe mapa vacío de escenas (se llenará después).
	 * - Carga el JSON una sola vez mediante Utilidades.leerArchivo().
	 * 
	 * Uso:
	 * - Llamado en Vacio.main() → única instancia de Juego.
	 * 
	 * @param instancia contenedor global (usuario + JSON)
	 * @param escenas mapa inicialmente vacío donde se cargarán las escenas
	 */
	public Juego(InstanciaJuego instancia, Map<String, Escena> escenas) {
		this.instancia = instancia;
		this.escenas = escenas;
		instancia.setTexto(Utilidades.leerArchivo());// Carga Script.json al inicio (una sola vez)
	}
	/**
	 * Inicia toda la lógica de una nueva partida.
	 * 
	 * FUNCIONAMIENTO DETALLADO:
	 * 1. Carga todas las escenas desde JSON (ControladorEscena).
	 * 2. Selecciona o crea usuario (ControladorUsuario).
	 * 3. Crea personaje y partida (ControladorPartida).
	 * 4. Activa bandera juegoEnCurso = true.
	 * 5. Obtiene clave inicial directamente del JSON (CAP1 → ESCENAINICIAL).
	 * 6. Lanza el bucle principal (jugarPartida).
	 * 
	 * Uso:
	 * - Llamado desde Menu.menu() cuando el jugador elige opción 1 (Nueva partida).
	 * 
	 * @param instancia instancia global del juego
	 * @throws Excepciones si falla validación de usuario
	 */
	public void playJuego(InstanciaJuego instancia) throws Excepciones {

		ControladorEscena.inicializarEscenas(instancia, escenas);// Carga TODAS las escenas
		ControladorUsuario.seleccionarOcrearUsuario(instancia, usuarios);// Elige/crea usuario
		partidaActual = ControladorPartida.iniciarNuevaPartida(instancia);// Crea personaje + partida
		juegoEnCurso = true;

		// Obtiene clave de la primera escena directamente del JSON
		String claveInicial = instancia.getTexto()
				.path("EVENTOS").path("CAP1").path("ESCENAINICIAL").path("ID").asText();

		jugarPartida(claveInicial);// Comienza el bucle de juego  
	}
	/**
	 * Bucle principal del juego (mientras juegoEnCurso sea true).
	 * Cada iteración representa una escena completa.
	 * 
	 * FUNCIONAMIENTO DETALLADO:
	 * 1. Obtiene escena actual por clave del mapa.
	 * 2. Si no existe → mensaje y vuelve a inicial.
	 * 3. Personaliza texto según género del personaje.
	 * 4. Muestra con efecto typewriter.
	 * 5. Muestra opciones numeradas.
	 * 6. Lee elección validada (1 a número de opciones).
	 * 7. Registra acción + avanza turno.
	 * 8. Si clave = "combate" → ejecuta combate y decide clave siguiente.
	 * 9. Si final → asigna resultado (GANASTE/PERDISTE) y termina bucle.
	 * 10. Si no → avanza a siguiente clave.
	 * 11. Muestra estado del personaje.
	 * 12. Al terminar bucle:
	 *     - Calcula y muestra puntuación.
	 *     - Muestra resumen de partida.
	 *     - Guarda partida en usuario.
	 * 
	 * Uso:
	 * - Llamado desde playJuego() con clave inicial.
	 * 
	 * @param claveEscenaActual ID de la escena desde la que se empieza
	 */
	public void jugarPartida(String claveEscenaActual) {
		try {
			while (juegoEnCurso) {
				Escena escenaActual = escenas.get(claveEscenaActual);
				if (escenaActual == null) {
					System.out.println("Escena no encontrada. Volviendo al inicial.");
					claveEscenaActual = instancia.getTexto().path("EVENTOS").path("CAP1").path("ESCENAINICIAL")
							.path("ID").asText();
					continue;

				}
				// Personalización de texto según género del personaje
				String textoEscena= Utilidades.cambiarGenero(escenaActual.getDescripcion(), partidaActual.getPersonaje().getGenero());

				// Efecto máquina de escribir
				Utilidades.typeWriter("\n" + textoEscena, 10);

				// Muestra opciones disponibles
				System.out.println("Opciones:");
				short index = 1;
				for (Respuestas m : escenaActual.getMenus()) {
					System.out.println(index + ". " + m.getTexto());
					index++;
				}

				// Lectura y validación de elección
				short eleccion = Validaciones.obtenerOpcionValida("Tu decisión: ", (short) 1,
						(short) escenaActual.getMenus().size());

				Respuestas menuElegido = escenaActual.getMenus().get(eleccion - 1);
				String accionElegida = menuElegido.getTexto();
				String siguienteClave = menuElegido.getClave();

				// Registro de acción y avance de turno
				partidaActual.registrarAcciones(accionElegida);
				partidaActual.incrementarTurno();

				System.out.println("Has elegido: " + accionElegida);

				// Caso especial: combate
				if (siguienteClave.equals("combate")) {
					boolean victoria = false;
					Combatir combate = new Combatir();
					victoria = combate.batalla(partidaActual.getPersonaje(), "Aurelia", "Mujer", "Hostil");

					if (victoria) {
						siguienteClave = "final_demo";
					} else {
						siguienteClave = "final_perdido";
					}
				}

				// Comprobación de final
				if (siguienteClave.contains("null")) {
					partidaActual.setResultado(EstadoJuego.PERDISTE);
					juegoEnCurso = false;
					System.out.println("\n¡Has perdido! FINAL MALO.");
				} else if(siguienteClave.contains("final_demo")){
					partidaActual.setResultado(EstadoJuego.GANASTE);
					juegoEnCurso = false;
					System.out.println("Has completado la Demo ¡Enhorabuena!");
				}
				else {
					claveEscenaActual = siguienteClave;
				}

				// Muestra estado actual del personaje después de cada escena
				System.out.println("\nEstado actual del personaje:");
				partidaActual.getPersonaje().mostrar();
			}

			// Final de partida: cálculo y guardado de puntuación
			Puntuacion puntuacion = partidaActual.getPuntuacion();
			System.out.println("\nPuntuación obtenida: " + puntuacion.getPuntos());

			System.out.println("\nPartida finalizada.");
			System.out.println("Turnos: " + partidaActual.getTurnos());
			System.out.println("Resultado: " + partidaActual.getResultado());
			System.out.println("Acciones realizadas: " + partidaActual.getAcciones().size());

			// Guarda la partida en el usuario
			instancia.getUsuarioActual().getPartidas().add(partidaActual);

		} catch (Exception e) {
			System.out.println("Error inesperado durante la partida: " + e.getMessage());
		}
	}
	/**
	 * Devuelve el mapa de escenas cargadas.
	 * 
	 * Uso:
	 * - Accedido por ControladorEscena para inicializar.
	 * - Accedido por jugarPartida para obtener escenas por clave.
	 * 
	 * @return mapa clave=ID → Escena
	 */
	public Map<String, Escena> getEscenas() {
		return escenas;
	}
	/**
	 * Devuelve la lista de usuarios creados.
	 * 
	 * Uso:
	 * - Accedido por ControladorUsuario para mostrar y seleccionar usuarios.
	 * 
	 * @return lista estática de usuarios
	 */
	public List<Usuario> getUsuarios() {
		return usuarios;
	}


}
