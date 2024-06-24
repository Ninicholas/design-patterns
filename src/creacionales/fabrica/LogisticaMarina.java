package creacionales.fabrica;

public class LogisticaMarina extends Logistica {
    @Override
    public Transporte crearTransporte() {
        return new Barco();
    }
}
