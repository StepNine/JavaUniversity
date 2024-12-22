public interface Queue<T> {
    void enqueue(T element); // Добавить элемент в очередь
    T dequeue(); // Удалить элемент из очереди
    T peek(); // Вернуть первый элемент без удаления
    boolean isEmpty(); // Проверка, пуста ли очередь
    int size(); // Размер очереди
}
