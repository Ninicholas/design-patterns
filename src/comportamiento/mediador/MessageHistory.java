package comportamiento.mediador;

import java.util.ArrayList;
import java.util.List;

class MessageHistory {
    private List<String> messageHistory = new ArrayList<>();

    public void addMessage(String message) {
        messageHistory.add(message);
    }

    public void showHistory() {
        System.out.println("Historial de mensajes:");
        for (String msg : messageHistory) {
            System.out.println(msg);
        }
    }
}