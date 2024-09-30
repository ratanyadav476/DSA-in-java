
public class CountOfNodes {
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

    public static int CountOfNode(Node root) {
        if (root == null) {
            return 0;
        }
        int LeftNode = CountOfNode(root.left);
        int RightNode = CountOfNode(root.right);
        return LeftNode + RightNode + 1;
    }

    public static int SumOfNode(Node root) {
        if (root == null) {
            return 0;
        }
        int LeftSum = SumOfNode(root.left);
        int RightSum = SumOfNode(root.right);
        return LeftSum + RightSum + root.data;
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
        System.out.println(CountOfNode(root));
        System.out.println(SumOfNode(root));
    }
}
