package creacionales.fabricaAbstracta;

public class FrabricaVehiculosGasolina implements FabricaVehiculo{
    @Override
    public Auto crearAuto() {
        return new AutoGas();
    }

    @Override
    public Moto crearMoto() {
        return new MotoGas();
    }
}
