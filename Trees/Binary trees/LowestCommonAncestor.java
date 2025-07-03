public class LowestCommonAncestor {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node LCA(Node root, Node p, Node q){
        if(root == null){
            return null;
        }
        if (root == p || root == q) {
            return root;
        }

          //DFS
        Node left = LCA(root.left, p, q);
        Node right = LCA(root.right, p, q);

        if(left == null){
            return right;
        }else if(right == null){
            return left;
        }
        return root;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        //    1
        //   / \
        //  2   3
        // / \ / \
        // 4 5 6 7

        // Assign references to the nodes you want to pass
        Node p = root.left.left;  // Node with value 4
        Node q = root.left.right; // Node with value 5


       System.out.println("LCA is: " + LCA(root, p, q).data);
    }
}
