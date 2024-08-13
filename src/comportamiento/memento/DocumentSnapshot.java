package comportamiento.memento;

public class DocumentSnapshot {
    private final String content;

    public DocumentSnapshot(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
