import java.util.Iterator;

public class Linked_List<T> implements Iterable<T> {

    Node head;

    Linked_List() {
        head = null;
    }

    class Node {
        T data;
        Node next;

        Node(T val) {
            data = val;
            next = null;
        }
    }

    public void insert_beginning(T val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void insert_at_pos(T val, int pos) {
        if (pos == 0) {
            insert_beginning(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void delete_at_beginning() {
        if (head != null) {
            head = head.next;
        }
    }

    public void delete_at_pos(int pos) {
        if (pos == 0) {
            delete_at_beginning();
            return;
        }

        Node temp = head;
        Node prev = null;

        for (int i = 1; i <= pos; i++) {
            prev = temp;
            temp = temp.next;
        }
        if (temp != null) {
            prev.next = temp.next;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    public static void main(String[] args) {
        Linked_List<Integer> list1 = new Linked_List<>();
        list1.insert_beginning(9);
        list1.insert_beginning(5);
        list1.insert_beginning(7);
        list1.display();

        list1.insert_at_pos(45, 2);
        list1.display();

        list1.delete_at_pos(1);
        list1.display();
    }
}
