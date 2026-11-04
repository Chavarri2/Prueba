package ejercicios;
public class Punto {

    private int x;
    private int y;

    // Constructor con parámetros
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Constructor por defecto
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    // Getters
    public int getX() { return x; }
    public int getY() { return y; }

    // Setters
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    // Métodos de movimiento
    public void moverX(int cantidad) {
        this.x += cantidad;
    }

    public void moverY(int cantidad) {
        this.y += cantidad;
    }

    @Override
    public String toString() {
        return "Punto(" + x + ", " + y + ")";
    }
}
