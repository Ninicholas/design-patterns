package builder;

public class CarBuilder implements Builder {

    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        car.setSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer(boolean tripComputer) {
        car.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(boolean gps) {
        car.setGps(gps);
    }

    public Car getResult() {
        Car result = car;
        this.reset();
        return result;
    }
}
