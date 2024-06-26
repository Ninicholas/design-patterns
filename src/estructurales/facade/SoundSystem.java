package estructurales.facade;

public class SoundSystem {
    private static SoundSystem instance = new SoundSystem();

    private SoundSystem() {}

    public static SoundSystem getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("Sound System is ON");
    }

    public void off() {
        System.out.println("Sound System is OFF");
    }

    public void setVolume(int level) {
        System.out.println("Sound System volume set to " + level);
    }
}
