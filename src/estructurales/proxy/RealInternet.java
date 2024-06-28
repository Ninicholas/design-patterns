package estructurales.proxy;

class RealInternet implements Internet {
    @Override
    public void connectTo(String serverhost) {
        System.out.println("Conectando a " + serverhost);
    }
}
