public class DiameterOfBinaryTree {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(rh, lh) + 1;
    }

    public static int diameterOfBinaryTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftdiam = diameterOfBinaryTree(root.left);
        int lefth = height(root.left);
        int rightdiam = diameterOfBinaryTree(root.right);
        int righth = height(root.right);

        int selfdiam = lefth + righth;
        return Math.max(selfdiam, Math.max(leftdiam, rightdiam));
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //        1
        //      /   \
        //    2       3
        //   / \     / \
        //  4   5   6   7

        System.out.println(diameterOfBinaryTree(root));
    }
}
