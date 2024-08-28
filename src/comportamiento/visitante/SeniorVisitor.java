package comportamiento.visitante;

public class SeniorVisitor implements Visitor {
    @Override
    public void visit(RollerCoaster rollerCoaster) {
        System.out.println("Anciano no puede entrar a la Montaña Rusa.");
    }

    @Override
    public void visit(HauntedHouse hauntedHouse) {
        System.out.println("Precio para Anciano en Casa del Terror: $" + hauntedHouse.getBasePrice() * 0.8);
    }

    @Override
    public void visit(Carousel carousel) {
        System.out.println("Precio para Anciano en Carrusel: $" + carousel.getBasePrice() * 0.8);
    }
}