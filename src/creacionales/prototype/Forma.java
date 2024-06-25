package creacionales.prototype;

public abstract class Forma {
    private int x, y;
    private String color;

    public Forma(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Forma(Forma fuente) {
        if (fuente != null) {
            this.x = fuente.x;
            this.y = fuente.y;
            this.color = fuente.color;
        }
    }

    public abstract Forma clonar();

}
