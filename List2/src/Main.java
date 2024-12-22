//Создание узла для списка
class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

// Сортировка
class SinglyLinkedList {
    private ListNode head;

    // Добавление нового элемента
    public void add(int data) {
        if (head == null) {
            head = new ListNode(data);
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(data);
        }
    }

    // Рекусивная сортировка
    public void sort() {
        head = mergeSort(head);
    }

    // сортировка поглощением
    private ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode middle = getMiddle(head);
        ListNode nextToMiddle = middle.next;
        middle.next = null;
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(nextToMiddle);
        return merge(left, right);
    }

    private ListNode getMiddle(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode slow = head, fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private ListNode merge(ListNode left, ListNode right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        ListNode result;

        if (left.data <= right.data) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
    }

    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(4);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(5);

        System.out.println("Искомый список:");
        list.printList(); //  4 2 8 1 5

        list.sort();

        System.out.println("Отсортированный список:");
        list.printList(); // 1 2 4 5 8
    }
}
