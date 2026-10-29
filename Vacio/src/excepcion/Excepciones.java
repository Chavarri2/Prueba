/**
 * Excepción personalizada del proyecto "Vacío".
 * 
 * RESPONSABILIDAD PRINCIPAL:
 * - Representar errores específicos de validación o lógica del juego que no son manejados por excepciones estándar de Java.
 * - Permitir mensajes personalizados y claros para el usuario cuando algo falla (ej: nombre inválido, opción fuera de rango).
 * 
 * Se lanza desde:
 * - Validaciones.ingresarNombre() → cuando el nombre o nickname no cumple el patrón regex.
 * - Validaciones.obtenerOpcionValida() → aunque en esta versión usa bucle en vez de excepción, podría usarse en futuras validaciones estrictas.
 * 
 * Cumple requisito mínimo explícito:
 * - "Deberás crear tu propia excepción y usarla de forma adecuada".
 * - Se usa en validaciones de entradas del usuario (nombres, nicknames).
 * 
 * Relación con otras clases:
 * - Lanzada desde Validaciones (clase de control de entradas).
 * - Capturada y mostrada en ControladorUsuario.crearNuevoUsuario() y seleccionarOcrearUsuario().
 * - Permite mensajes amigables al usuario en vez de stack traces técnicos.
 * 
 * Ventajas:
 * - Mensajes personalizados y en español (mejor experiencia de usuario).
 * - Facilita depuración (se puede añadir más información en el futuro, ej: campo que falló).
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package excepcion;
/**
 * Constructor principal de la excepción personalizada.
 * 
 * FUNCIONAMIENTO:
 * - Recibe un mensaje descriptivo del error.
 * - Lo pasa al constructor de la clase padre (Exception).
 * - El mensaje se muestra al usuario cuando se captura la excepción.
 * 
 * Uso principal:
 * - Lanzada en Validaciones cuando una entrada no cumple requisitos (regex, longitud, formato).
 * - Ejemplo de mensaje: "El nickname puede contener letras, números, guiones, puntos y espacios (3-20 caracteres). Intenta de nuevo."
 * 
 * @param mensaje texto descriptivo del error (en español, amigable para el usuario)
 */
public class Excepciones extends Exception {
    public Excepciones(String mensaje) {
        super(mensaje);// Pasa el mensaje al constructor de Exception
    }
}