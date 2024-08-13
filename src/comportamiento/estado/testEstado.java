package comportamiento.estado;

public class testEstado {
    public static void main(String[] args) {
        MaquinaExpendedora maquina = new MaquinaExpendedora();

        // Ciclo de uso de la máquina expendedora
        maquina.insertarMoneda();
        maquina.ejecutar();
        maquina.entregarProducto();

        System.out.println("\nOtro ciclo:\n");

        // Intentar interactuar con la máquina sin insertar moneda
        maquina.ejecutar();
        maquina.entregarProducto();
        maquina.insertarMoneda();
    }
}
