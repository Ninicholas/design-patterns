package comportamiento.chainOfResponsibility;

class ErrorBaseHandler extends BaseHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("ERROR")) {
            System.out.println("Manejador de Errores: Procesando solicitud de error");
        } else {
            super.handleRequest(request);
        }
    }
}