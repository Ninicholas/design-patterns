package chainOfResponsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        // Crear los manejadores
        BaseHandler authBaseHandler = new AuthBaseHandler();
        BaseHandler loggingBaseHandler = new LoggingBaseHandler();
        BaseHandler errorBaseHandler = new ErrorBaseHandler();

        // Configurar la cadena: Auth -> Logging -> Error
        authBaseHandler.setNext(loggingBaseHandler).setNext(errorBaseHandler);

        // Enviar diferentes solicitudes
        authBaseHandler.handleRequest("AUXTH");  // Manejado por AuthBaseHandler
        authBaseHandler.handleRequest("LOG");   // Manejado por LoggingBaseHandler
        authBaseHandler.handleRequest("ERROR"); // Manejado por ErrorBaseHandler
        authBaseHandler.handleRequest("UNKNOWN"); // No manejado, pasa por toda la cadena sin acción
    }
}
