public class LargestBST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;

        }
    }
    
    static class NodeValue {
        int minNode, maxNode, maxSize;

        public NodeValue(int minNode, int maxNode, int maxSize) {
            this.minNode = minNode;
            this.maxNode = maxNode;
            this.maxSize = maxSize;
        }
    }

    public static  NodeValue helper(Node root) {
        if (root == null) {
            return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }

        NodeValue left = helper(root.left);
        NodeValue right = helper(root.right);

        if (left.maxNode < root.data && root.data < right.minNode) {
            return new NodeValue(Math.min(root.data, left.minNode),
                    Math.max(root.data, right.maxNode), left.maxSize + right.maxSize + 1);

        }

        return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(left.maxSize, right.maxSize));
    }

    // Return the size of the largest sub-tree which is also a BST
    public static int LargestBst(Node root) {
        // Write your code here
        return helper(root).maxSize;

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
