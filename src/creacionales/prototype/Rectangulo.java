package creacionales.prototype;

public class Rectangulo extends Forma{

    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto) {
        super(0, 0, "blanco");
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo(Rectangulo fuente) {
        super(fuente);
        if (fuente != null) {
            this.ancho = fuente.ancho;
            this.alto = fuente.alto;
        }
    }

    @Override
    public Forma clonar() {
        return new Rectangulo(this);
    }

    @Override
    public String toString() {
        return "Rectángulo:" + System.lineSeparator() +
                "  Ancho: " + ancho + System.lineSeparator() +
                "  Alto: " + alto;
    }

}
