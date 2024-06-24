package creacionales.fabricaAbstracta;

public class FabricaVehiculosElectricos implements FabricaVehiculo{

    @Override
    public Auto crearAuto() {
        return new AutoElectrico();
    }

    @Override
    public Moto crearMoto() {
        return new MotoElectrica();
    }
}
