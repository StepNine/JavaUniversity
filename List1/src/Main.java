// Создание узла
class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}


class DoubleList {
    private Node head;
    private Node tail;


    public void addLast(int data) {  //добавление в конец
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Добавление в начало
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Убираем узел из списка
    public void remove(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }
                return;
            }
            current = current.next;
        }
    }

    //в прямом порядке
    public void Show() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    //в обратном порядке
    public void Reverse() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}


public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        //Добавление элементов
        list.addLast(3);
        list.addLast(5);
        list.addLast(1);

        System.out.println("Вывод в прямом порядке:");
        list.printForward();  //  3 5 1

        System.out.println("Вывод в обратном порядке:");
        list.printReverse();  // 1 5 3


        list.addFirst(9);
        System.out.println("После добавления 9:");
        list.printForward();  //  9 3 5 1


        list.remove(5);
        System.out.println("После удаления 5:");
        list.printForward();  //  9 3 1
    }
}
