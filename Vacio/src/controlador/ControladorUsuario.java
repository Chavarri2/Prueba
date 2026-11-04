/**
 * Controlador exclusivo de la gestión de usuarios.
 * 
 * RESPONSABILIDAD ÚNICA:
 * - Crear nuevos usuarios con validación estricta de nombre, nickname y edad.
 * - Mostrar lista de usuarios existentes y permitir selección o creación nueva.
 * - Lanzar excepción personalizada (Excepciones) cuando los datos no cumplen formato.
 * - Asignar el usuario seleccionado/creado como usuarioActual en InstanciaJuego.
 * 
 * Todos los métodos son estáticos → no se instancia la clase.
 * Se usa al inicio de cada partida y cuando el jugador quiere cambiar de usuario desde el menú.
 * 
 * Cumple requisitos mínimos:
 * - Gestión de usuarios (requisito explícito).
 * - Uso de excepción propia (Excepciones) en validaciones.
 * - Control de excepciones adecuado.
 * - Uso de lista (usuarios en Juego).
 * 
 * Relación con otras clases:
 * - Llamada desde Menu.menu() y Juego.playJuego().
 * - Usa Validaciones (lectura y validación de entradas).
 * - Usa Excepciones (excepción personalizada).
 * - Modifica InstanciaJuego (setUsuarioActual).
 * - Usa lista de usuarios de Juego (getUsuarios()).
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package controlador;

import java.util.List;
import excepcion.Excepciones;
import modelo.InstanciaJuego;
import modelo.Usuario;
import utils.Validaciones;

public class ControladorUsuario {
	/**
	 * Crea un nuevo usuario completo y lo añade a la lista global de usuarios.
	 * 
	 * FUNCIONAMIENTO DETALLADO:
	 * 1. Muestra mensaje de bienvenida.
	 * 2. Lee y valida nombre real con regex (solo letras, 2-50 caracteres).
	 * 3. Lee y valida nickname con regex (letras, números, guiones, puntos, espacios; 3-20 caracteres).
	 * 4. Lee edad validada (13-120 años).
	 * 5. Instancia nuevo Usuario con los datos validados.
	 * 6. Asigna como usuarioActual en InstanciaJuego.
	 * 7. Añade el usuario a la lista global (Juego.getUsuarios()).
	 * 8. Muestra mensaje de bienvenida con nickname.
	 * 
	 * Uso principal:
	 * - Llamado desde seleccionarOcrearUsuario() cuando se elige "Crear nuevo usuario".
	 * 
	 * @param instancia contenedor global (para setUsuarioActual)
	 * @param usuarios lista de usuarios existentes (se modifica añadiendo el nuevo)
	 * @return lista actualizada (por referencia, pero se devuelve por claridad)
	 * @throws Excepciones si cualquier dato no pasa validación (relanzada desde Validaciones)
	 */
	public static List<Usuario> crearNuevoUsuario(InstanciaJuego instancia,List<Usuario> usuarios) throws Excepciones {
		System.out.println("\nBienvenid@ al Limbo...");

		String nombre = null;
		String nickname = null;
		short edad = 0;

		// Validación estricta de nombre real (regex: solo letras y espacios, 2-50 caracteres)
		nombre= Validaciones.ingresarNombre(nombre, "Ingresa tu nombre real", "^[A-Za-zÁÉÍÓÚÜáéíóúüÑñ ]{2,50}$","Tu nombre solo puede contener letras de la A a la Z y debe tener de 2-50 caracteres");
		// Validación estricta de nickname (regex: letras, números, guiones, puntos, espacios; 3-20 caracteres)
		nickname= Validaciones.ingresarNombre(nickname, "Ingresa tu nickname", "^[\\w\\-\\. ]{3,20}$", "El nickname puede contener letras, números, guiones, puntos y espacios (3-20 caracteres). Intenta de nuevo.");
		// Edad validada entre 13 y 120 años
		edad=Validaciones.obtenerOpcionValida("Introduce tu edad (13-120 años): ",(short) 13, (short) 120);

		// Creación del usuario y asignación como actual
		instancia.setUsuarioActual(new Usuario(nombre, nickname, edad));

		// Añade a la lista global de usuarios
		usuarios.add(instancia.getUsuarioActual());

		System.out.println("\n¡Bienvenid@, " + nickname + "!");
		return usuarios;
	}
	/**
	 * Muestra lista de usuarios existentes y permite seleccionar uno o crear nuevo.
	 * 
	 * FUNCIONAMIENTO DETALLADO:
	 * 1. Muestra encabezado y lista numerada de usuarios existentes (si los hay):
	 *    - Formato: "1. Nickname (Nombre real)"
	 * 2. Añade opción extra: "Crear nuevo usuario".
	 * 3. Lee opción validada (1 a N+1).
	 * 4. Si elige crear nuevo → llama a crearNuevoUsuario().
	 * 5. Si elige uno existente → lo asigna como usuarioActual en InstanciaJuego.
	 * 6. Muestra mensaje de confirmación.
	 * 
	 * Uso principal:
	 * - Llamado al inicio del menú si no hay usuario actual.
	 * - Llamado también al cambiar usuario desde menú (si se implementara opción).
	 * 
	 * @param instancia contenedor global (para setUsuarioActual)
	 * @param usuarios lista de usuarios (se modifica si se crea uno nuevo)
	 * @throws Excepciones si falla alguna validación interna (relanzada desde crearNuevoUsuario)
	 */
	public static void seleccionarOcrearUsuario(InstanciaJuego instancia, List<Usuario> usuarios) throws Excepciones {
		System.out.println("\n=== Usuarios disponibles ===");
		if (usuarios.isEmpty()) {
			System.out.println("No hay usuarios creados aún.");
		} else {
			// Muestra lista numerada de usuarios existentes
			for (short i = 0; i < usuarios.size(); i++) {
				Usuario u = usuarios.get(i);
				System.out.printf("%d. %s (%s)%n", i + 1, u.getNickname(), u.getNombre());
			}
		}
		// Opción extra para crear nuevo usuario
		System.out.println((usuarios.size() + 1) + ". Crear nuevo usuario");
		System.out.println("============================");

		short opcion;

		do {
			// Lee opción validada entre 1 y número de opciones disponibles
			opcion = Validaciones.obtenerOpcionValida(
					"Selecciona una opcion: ",
					(short) 1,
					(short) (usuarios.size() + 1)
					);
		} while (opcion < 1 || opcion > usuarios.size() + 1);

		if (opcion == usuarios.size() + 1) {
			// Elige crear nuevo → llama método correspondiente
			usuarios = ControladorUsuario.crearNuevoUsuario(instancia, usuarios);
		} else {
			// Elige usuario existente → asigna como actual
			instancia.setUsuarioActual(usuarios.get(opcion - 1));
			System.out.println("\nUsuario seleccionado: " + instancia.getUsuarioActual().getNickname());
		}
	}
}
