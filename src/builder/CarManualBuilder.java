package builder;

public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSeats(int seats) {
        manual.setSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
        manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        manual.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(boolean gps) {
        manual.setGps(gps);
    }

    public Manual getResult() {
        Manual result = manual;
        this.reset();
        return result;
    }
}
