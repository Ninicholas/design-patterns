package comportamiento.observador;

public class DispositivoMovil implements Observador {
    private final String nombre;

    public DispositivoMovil(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + " ha recibido la alerta: " + mensaje);
    }
}