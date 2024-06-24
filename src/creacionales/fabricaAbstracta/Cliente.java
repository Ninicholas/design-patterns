package creacionales.fabricaAbstracta;

public class Cliente {
    public static void main(String[] args) {
        FabricaVehiculo fabricaGas = new FrabricaVehiculosGasolina();
        Auto auto = fabricaGas.crearAuto();
        Moto moto = fabricaGas.crearMoto();
        auto.manejar();
        moto.manejar();

        System.out.println("----------------------------");
        FabricaVehiculo fabricaElectrica = new FabricaVehiculosElectricos();
        Auto auto2 = fabricaElectrica.crearAuto();
        Moto moto2 = fabricaElectrica.crearMoto();
        auto2.manejar();
        moto2.manejar();
    }
}
