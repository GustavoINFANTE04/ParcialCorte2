abstract class Producto {
    protected String nombre;
    protected String marca;
    protected double precio;
    protected int cantidadStock;

    public Producto(String nombre, String Marca, double precio, int cantidadStock){
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }
    public abstract void mostrarDetalles();

    public double getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }
    public void reducirStock(int cantidad){
        cantidadStock -= cantidad;

    }
    public double calcularPrecioVenta(int cantidad){
        return precio*cantidad;
    }
}
