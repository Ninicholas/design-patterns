package estructurales.facade;

public class DVDPlayer {
    private static DVDPlayer instance = new DVDPlayer();

    private DVDPlayer() {}

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("DVD Player is ON");
    }

    public void off() {
        System.out.println("DVD Player is OFF");
    }

    public void play() {
        System.out.println("DVD Player is PLAYING");
    }

    public void stop() {
        System.out.println("DVD Player is STOPPED");
    }
}
