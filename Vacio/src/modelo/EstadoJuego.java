/**
 * Enum que representa los posibles resultados finales de una partida.
 * 
 * RESPONSABILIDAD PRINCIPAL:
 * - Definir de forma clara y segura los dos estados posibles al finalizar el juego:
 *   - GANASTE: el jugador completó la historia con éxito.
 *   - PERDISTE: el jugador falló o llegó a un final negativo.
 * 
 * FUNCIONAMIENTO GENERAL:
 * - Es un tipo enumerado (enum) → valores fijos y limitados, no se pueden crear más.
 * - Se asigna en Juego.jugarPartida() al llegar a un final:
 *   - Si clave contiene "final_demo" → EstadoJuego.GANASTE.
 *   - Si clave contiene "null" o final malo → EstadoJuego.PERDISTE.
 * - Se usa en Partida para almacenar resultado y en Partida.getPuntuacion() para calcular bono.
 * 
 * Cumple requisito indirecto:
 * - Uso de enum (buena práctica para estados finitos).
 * - Facilita control de flujo y cálculo de puntuación (evita strings mágicos como "ganado" o "perdido").
 * 
 * Relación con otras clases:
 * - 1 Partida → 1 EstadoJuego (atributo resultado).
 * - Usado en Juego para decidir mensaje final y en Partida para bono de puntos.
 * - Indirectamente: influye en Puntuacion.comentario y Vista para mostrar resultado.
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package modelo;

public enum EstadoJuego {
	/**
	 * Estado de victoria: el jugador ha completado la demo o escapado del limbo.
	 * 
	 * Uso:
	 * - Asignado cuando se llega a "final_demo".
	 * - Da bono de +300 puntos en Partida.getPuntuacion().
	 * - Genera comentario positivo en Puntuacion.
	 */
    GANASTE,
    /**
     * Estado de derrota: el jugador ha perdido o llegado a un final negativo.
     * 
     * Uso:
     * - Asignado cuando se llega a "final_perdido", "null" o cualquier final malo.
     * - Sin bono de puntos.
     * - Genera comentario negativo en Puntuacion.
     */
    PERDISTE
}