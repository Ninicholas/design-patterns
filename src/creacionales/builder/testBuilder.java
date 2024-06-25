package creacionales.builder;

public class testBuilder {
    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder and constructs the object using it
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println(car);

        // The same director can construct a different variation of the product
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructCityCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println(carManual);
    }
}
