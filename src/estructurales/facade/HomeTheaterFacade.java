package estructurales.facade;

public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Lights lights;
    private Screen screen;
    private SoundSystem soundSystem;

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.projector = Projector.getInstance();
        this.lights = Lights.getInstance();
        this.screen = Screen.getInstance();
        this.soundSystem = SoundSystem.getInstance();
    }

    public void watchMovie() {
        System.out.println("Get ready to watch a movie...");
        lights.dim();
        screen.down();
        projector.on();
        soundSystem.on();
        soundSystem.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play();
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        dvdPlayer.stop();
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        screen.up();
        lights.on();
    }
}

