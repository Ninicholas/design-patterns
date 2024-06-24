package creacionales.fabricaAbstracta;

public class FrabricaVehiculosGasolina extends FabricaVehiculo{
    @Override
    public Auto crearAuto() {
        return new AutoGas();
    }

    @Override
    public Moto crearMoto() {
        return new MotoGas();
    }
}
