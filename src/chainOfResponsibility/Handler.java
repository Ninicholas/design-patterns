package chainOfResponsibility;

public interface Handler {
    Handler setNext(Handler next);
    void handleRequest(String request);
}
