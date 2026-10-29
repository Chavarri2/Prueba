package gestionClases;

/*
 * Carlos Abraham Chavarri Valera
 * 27/11/2025
 * Prueba de la clase calificacion*/
public class GestionAlumnos {

	public static void main(String[] args) {
		// Creamos objetos de la clase calificacion
		Calificacion c1 = new Calificacion("programacion", 9.0);
		System.out.println(c1);
		Calificacion c2 = new Calificacion("Base de Datos", 4.33);
		System.out.println(c2);
		System.out.println(c1.getCalificacion() + c2.getCalificacion());
		// Crear un alumno
		Alumno a1 = new Alumno("David", 1);
		System.out.println(a1);
		a1.insertar(new Calificacion("programacion", 9.0));
		System.out.println(a1);
		a1.insertar(new Calificacion("ingles", 5));
		a1.insertar(new Calificacion("Base de datos", 6));
		System.out.println(a1);
		System.out.println(a1.consultarMejorNota());
		System.out.println(a1.consultarCalificacion("ingles"));
		a1.modificarCalificacion(new Calificacion("ingles", 10));
		System.out.println(a1);
		a1.modificarCalificacion("programacion", 10);
		System.out.println(a1);
		System.out.println(a1.todoAprobado());
		System.out.println(a1.obtenerMedia());
		Grupo g = new Grupo("1º DAM", 5);
		llenarGrupo(g);
		//Grupo todoAprobados = g.consultarAlumnosConTodoAprobado();
		//System.out.println(todoAprobados);
		Grupo mediaMayor5 = g.consultarAlumnosConTodoAprobado();
		System.out.println(mediaMayor5);
		//System.out.println(g);
		//System.out.println(Arrays.toString(g.consultarCalificacionesAlumno(3)));
	}

	private static void llenarGrupo(Grupo g) {
		g.insertar(new Alumno("manuel", 2));
		g.insertar(new Alumno("daniel", 3));
		g.insertar(new Alumno("juan", 4));

		g.getAlumnos()[0].insertar(new Calificacion("ingles", 6));
		g.getAlumnos()[0].insertar(new Calificacion("programacion", 8));
		g.getAlumnos()[0].insertar(new Calificacion("bases de datos", 9));

		g.getAlumnos()[1].insertar(new Calificacion("ingles", 10));
		g.getAlumnos()[1].insertar(new Calificacion("programacion", 9));
		g.getAlumnos()[1].insertar(new Calificacion("bases de datos", 2));

		g.getAlumnos()[2].insertar(new Calificacion("ingles", 7));
		g.getAlumnos()[2].insertar(new Calificacion("programacion", 10));
		g.getAlumnos()[2].insertar(new Calificacion("bases de datos", 6));
		
		
	}
}
