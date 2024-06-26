package estructurales.decorator;

public class Cafe implements Bebida{
    @Override
    public String getDescripcion() {
        return "Café";
    }

    @Override
    public double getPrecio() {
        return 2.5;
    }
}
