package estructurales.adapter;

public class testAdapter {
    public static void main(String[] args) {
        AgujeroRedondo agujeroRedondo = new AgujeroRedondo(5);
        FiguraRedonda figuraRedonda = new FiguraRedonda(5);
        System.out.println("Agujero redondo de " + agujeroRedondo.getRadio() + " encaja con figura redonda de " + figuraRedonda.getRadio() + ":");
        System.out.println(agujeroRedondo.encaja(figuraRedonda));

        FiguraCuadrada figuraCuadradaSmall = new FiguraCuadrada(5);
        FiguraCuadrada figuraCuadradaLarge = new FiguraCuadrada(10);

        // This line will not compile because the method encaja expects a FiguraRedonda object
        // agujeroRedondo.encaja(figuraCuadradaSmall);

        AdaptadorFiguraCuadrada adaptadorFiguraCuadradaSmall = new AdaptadorFiguraCuadrada(figuraCuadradaSmall);
        AdaptadorFiguraCuadrada adaptadorFiguraCuadradaLarge = new AdaptadorFiguraCuadrada(figuraCuadradaLarge);

        System.out.println("Agujero redondo de " + agujeroRedondo.getRadio() + " encaja con figura cuadrada de " + figuraCuadradaSmall.getAncho() + ":");
        System.out.println(agujeroRedondo.encaja(adaptadorFiguraCuadradaSmall));
        System.out.println("Agujero redondo encaja de " + agujeroRedondo.getRadio() + " con figura cuadrada de " + figuraCuadradaLarge.getAncho() + ":");
        System.out.println(agujeroRedondo.encaja(adaptadorFiguraCuadradaLarge));
    }
}
