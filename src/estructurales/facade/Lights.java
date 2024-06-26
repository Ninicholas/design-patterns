package estructurales.facade;

public class Lights {
    private static Lights instance = new Lights();

    private Lights() {}

    public static Lights getInstance() {
        return instance;
    }

    public void dim() {
        System.out.println("Lights are DIMMED");
    }

    public void on() {
        System.out.println("Lights are ON");
    }
}
