package modelo;
// Coche.java
// Clase de dominio que representa un coche de la tabla 'coches'
public class Coche {
    private String matricula;
    private int anio;
    private String marca;
    private String modelo;
    private String provincia;

    public Coche(String matricula, int anio, String marca, String modelo, String provincia) {
        this.matricula = matricula;
        this.anio = anio;
        this.marca = marca;
        this.modelo = modelo;
        this.provincia = provincia;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAnio() {
        return anio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProvincia() {
        return provincia;
    }

    // Formato de salida para mostrar en la vista
    @Override
    public String toString() {
        return matricula + " - " + marca + " " + modelo + " (" + anio + ")";
    }
}
