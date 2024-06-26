package estructurales.decorator;

public class BebidaDecorator implements Bebida{
    protected Bebida bebida;

    public BebidaDecorator(Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion();
    }

    @Override
    public double getPrecio() {
        return bebida.getPrecio();
    }
}
