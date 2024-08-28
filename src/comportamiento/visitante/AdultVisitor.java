package comportamiento.visitante;

public class AdultVisitor implements Visitor {
    @Override
    public void visit(RollerCoaster rollerCoaster) {
        System.out.println("Precio para Adulto en Montaña Rusa: $" + rollerCoaster.getBasePrice());
    }

    @Override
    public void visit(HauntedHouse hauntedHouse) {
        System.out.println("Precio para Adulto en Casa del Terror: $" + hauntedHouse.getBasePrice());
    }

    @Override
    public void visit(Carousel carousel) {
        System.out.println("Precio para Adulto en Carrusel: $" + carousel.getBasePrice());
    }
}