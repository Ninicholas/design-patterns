package comportamiento.mediador;

class User {
    private Mediator mediator;
    private String name;

    public User(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public void send(String message) {
        System.out.println(this.name + " envía: " + message);
        mediator.sendMessage(message, this);
    }

    public void receive(String message) {
        System.out.println(this.name + " recibe: " + message);
    }
}
