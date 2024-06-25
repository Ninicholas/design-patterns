package estructurales.adapter;

public class AgujeroRedondo {
    private int radio;

    public AgujeroRedondo(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public boolean encaja(FiguraRedonda figuraRedonda) {
        return this.getRadio() >= figuraRedonda.getRadio();
    }
}
