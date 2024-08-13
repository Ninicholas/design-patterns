package comportamiento.observador;

public class Tableta implements Observador {
    private final String nombre;

    public Tableta(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + " ha recibido la alerta: " + mensaje);
    }
}