package comportamiento.visitante;

public class testVisitor {
    public static void main(String[] args) {
        Attraction rollerCoaster = new RollerCoaster();
        Attraction hauntedHouse = new HauntedHouse();
        Attraction carousel = new Carousel();

        Visitor child = new ChildVisitor();
        Visitor adult = new AdultVisitor();
        Visitor senior = new SeniorVisitor();

        System.out.println("---- Niño visitando atracciones ----");
        rollerCoaster.accept(child);
        hauntedHouse.accept(child);
        carousel.accept(child);

        System.out.println("\n---- Adulto visitando atracciones ----");
        rollerCoaster.accept(adult);
        hauntedHouse.accept(adult);
        carousel.accept(adult);

        System.out.println("\n---- Anciano visitando atracciones ----");
        rollerCoaster.accept(senior);
        hauntedHouse.accept(senior);
        carousel.accept(senior);
    }
}
