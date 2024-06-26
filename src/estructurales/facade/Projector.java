package estructurales.facade;

public class Projector {
    private static Projector instance = new Projector();

    private Projector() {}

    public static Projector getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Projector is ON");
    }

    public void off() {
        System.out.println("Projector is OFF");
    }
}
