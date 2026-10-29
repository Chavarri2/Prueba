package modelo;
import jakarta.persistence.*;
@Entity                        
@Table(name = "students") 
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre",nullable=false, length=100)
	private String nombre;
	@Column(name="apellido",nullable=false, length=150)
	private String apellidos;
	@Column(name="edad",nullable=false)
	private Integer edad;
	@Column(name = "email", nullable = false, length = 150) 
	private String email;
	
	
	public Student() {
	}

	public Student(String nombre, String apellidos, Integer edad, String email) { 
		this.nombre    = nombre; 
		this.apellidos = apellidos; 
		this.edad      = edad; 
		this.email     = email; 
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", email="
				+ email + "]";
	}
	
}
