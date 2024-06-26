package estructurales.decorator;

public class Te implements Bebida{
    @Override
    public String getDescripcion() {
        return "Té";
    }

    @Override
    public double getPrecio() {
        return 1.5;
    }
}
