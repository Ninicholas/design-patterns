package comportamiento.memento;

import java.util.Stack;

public class DocumentHistory {
    private Stack<DocumentSnapshot> snapshots = new Stack<>();

    public void save(Document document) {
        snapshots.push(document.createSnapshot());
    }

    public DocumentSnapshot getLastSnapshot() {
        return snapshots.peek();
    }

    public void undo(Document document) {
        if (!snapshots.isEmpty()) {
            document.restore(getLastSnapshot());
            snapshots.pop();
        }
    }
}
