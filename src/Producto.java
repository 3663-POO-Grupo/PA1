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

//-------------------------------------   Dante Zosimo Alanya Molina

// clase sistemacontrol y menu

import java.util.Scanner;

public class SistemaControl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        Producto productoActual = new Producto();

        System.out.println("Bienvenido al Sistema Básico de Registro y Control de Productos");

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Registrar nuevo producto");
            System.out.println("2. Mostrar información del producto");
            System.out.println("3. Realizar venta (validar stock)");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el precio: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese el stock inicial: ");
                    int stock = scanner.nextInt();
                    productoActual = new Producto(nombre, precio, stock);
                    System.out.println("¡Producto registrado con éxito!");
                    break;
                case 2:
                    if (productoActual.getNombre().equals("Sin registrar")) {
                        System.out.println("Aún no ha registrado ningún producto válido.");
                    } else {
                        productoActual.mostrarInformacion();
                    }
                    break;
                case 3:
                    if (productoActual.getNombre().equals("Sin registrar")) {
                        System.out.println("Aún no ha registrado ningún producto para vender.");
                    } else {
                        System.out.print("Ingrese la cantidad a vender: ");
                        int cantidad = scanner.nextInt();
                        productoActual.vender(cantidad);
                    }
                    break;
                case 4:
                    System.out.println("Cerrando el sistema. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }

        } while (opcion != 4);

        scanner.close();
    }

}