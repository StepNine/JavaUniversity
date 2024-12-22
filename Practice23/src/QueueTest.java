public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> linkedQueue = new LinkedQueue<>();
        linkedQueue.enqueue(1);
        linkedQueue.enqueue(2);
        linkedQueue.enqueue(3);
        System.out.println("LinkedQueue вершина: " + linkedQueue.peek()); // 1
        System.out.println("LinkedQueue обратная очередь: " + linkedQueue.dequeue()); // 1
        System.out.println("LinkedQueue размер: " + linkedQueue.size()); // 2

        Queue<Integer> arrayQueue = new ArrayQueue<>();
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(5);
        arrayQueue.enqueue(6);
        System.out.println("ArrayQueue вершина: " + arrayQueue.peek()); // 4
        System.out.println("ArrayQueue обратная очередь: " + arrayQueue.dequeue()); // 4
        System.out.println("ArrayQueue размер: " + arrayQueue.size()); // 2
    }
}
