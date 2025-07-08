public class InvertBinarySearchTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }
    }
    public static Node Invert(Node root){
        if(root == null) return null;

        Node leftMirror = Invert(root.left);
        Node rightMirror = Invert(root.right);
        root.left = rightMirror;
        root.right = leftMirror;
        return root;

    }
    
    public static void Mirror(Node root) {
        if (root == null)
            return ;

        Mirror(root.left);
        Mirror(root.right);
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

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
