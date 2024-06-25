package estructurales.composite;

public class Elemento implements Componente {

    private String nombre;
    private double precio;

    public Elemento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void mostrar() {
        System.out.println(nombre + " Precio: " + precio);
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }
}
