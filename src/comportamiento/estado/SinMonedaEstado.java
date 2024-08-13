package comportamiento.estado;

public class SinMonedaEstado implements Estado {
    private final MaquinaExpendedora maquina;

    public SinMonedaEstado(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insertarMoneda() {
        System.out.println("Moneda insertada.");
        maquina.setEstado(maquina.getMonedaInsertadaEstado());
    }

    @Override
    public void ejecutar() {
        System.out.println("Primero debes insertar una moneda.");
    }

    @Override
    public void entregarProducto() {
        System.out.println("Primero debes insertar una moneda.");
    }
}