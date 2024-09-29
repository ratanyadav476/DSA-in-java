public class CalculateHeight {
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
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);
        int maxHeight = Math.max(leftHeight, rightHeight) + 1;
        return maxHeight;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(Height(root));
        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.BuldTree(nodes);
        // System.out.println(tree.Height(root));

    }
}
