package comportamiento.visitante;

public interface Visitor {
    void visit(RollerCoaster rollerCoaster);
    void visit(HauntedHouse hauntedHouse);
    void visit(Carousel carousel);
}