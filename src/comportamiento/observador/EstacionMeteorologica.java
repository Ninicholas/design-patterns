package comportamiento.observador;

import java.util.ArrayList;
import java.util.List;

public class EstacionMeteorologica implements Observado {
    private List<Observador> observadores;
    private String estado;

    public EstacionMeteorologica() {
        this.observadores = new ArrayList<>();
    }

    @Override
    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {
        for (Observador observador : observadores) {
            observador.actualizar(estado);
        }
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notificarObservadores();
    }
}
