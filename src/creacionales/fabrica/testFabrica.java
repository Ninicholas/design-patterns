package creacionales.fabrica;

public class testFabrica {
    public static void main(String[] args) {
        Logistica logisticaTerrestre = new LogisticaTerrestre();
        logisticaTerrestre.planificarEntrega();

        Logistica logisticaMarina = new LogisticaMarina();
        logisticaMarina.planificarEntrega();
    }
}
