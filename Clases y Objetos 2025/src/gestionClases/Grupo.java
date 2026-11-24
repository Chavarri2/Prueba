package gestionClases;

import java.util.Arrays;

/**
 * @author Carlos Abraham Chavarri Valera
 * @version 1.0_28-11-2025
 */
public class Grupo {
	private String nombre;
	private Alumno[] alumnos;
	
	/**
	 * constructor*/
	public Grupo(String nombre, int max) {
		this.nombre=nombre;
		alumnos=new Alumno [max];
	}
	/**
	 * 
	 * @param alumno
	 * @return
	 */
	public boolean insertar(Alumno alumno) {
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i]==null) {
				alumnos[i]=alumno;
				return true;
			}		
		}
		return false;
	}
	/**
	 * 
	 * @param numExpediente
	 * @return
	 */
	public Calificacion[] consultarCalificacionesAlumno(int numExpediente) {
		for (Alumno a:alumnos) {
			if(a!=null) {
				if(a.getNumeroExpediente()==numExpediente) {
					return a.getCalificaciones();
				}
			}
		}
		return null;
	}
	
	public Grupo consultarAlumnosConTodoAprobado() {
        Grupo aprobados = new Grupo("Aprobados de " + this.nombre, this.alumnos.length);
        int contador = 0;
		for (int i = 0; i < contador; i++) {
            if (alumnos[i] != null && alumnos[i].todoAprovado()) {
                aprobados.insertar(alumnos[i]);
            }
        }
        return aprobados;
    }
	public Grupo consultarAlumnosMediaMayor5() {
        Grupo buenos = new Grupo("Media > 5 de " + this.nombre, this.alumnos.length);
        int contador = 0;
		for (int i = 0; i < contador; i++) {
            if (alumnos[i] != null && alumnos[i].obtenerMedia() > 5) {
                buenos.insertar(alumnos[i]);
            }
        }
        return buenos;
    }
	
	public static Grupo grupoConMasSuspensos(Grupo grupo1, Grupo grupo2) {
        int suspensos1 = grupo1.contarAlumnosConSuspensos();
        int suspensos2 = grupo2.contarAlumnosConSuspensos();

        if (suspensos1 > suspensos2) {
            return grupo1;
        } else if (suspensos2 > suspensos1) {
            return grupo2;
        } else {
            return null; // empate
        }
    }
	
	private int contarAlumnosConSuspensos() {
        int contadorSuspensos = 0;
        int contador = 0;
		for (int i = 0; i < contador; i++) {
            if (alumnos[i] != null && !alumnos[i].todoAprovado()) {
                contadorSuspensos++;
            }
        }
        return contadorSuspensos;
    }
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the alumnos
	 */
	public Alumno[] getAlumnos() {
		return alumnos;
	}

	/**
	 * @param alumnos the alumnos to set
	 */
	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	@Override
	public String toString() {
		return "Grupo [nombre=" + nombre + ", alumnos=" + Arrays.toString(alumnos) + "]";
	}
	
}
