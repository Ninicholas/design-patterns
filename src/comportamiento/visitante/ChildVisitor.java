package comportamiento.visitante;

public class ChildVisitor implements Visitor {
    @Override
    public void visit(RollerCoaster rollerCoaster) {
        System.out.println("Niño no puede entrar a la Montaña Rusa.");
    }

    @Override
    public void visit(HauntedHouse hauntedHouse) {
        System.out.println("Precio para Niño en Casa del Terror: $" + hauntedHouse.getBasePrice() * 0.5);
    }

    @Override
    public void visit(Carousel carousel) {
        System.out.println("Precio para Niño en Carrusel: $" + carousel.getBasePrice() * 0.5);
    }
}
