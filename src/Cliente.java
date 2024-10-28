import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Cliente {
    private String nombre;
    private String correo;
    private Map<Producto, Integer> productosComprados;

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
        this.productosComprados = new HashMap<>();
    }

    public void comprarProducto(Producto producto, int cantidad) {
        if (producto.getCantidadStock() >= cantidad) {
            productosComprados.put(producto, productosComprados.getOrDefault(producto, 0) + cantidad);
            producto.reducirStock(cantidad);
            System.out.println(nombre + " ha comprado " + cantidad + " de " + producto.nombre);
        } else {
            System.out.println("Stock insuficiente para " + producto.nombre);
        }
    }

    public void mostrarCompra() {
        System.out.println("Compra de " + nombre + ":");
        double total = 0;

        for (Map.Entry<Producto, Integer> entry : productosComprados.entrySet()) {
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();
            total += producto.calcularPrecioVenta(cantidad);
            producto.mostrarDetalles();
            System.out.println("Cantidad comprada: " + cantidad);
        }
        System.out.println("Total de la compra: " + total);
    }
}