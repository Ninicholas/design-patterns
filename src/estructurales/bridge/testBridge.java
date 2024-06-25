package estructurales.bridge;

public class testBridge {
    public static void main(String[] args) {
        Device radio = new Radio();
        Remote remote = new Remote(radio);
        remote.togglePower();

        Device tv = new TV();
        AdvancedRemote advancedRemote = new AdvancedRemote(tv);
        advancedRemote.togglePower();
        System.out.println("Volume: " + tv.getVolume());
        advancedRemote.volumeUp();
        advancedRemote.volumeUp();
        advancedRemote.volumeUp();
        System.out.println("Volume: " + tv.getVolume());
        System.out.println("Channel: " + tv.getChannel());
        advancedRemote.channelUp();
        advancedRemote.channelUp();
        advancedRemote.mute();
        System.out.println("Channel: " + tv.getChannel());
        System.out.println("Volume: " + tv.getVolume());
    }
}
