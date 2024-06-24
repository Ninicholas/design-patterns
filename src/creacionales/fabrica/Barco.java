package creacionales.fabrica;

public class Barco implements Transporte{
    @Override
    public void entregar() {
        System.out.println("Entregando por mar");
    }
}
