import java.util.*;
import java.util.LinkedList;

public class StackImpleUsingDeque {
    public class stack {
        static Deque<Integer> deque = new LinkedList<>();

        public static void push(int data) {
            deque.addLast(data);
        }

        public static int pop() {
            return deque.removeLast();
        }

        public static int peek() {
            return deque.getLast();
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
    }
}
