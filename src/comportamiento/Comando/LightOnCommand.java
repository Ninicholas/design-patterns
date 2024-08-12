package comportamiento.Comando;

// Comando concreto para encender las luces con brillo ajustable
public class LightOnCommand implements Command {
    private final Light light;
    private final int brightness;

    public LightOnCommand(Light light, int brightness) {
        this.light = light;
        this.brightness = brightness;
    }

    @Override
    public void execute() {
        light.turnOn(brightness);
    }
}
