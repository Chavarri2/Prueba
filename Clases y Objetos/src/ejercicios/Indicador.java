package ejercicios;

/**
 * Clase Indicador
 * Representa un indicador de la vida real (nivel, velocidad, tacómetro, etc.)
 * 
 * @author Christian Lazaro Manzueta
 * @date 17/11/2005
 */
public class Indicador {

    // Atributos
    private double valorMinimo;
    private double valorMaximo;
    private double valorActual;
    private String unidades;
    private String nombre;

    /**
     * Constructor de la clase Indicador.
     * No se pasa el valorActual porque el enunciado lo indica.
     * Por defecto, se inicializa en el valor mínimo.
     */
    public Indicador(String nombre, double valorMinimo, double valorMaximo, String unidades) {
        this.nombre = nombre;
        this.valorMinimo = valorMinimo;
        this.valorMaximo = valorMaximo;
        this.unidades = unidades;
        this.valorActual = valorMinimo; // valor inicial
    }

    /**
     * Asigna un nuevo valor actual dentro de los límites.
     */
    public void asignarValorActual(double valorActual) {
        if (valorActual >= valorMinimo && valorActual <= valorMaximo) {
            this.valorActual = valorActual;
        } else {
            System.out.println("Valor fuera de rango.");
        }
    }

    /**
     * Incrementa el valor actual en 1 unidad, si no supera el máximo.
     */
    public void aumenta() {
        if (valorActual < valorMaximo) {
            valorActual++;
        }
    }

    /**
     * Disminuye el valor actual en 1 unidad, si no baja del mínimo.
     */
    public void disminuye() {
        if (valorActual > valorMinimo) {
            valorActual--;
        }
    }

    // Getters y Setters
    public double getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public double getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(double valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public double getValorActual() {
        return valorActual;
    }

    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve una representación en texto del indicador.
     */
    @Override
    public String toString() {
        return "Indicador: " + nombre +
               " | Unidades: " + unidades +
               " | Valor actual: " + valorActual +
               " | Máximo: " + valorMaximo +
               " | Mínimo: " + valorMinimo;
    }
}
