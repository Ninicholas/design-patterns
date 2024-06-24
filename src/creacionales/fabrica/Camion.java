package creacionales.fabrica;

public class Camion implements Transporte{
    @Override
    public void entregar(){
        System.out.println("Entregando por tierra");
    }
}
