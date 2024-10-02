public class IssubTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (IsIdentitacal(root, subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }

    public static boolean IsIdentitacal(Node node, Node subRoot) {
        if (node.data == subRoot.data) {
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }
        if (IsIdentitacal(node.left, subRoot.left)) {
            return false;

        }
        if (IsIdentitacal(node.right, subRoot.right)) {
            return false;
        }
        return true;

    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(3);
        System.out.println(isSubtree(root, subRoot));
    }
}
