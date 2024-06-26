package estructurales.facade;

public class Screen {
    private static Screen instance = new Screen();

    private Screen() {}

    public static Screen getInstance() {
        return instance;
    }

    public void down() {
        System.out.println("Screen is DOWN");
    }

    public void up() {
        System.out.println("Screen is UP");
    }
}
