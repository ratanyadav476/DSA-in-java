import java.util.*;

public class binaryTreeConcept {
    static class Node {
        int data;
        Node Left;
        Node Right;

        Node(int data) {
            this.data = data;
            this.Left = null;
            this.Right = null;
        }

        // Inner static class BinaryTree
        static class BinaryTree {
            static int idx = -1;

            public Node BuldTree(int nodes[]) {
                idx++;
                if (nodes[idx] == -1) {
                    return null;
                }
                Node newNode = new Node(nodes[idx]);
                newNode.Left = BuldTree(nodes);
                newNode.Right = BuldTree(nodes);
                return newNode;
            }

            public void preOrder(Node root) {
                if (root == null) {
                    return;
                }
                System.out.print(root.data + " ");
                preOrder(root.Left);
                preOrder(root.Right);
            }

            // public static void prostOrder(Node root) {
            // if (root == null) {
            // return;
            // }
            // preOrder(root.Left);
            // preOrder(root.Right);
            // System.out.println(root.data + " ");
            // }
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // Access BinaryTree as Node.BinaryTree
        Node.BinaryTree tree = new Node.BinaryTree();
        Node root = tree.BuldTree(nodes);
        System.out.println(root.data); // This should print 1 (the root data)
        tree.preOrder(root);
        System.out.println();
        // tree.prostOrder(root);
    }
}
