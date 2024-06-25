package creacionales.prototype;

public class Circulo extends Forma {
    private int radio;

    public Circulo(int radio) {
        super(0, 0, "blanco");
        this.radio = radio;
    }

    public Circulo(Forma fuente) {
        super(fuente);
        if (fuente != null) {
            this.radio = ((Circulo) fuente).radio;
        }
    }

    @Override
    public Forma clonar() {
        return new Circulo(this);
    }

    @Override
    public String toString() {
        return "Circulo:" + System.lineSeparator() +
                "  Radio: " + radio;
    }
}
