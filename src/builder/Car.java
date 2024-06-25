package builder;

public class Car {
    private int seats;
    private String engine;
    private boolean tripComputer;
    private boolean gps;

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return "Car: " + System.lineSeparator() +
                "  Seats: " + seats + System.lineSeparator() +
                "  Engine: " + engine + System.lineSeparator() +
                "  Trip Computer: " + tripComputer + System.lineSeparator() +
                "  GPS: " + gps;
    }
}
