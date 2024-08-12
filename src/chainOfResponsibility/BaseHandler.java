package chainOfResponsibility;

abstract class BaseHandler implements Handler {
    private Handler next;

    @Override
    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    @Override
    public void handleRequest(String request) {
        if (next != null) {
            next.handleRequest(request);
        }
    }
}
