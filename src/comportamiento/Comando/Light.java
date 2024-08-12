package comportamiento.Comando;

public class Light {
    public void turnOn(int brightness) {
        System.out.println("Las luces están encendidas con brillo al " + brightness + "%");
    }

    public void turnOff() {
        System.out.println("Las luces están apagadas");
    }
}
