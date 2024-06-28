package estructurales.proxy;

import java.util.ArrayList;
import java.util.List;

// La clase ProxyInternet que también implementa la interfaz Internet
class ProxyInternet implements Internet {
    private RealInternet internet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ghi.com");
    }

    @Override
    public void connectTo(String serverhost) throws Exception {
        if (bannedSites.contains(serverhost.toLowerCase())) {
            throw new Exception("Acceso Denegado a " + serverhost);
        }

        internet.connectTo(serverhost);
    }
}