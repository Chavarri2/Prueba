package modelo;

public class Electrodomestico {

    private int id; // autoincremental
    private String nombre;
    private String marca;
    private double precio;
    private int stock;
    private String categoriaEnergetica;

    public Electrodomestico(int id, String nombre, String marca,
                            double precio, int stock, String categoriaEnergetica) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
        this.categoriaEnergetica = categoriaEnergetica;
    }

    public Electrodomestico(String nombre, String marca,
                            double precio, int stock, String categoriaEnergetica) {
        this(0, nombre, marca, precio, stock, categoriaEnergetica);
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getMarca() { return marca; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public String getCategoriaEnergetica() { return categoriaEnergetica; }

    public void setId(int id) { this.id = id; }

    @Override
    public String toString() {
        return id + " - " + nombre + " (" + marca + ") " +
               precio + "€ | Stock: " + stock + " | Energía: " + categoriaEnergetica;
    }
}
