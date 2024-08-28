package comportamiento.visitante;

public class Carousel implements Attraction {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getBasePrice() {
        return 20.0;
    }
}