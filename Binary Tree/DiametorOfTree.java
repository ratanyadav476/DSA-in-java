import java.util.*;

public class DiametorOfTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int Height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = Height(root.left);
        int rh = Height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int Diametor(Node root) {
        if (root == null) {
            return 0;
        }
        int ld = Diametor(root.left);
        int lh = Height(root.left);
        int rd = Diametor(root.right);
        int rh = Height(root.right);
        int selfdia = lh + rh + 1;
        return Math.max(selfdia, Math.max(ld, rd));
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(Diametor(root));
    }

}