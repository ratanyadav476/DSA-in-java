public class CircularQueue {
    static class Queue {
        static int arr[];
        static int size;
        static int rare;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rare = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rare == -1 && front == -1;
        }

        public boolean isFull() {
            return (rare + 1) % size == front;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.print("queue is full");
                return;
            }

            if (front == -1) {
                front = 0;
            }

            rare = (rare + 1) % size;
            arr[rare] = data;

        }

        public int remove() {
            if (isEmpty()) {
                System.out.print("queue is empty");
                return -1;
            }
            int result = arr[front];
            if (front == rare) {
                front = rare = -1;
            } else {

                front = (front + 1) % size;
            }
            return result;

        }

        public int peek() {
            if (isEmpty()) {
                System.out.print("empty queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
