package chainOfResponsibility;

class AuthBaseHandler extends BaseHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("AUTH")) {
            System.out.println("Manejador de Autenticación: Procesando solicitud de autenticación");
        } else {
            super.handleRequest(request);
        }
    }
}


