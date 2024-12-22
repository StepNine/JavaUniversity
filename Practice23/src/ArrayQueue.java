public class ArrayQueue<T> extends AbstractQueue<T> {
    private static final int INITIAL_CAPACITY = 10;
    private T[] elements;
    private int head = 0;
    private int tail = 0;

    @SuppressWarnings("unchecked")
    public ArrayQueue() {
        elements = (T[]) new Object[INITIAL_CAPACITY];
    }

    @Override
    public void enqueue(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T data = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return data;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[head];
    }

    private void resize() {
        @SuppressWarnings("unchecked")
        T[] newElements = (T[]) new Object[elements.length * 2];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[(head + i) % elements.length];
        }
        head = 0;
        tail = size;
        elements = newElements;
    }
}
