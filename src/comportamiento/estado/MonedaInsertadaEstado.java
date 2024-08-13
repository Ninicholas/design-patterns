package comportamiento.estado;

public class  MonedaInsertadaEstado implements Estado {
    private final MaquinaExpendedora maquina;

    public MonedaInsertadaEstado(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insertarMoneda() {
        System.out.println("Ya has insertado una moneda.");
    }

    @Override
    public void ejecutar() {
        System.out.println("Producto entregado.");
        maquina.setEstado(maquina.getProductoEntregadoEstado());
    }

    @Override
    public void entregarProducto() {
        System.out.println("No se puede entregar el producto antes de ejecutar.");
    }
}