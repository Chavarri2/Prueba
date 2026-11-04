package renderEngine;
/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0
 * @since 22/08/2026
 * 
 * Este es un proyecto personal diseñado para aprender
 * desde cero la creacion de un juego 3D con OpenGL
 * Para empezar comenzaremos con conceptos basicos.
 * 
 * 1. Handle: Es un número que representa un recurso 
 * creado por una libreria nativa, en este caso lo usaremos
 * como el id de la ventana.
 * 
 * 2. GLFW: es una libreria escrita en C que LWJGL 3 usa
 * para crear ventanas, manejar teclado, ratón, gamepads,
 * monitores y crear el contexto de OpenGL. Es lo
 * equivalente en Swing a JFrame solo en el sentido de que 
 * crea ventanas y a Stage en JavaFX.
 * GLFW devuelve este número cuando crea la ventana.
 * Ese número NO es un ID inventado por Java, sino un 
 * puntero/identificador creado por GLFW en C.
 * 
 * 3. GL: activa las funciones de OpenGL dentro de LWJGL.
 * 
 * 4. GL11: contiene las funciones básicas de OpenGL, pero 
 * LWJGL las expone porque siguen siendo necesarias en 
 * OpenGL moderno (como glClear, glClearColor, glViewport).
 * (glClear, glClearColor, etc.)
 * 
 * 5. LWJGL (Lightweight Java Game Library): Es una 
 * librería que permite que Java pueda usar tecnologías 
 * que normalmente solo existen en C/C++.
 * LWJGL no es un motor gráfico, es solo un puente entre 
 * Java y APIs nativas como OpenGL, OpenAL, Vulkan y GLFW.  
 */

import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL;

//Importamos todas las funciones y constantes de OpenGL 1.1 (GL11)
//como funciones estáticas. Esto nos permite usar glClearColor()
//y GL_COLOR_BUFFER_BIT directamente, sin escribir GL11.glClearColor.
import static org.lwjgl.opengl.GL11.*;

/**
 * Clase WindowManager:
 * Representa la ventana principal del juego.
 *
 * Esta clase se encarga de:
 * 1. Inicializar GLFW (librería que crea ventanas para videojuegos)
 * 2. Crear la ventana con el tamaño y título especificados
 * 3. Activar OpenGL dentro de esa ventana
 * 4. Ejecutar el bucle principal del juego (game loop)
 * 5. Cerrar y liberar todos los recursos al terminar
 *
 * Esta clase NO dibuja nada todavía.
 * Solo prepara el entorno gráfico para que el motor pueda funcionar.
 */
public class Ventana {

	private long idVentana; // Handle de la ventana dado por el GLFW
	private int anchura; //Dimenciona el ancho predeterminado de la ventana el pixeles
	private int altura; //Dimenciona el largo predeterminado de la ventana el pixeles
	private String titulo; //Titulo inicial de la ventana. No es final porque el titulo suele cambiar de forma dinamica

	/**
	 * Constructor.
	 * Solo guarda los datos necesarios para crear la ventana.
	 * La ventana real se crea en el método init(). 
	 */

	public Ventana(int anchura, int altura, String titulo) {
		this.anchura=anchura;
		this.altura=altura;
		this.titulo=titulo;
	}

	/**
	 * Método principal del ciclo de vida de la ventana.
	 * run() ejecuta todo en orden:
	 *
	 * 1. init()  → inicializa GLFW y OpenGL
	 * 2. loop()  → ejecuta el bucle del juego
	 * 3. close() → libera recursos y cierra GLFW
	 */

	public void run() {
		inicio();
		bucle();
		cerrar();
	}

	/**
	 * Inicializa GLFW y OpenGL.
	 * Este método prepara todo lo necesario para que el juego pueda dibujar.
	 */

	public void inicio() {
		// Inicializamos GLFW. Si falla, no podemos crear ventanas.
		if (!GLFW.glfwInit()) {
			throw new IllegalStateException("No se pudo inicializar GLFW");
		}

		// Configuramos la versión de OpenGL que queremos usar: 3.3 Core Profile.
		// Core Profile = modo moderno (sin funciones antiguas).
		GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MAJOR, 3);
		GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MINOR, 3);
		GLFW.glfwWindowHint(GLFW.GLFW_OPENGL_PROFILE, GLFW.GLFW_OPENGL_CORE_PROFILE);

		// Creamos la ventana y guardamos su handle.
		// Los dos ceros finales significan:
		// - sin modo pantalla completa
		// - sin compartir contexto con otra ventana
		idVentana = GLFW.glfwCreateWindow(anchura, altura, titulo, 0, 0);

		// Asociamos el contexto de OpenGL a esta ventana.
		GLFW.glfwMakeContextCurrent(idVentana);

		// Activamos todas las funciones de OpenGL para LWJGL.
		GL.createCapabilities();

		// Definimos el color de fondo de la ventana (azul oscuro).
		glClearColor(0.1f, 0.1f, 0.3f, 1.0f);
	}

	/**
	 * Bucle principal del juego.
	 * Este método se ejecuta miles de veces por segundo.
	 *
	 * Aquí es donde más adelante:
	 * - actualizaremos la lógica del juego
	 * - dibujaremos modelos 3D
	 * - moveremos la cámara
	 * - procesaremos input
	 */

	public void bucle() {
		// Mientras el usuario no cierre la ventana...
		while (!GLFW.glfwWindowShouldClose(idVentana)) {

			// Limpiamos la pantalla con el color definido en init().
			glClear(GL_COLOR_BUFFER_BIT);

			// Mostramos en pantalla lo que OpenGL ha dibujado.
			GLFW.glfwSwapBuffers(idVentana);

			// Procesamos eventos: teclado, ratón, cerrar ventana, etc.
			GLFW.glfwPollEvents();
		}
	}

	/**
	 * Cierra GLFW y libera todos los recursos.
	 * Este método se ejecuta al final del programa.
	 */

	public void cerrar() {
		GLFW.glfwTerminate();
	}
}