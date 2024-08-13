package comportamiento.mediador;

public class test {
    public static void main(String[] args) {
        Mediator mediator = new ChatMediator();

        User user1 = new User(mediator, "User1");
        User user2 = new User(mediator, "User2");
        User user3 = new User(mediator, "User3");
        User user4 = new User(mediator, "User4");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("¡Hola a todos!");
        user3.send("¡Hola User1!");

        mediator.showHistory();
    }
}
