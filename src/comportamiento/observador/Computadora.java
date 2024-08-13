package comportamiento.observador;

public class Computadora implements Observador {
    private final String nombre;

    public Computadora(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + " ha recibido la alerta: " + mensaje);
    }
}