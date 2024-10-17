public class Binarysearch {
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

    public static boolean SearchKey(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return SearchKey(root.left, key);
        } else {
            return SearchKey(root.right, key);
        }

    }

    public static Node Insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = Insert(root.left, val);
        } else {
            root.right = Insert(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        int value[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < value.length; i++) {
            root = Insert(root, value[i]);
        }
        inOrder(root);
        System.out.println();
        if (SearchKey(root, 2)) {
            System.out.println("key found ");
        } else {
            System.out.println("key not Found");
        }
    }
}
