public class ValidateBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }
    }
    
    public static boolean Valid(Node root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.data >= max || root.data <= min)
            return false;
        return Valid(root.left, min, root.data) && Valid(root.right, root.data, max);
    }

    // Function to check whether a Binary Tree is BST or not.
    public static boolean isBST(Node root) {
        // code here.
        return Valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // 1
        // / \
        // 2 3
        // / \ / \
        // 4 5 6 7

        // Assign references to the nodes you want to pass
        Node p = root.left.left; // Node with value 4
        Node q = root.left.right; // Node with value 5

        System.out.println();

    }
}
