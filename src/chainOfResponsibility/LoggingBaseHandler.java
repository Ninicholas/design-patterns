package chainOfResponsibility;

class LoggingBaseHandler extends BaseHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("LOG")) {
            System.out.println("Manejador de Registro: Procesando solicitud de registro");
        } else {
            super.handleRequest(request);
        }
    }
}