package comportamiento.memento;

public class Editor {
    public static void main(String[] args) {
        Document document = new Document("Hola Mundo");
        DocumentHistory history = new DocumentHistory();

        // Editar el documento
        document.setContent("Hola Amigos");
        System.out.println("Documento editado: " + document.getContent());

        // Guardar el estado actual
        history.save(document);

        // Hacer otro cambio
        document.setContent("Adiós Amigos");
        System.out.println("Documento después de otro cambio: " + document.getContent());

        // Revertir al último estado guardado
        history.undo(document);
        System.out.println("Documento después de revertir: " + document.getContent());
    }
}

