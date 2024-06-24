package creacionales.fabricaAbstracta;

public class Cliente {
    public static void main(String[] args) {
        FabricaVehiculo fabricaElectrica = new FrabricaVehiculosGasolina();
        Auto auto = fabricaElectrica.crearAuto();
        Moto moto = fabricaElectrica.crearMoto();
        auto.manejar();
        moto.manejar();

        System.out.println("----------------------------");
        FabricaVehiculo fabricaGas = new FabricaVehiculosElectricos();
        Auto auto2 = fabricaGas.crearAuto();
        Moto moto2 = fabricaGas.crearMoto();
        auto2.manejar();
        moto2.manejar();
    }
}
