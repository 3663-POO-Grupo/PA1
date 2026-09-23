public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto() {
        this.nombre = "Sin regitrar";
        this.precio = 0.0;
        this.stock = 0;
    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}