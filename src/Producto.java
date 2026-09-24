public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto() {
        this.nombre = "Sin registrar";
        this.precio = 0.0;
        this.stock = 0;
    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarInformacion() {
        System.out.println("\n--- Información del Producto ---");
        System.out.println("Nombre : " + this.nombre);
        System.out.println("Precio : S/ " + this.precio);
        System.out.println("Stock  : " + this.stock + " unidades");
        System.out.println("--------------------------------");
    }


    public boolean validarStock(int cantidadSolicitada) {
        if (this.stock >= cantidadSolicitada && cantidadSolicitada > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void vender(int cantidad) {
        if (validarStock(cantidad)) {
            this.stock -= cantidad; // Actualización del stock
            System.out.println("Venta exitosa. Nuevo stock de " + this.nombre + ": " + this.stock);
        } else {
            System.out.println("Error: Stock insuficiente o cantidad inválida.");
        }
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}
