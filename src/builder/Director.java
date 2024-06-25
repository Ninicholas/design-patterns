package builder;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("V8");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void constructCityCar(Builder builder) {
        builder.reset();
        builder.setSeats(4);
        builder.setEngine("V6");
        builder.setTripComputer(false);
        builder.setGPS(true);
    }
}
