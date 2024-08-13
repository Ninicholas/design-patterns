package comportamiento.observador;

public class testObservador {
    public static void main(String[] args) {
        EstacionMeteorologica estacion = new EstacionMeteorologica();

        DispositivoMovil movil = new DispositivoMovil("Teléfono Móvil");
        Computadora computadora = new Computadora("Computadora");
        Tableta tableta = new Tableta("Tableta");

        estacion.agregarObservador(movil);
        estacion.agregarObservador(computadora);
        estacion.agregarObservador(tableta);

        System.out.println("------------------------------------------------------------");
        estacion.setEstado("Tormenta en camino");
        estacion.eliminarObservador(movil);
        System.out.println("------------------------------------------------------------");
        estacion.setEstado("Temperatura alta");
        System.out.println("------------------------------------------------------------");
    }
}
