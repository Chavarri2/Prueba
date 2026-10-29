/**
 * Clase abstracta PADRE de la que heredan TODAS las entidades principales del juego.
 * 
 * RESPONSABILIDADES PRINCIPALES:
 * - Proporcionar un ID único y automático a cada objeto que herede de ella (contador estático).
 * - Almacenar un nombre descriptivo (opcional).
 * - Servir como base común para cumplir el requisito mínimo: "todas las clases deben heredar de una clase padre".
 * 
 * Se utiliza como superclase para:
 * - Usuario
 * - Personaje
 * - Partida
 * - Escena
 * 
 * Cumple requisitos mínimos explícitos:
 * - Clase padre abstracta con atributos y métodos propios.
 * - Generación automática de ID (miembro estático contadorIds).
 * - Herencia obligatoria para todas las entidades principales.
 * 
 * Relación con otras clases:
 * - Es la raíz de la jerarquía de herencia del paquete modelo.
 * - Todas las clases principales (excepto enums y clases auxiliares) extienden EntidadJuego.
 * - El contador estático es compartido → garantiza IDs únicos en toda la aplicación.
 * 
 * @author Carlos Abraham Chavarri Valera
 * @author Violeta Pisco Aznar
 * @version 1.0
 * @since 2026-02-11
 */
package modelo;

public abstract class EntidadJuego {
	/**
	 * Contador estático compartido por TODAS las instancias de EntidadJuego y sus hijos.
	 * 
	 * Funcionamiento:
	 * - Inicializado en 0.
	 * - Se incrementa en 1 cada vez que se crea un objeto (en constructor sin parámetros).
	 * - Garantiza IDs únicos y secuenciales en toda la ejecución (incluso entre diferentes tipos de entidades).
	 * 
	 * Cumple requisito: "al menos 2 miembros de clase" (contadorIds + otro estático en el proyecto, ej: LeerScanner.teclado).
	 */
	private static Integer contadorIds = 0;

	/**
	 * ID único y automático asignado a cada entidad al crearse.
	 * - Generado en constructor mediante ++contadorIds.
	 * - Nunca se modifica manualmente.
	 * - Útil para identificar objetos en logs, depuración o futura persistencia.
	 */
	protected Integer id;

	/**
	 * Nombre descriptivo de la entidad (opcional).
	 * - Puede ser null.
	 * - Se usa en toString() y para identificación humana.
	 * - En Usuario → nombre real.
	 * - En Personaje → nombre del héroe.
	 * - En Partida/Escena → puede quedar null o usarse para referencia.
	 */
	protected String nombre;

	/**
	 * Constructor por defecto (sin parámetros).
	 * 
	 * Uso principal:
	 * - Creación de entidades cuando no se necesita nombre inicial.
	 * - Llamado por super() en constructores de hijos.
	 * 
	 * Funcionamiento:
	 * - Incrementa contadorIds y asigna ID único.
	 * - nombre queda null.
	 */
	public EntidadJuego() {
		this.id = ++contadorIds;// Incremento atómico → ID único garantizado
	}

	/**
	 * Constructor con nombre.
	 * 
	 * Uso:
	 * - Creación de entidades cuando se conoce el nombre desde el principio.
	 * - Llamado en constructores de hijos que reciben nombre (ej: Usuario, Personaje).
	 * 
	 * @param nombre nombre descriptivo de la entidad
	 */
	public EntidadJuego(String nombre) {
		this.id = ++contadorIds;// Llama constructor vacío → genera ID
		this.nombre = nombre;// Asigna nombre recibido
	}

	// Getters y Setters
	public Integer getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "[" + id + "] " + nombre;
	}
}