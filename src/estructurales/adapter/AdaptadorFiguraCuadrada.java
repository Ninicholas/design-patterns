package estructurales.adapter;

public class AdaptadorFiguraCuadrada extends FiguraRedonda {
    private FiguraCuadrada figuraCuadrada;

    public AdaptadorFiguraCuadrada(FiguraCuadrada figuraCuadrada) {
        super(figuraCuadrada.getAncho());
        this.figuraCuadrada = figuraCuadrada;
    }

    public int getRadio() {
        return (int) (figuraCuadrada.getAncho() * Math.sqrt(2) / 2);
    }
}
