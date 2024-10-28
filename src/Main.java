public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Dell XPS 13", "Dell", 1000.0, 10, "Intel i7", 16);
        Celular celular1 = new Celular("Samsung Galaxy S21", "Samsung", 800.0, 15, 4000, "108MP");

        Cliente cliente1 = new Cliente("Sebastian Guzman", "sebasunimi@example.com");
        Cliente cliente2 = new Cliente("Ana Delia Del castillo", "anadelia123@example.com");

        cliente1.comprarProducto(laptop1, 3);
        cliente1.comprarProducto(celular1, 6);
        cliente2.comprarProducto(laptop1, 5);

        cliente1.mostrarCompra();
        cliente2.mostrarCompra();


        System.out.println("Inventario actualizado:");
        laptop1.mostrarDetalles();
        celular1.mostrarDetalles();
    }
}