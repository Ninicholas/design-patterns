package estructurales.decorator;

public class LecheDecorator extends BebidaDecorator{
    public LecheDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + " con leche";
    }

    @Override
    public double getPrecio() {
        return bebida.getPrecio() + 0.5;
    }
}
