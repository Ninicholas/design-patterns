package comportamiento.Comando;

public class testComando {
    public static void main(String[] args) {
        // Creamos el receptor
        Light livingRoomLight = new Light();

        // Creamos los comandos
        Command lightOn = new LightOnCommand(livingRoomLight, 75);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Creamos el invocador
        RemoteControl remote = new RemoteControl();

        // Encender las luces
        remote.setCommand(lightOn);
        remote.pressButton();

        // Apagar las luces
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
