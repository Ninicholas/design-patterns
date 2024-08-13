package comportamiento.estado;

public class MaquinaExpendedora {
    private final Estado sinMonedaEstado;
    private final Estado monedaInsertadaEstado;
    private final Estado productoEntregadoEstado;

    private Estado estadoActual;

    public MaquinaExpendedora() {
        sinMonedaEstado = new SinMonedaEstado(this);
        monedaInsertadaEstado = new MonedaInsertadaEstado(this);
        productoEntregadoEstado = new ProductoEntregadoEstado(this);

        estadoActual = sinMonedaEstado;
    }

    public void insertarMoneda() {
        estadoActual.insertarMoneda();
    }

    public void ejecutar() {
        estadoActual.ejecutar();
    }

    public void entregarProducto() {
        estadoActual.entregarProducto();
    }

    public void setEstado(Estado estado) {
        this.estadoActual = estado;
    }

    public Estado getSinMonedaEstado() {
        return sinMonedaEstado;
    }

    public Estado getMonedaInsertadaEstado() {
        return monedaInsertadaEstado;
    }

    public Estado getProductoEntregadoEstado() {
        return productoEntregadoEstado;
    }
}
