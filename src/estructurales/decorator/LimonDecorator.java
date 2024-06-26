package estructurales.decorator;

public class LimonDecorator extends BebidaDecorator{
    public LimonDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " con limón";
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 0.25;
    }
}
