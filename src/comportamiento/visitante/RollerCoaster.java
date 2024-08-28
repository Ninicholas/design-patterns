package comportamiento.visitante;

public class RollerCoaster implements Attraction {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double getBasePrice() {
        return 50.0;
    }
}