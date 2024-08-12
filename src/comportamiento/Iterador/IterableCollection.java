package comportamiento.Iterador;

interface IterableCollection<T> {
    Iterator<T> createIterator(String orderType);
}