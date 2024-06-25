package estructurales.bridge;

public class TV implements Device{

    private int volumen, channel;

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void enable() {
        System.out.println("TV is enabled");
    }

    @Override
    public void disable() {
        System.out.println("TV is disabled");
    }

    @Override
    public int getVolume() {
        return this.volumen;
    }

    @Override
    public void setVolume(int volume) {
        this.volumen = volume;
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }
}
