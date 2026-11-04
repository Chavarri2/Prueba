/**
 * Clase auxiliar dedicada exclusivamente a la gestión de música de fondo.
 * 
 * RESPONSABILIDAD ÚNICA:
 * - Reproducir un único archivo WAV en bucle infinito al iniciar el juego.
 * - Permitir pausar y reanudar la música desde el menú principal.
 * 
 * CARACTERÍSTICAS IMPORTANTES:
 * - Usa Clip de la API Java Sound (javax.sound.sampled) → estándar y ligero.
 * - El clip es estático → solo una instancia en toda la aplicación (evita múltiples reproducciones).
 * - Carga el archivo desde recursos (/in_the_sea.wav) → funciona en Eclipse y JAR exportado.
 * - No se instancia la clase (métodos estáticos) → se llama directamente: Musica.reproducir().
 * 
 * Uso principal:
 * - Se inicia en Vacio.main() al arrancar el programa.
 * - Se controla (pausa/reproduce) desde Menu.menu() (opciones 4 y 5).
 * 
 * Cumple requisito indirecto: uso de multimedia y encapsulación de funcionalidad externa.
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package utils;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.net.URL;

public class Musica {
	/**
	 * Clip estático global → única instancia de audio en toda la aplicación.
	 * Se inicializa en reproducir() la primera vez y se reutiliza después.
	 * Permite pausar/reproducir sin recargar el archivo.
	 */
	private static Clip clip;

	/**
	 * Reproduce la música de fondo en bucle infinito.
	 * 
	 * FUNCIONAMIENTO DETALLADO:
	 * 1. Si clip es null (primera vez):
	 *    - Obtiene URL del recurso /in_the_sea.wav (dentro de classpath).
	 *    - Abre AudioInputStream desde la URL.
	 *    - Crea Clip y lo abre con el stream.
	 * 2. Reinicia posición al inicio (setFramePosition(0)).
	 * 3. Activa bucle continuo (Clip.LOOP_CONTINUOUSLY).
	 * 4. Inicia reproducción (clip.start()).
	 * 
	 * Uso principal:
	 * - Llamado en Vacio.main() al iniciar el programa.
	 * - Llamado desde menú (opción 5) para reanudar tras pausa.
	 * 
	 * Posibles errores manejados:
	 * - Archivo no encontrado → mensaje en consola.
	 * - Excepciones de audio → capturadas y mostradas (no crashea el juego).
	 */
    public static void reproducir() {
        try {
            if (clip == null) {
            	// Carga desde recursos (funciona en Eclipse y JAR)
            	URL recurso = Musica.class.getResource("/in_the_sea.wav");

                if (recurso == null) {
                    System.out.println("ERROR: No se ha podido cargar la musica.");
                    return;
                }

                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(recurso);
                clip = AudioSystem.getClip();
                clip.open(audioInputStream);
            }
            clip.setFramePosition(0); // Reinicia desde el principio
            clip.loop(Clip.LOOP_CONTINUOUSLY); // Bucle infinito
            clip.start(); // Comienza reproducción
            System.out.println("\nReproduciendo música.\n");
        } catch (Exception e) {
            System.out.println("Error al reproducir música: " + e.getMessage());
        }
    }
    /**
     * Pausa la música si está reproduciéndose.
     * 
     * FUNCIONAMIENTO:
     * - Comprueba si clip existe y está activo (isRunning()).
     * - Si sí → clip.stop() (pausa en posición actual, no libera recursos).
     * 
     * Uso principal:
     * - Llamado desde menú (opción 4) para pausar.
     * - No libera recursos (clip sigue abierto) → permite reanudar rápido con reproducir().
     */
    public static void pausar() {
        if (clip != null && clip.isRunning()) {
            clip.stop();// Pausa en posición actual (no reinicia)
            System.out.println("\nMúsica pausada.\n");
        }
    }
}
