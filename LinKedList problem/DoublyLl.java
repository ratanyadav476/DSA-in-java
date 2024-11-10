public class DoublyLl {
    public class Node {
        int data;
        Node Next;
        Node Prev;

        public Node(int data) {
            this.data = data;
            this.Next = null;
            this.Prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public int size;

    public void addFirsth(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.Next = head;
        head.Prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.Prev = tail;
        tail.Next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-->");
            temp = temp.Next;
        }
        System.out.println();

    }

    public int removeFirsth() {
        if (head == null) {
            System.out.println("dll is empity");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;

        }
        int val = head.data;
        head = head.Next;
        head.Prev = null;
        size--;
        return val;
    }

    public int removeLast() {
        if (head == null) {
            System.out.println("dll is empity");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;

        }
        int val = head.data;
        tail.Prev = null;
        tail = tail.Prev;
        size--;
        return val;
    }

    public static void main(String[] args) {
        DoublyLl dll = new DoublyLl();
        dll.addFirsth(3);
        dll.addFirsth(2);
        dll.addFirsth(1);
        dll.addLast(4);
        dll.addLast(5);
        // System.out.println(dll);

        dll.print();
        System.out.println(dll.size);
        dll.removeFirsth();
        dll.removeLast();
        dll.print();

    }
}
