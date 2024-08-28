package comportamiento.visitante;

public class HauntedHouse implements Attraction {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getBasePrice() {
        return 30.0;
    }
}