package comportamiento.mediador;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {
    private final List<User> users;
    private final MessageHistory messageHistory;
    private final Notification notification;

    public ChatMediator() {
        this.users = new ArrayList<>();
        this.messageHistory = new MessageHistory();
        this.notification = new Notification(); // Instancia de Notification
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        messageHistory.addMessage(message); // Añade el mensaje al historial
        for (User u : this.users) {
            if (u != user) {
                u.receive(message);
            }
        }
        notification.notifyUser(); // Notifica a los usuarios sobre el nuevo mensaje
    }

    @Override
    public void showHistory() {
        messageHistory.showHistory();
    }
}