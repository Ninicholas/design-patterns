package comportamiento.Iterador;

public interface Iterator<T> {
    boolean hasNext();  // Verifica si hay más elementos en la colección
    T next();           // Devuelve el siguiente elemento
}
