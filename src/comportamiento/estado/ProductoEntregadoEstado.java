package comportamiento.estado;

public class ProductoEntregadoEstado implements Estado {
    private final MaquinaExpendedora maquina;

    public ProductoEntregadoEstado(MaquinaExpendedora maquina) {
        this.maquina = maquina;
    }

    @Override
    public void insertarMoneda() {
        System.out.println("Por favor espera, entregando el producto.");
    }

    @Override
    public void ejecutar() {
        System.out.println("Producto ya ha sido entregado.");
    }

    @Override
    public void entregarProducto() {
        System.out.println("Por favor recoge tu producto.");
        maquina.setEstado(maquina.getSinMonedaEstado());
    }
}