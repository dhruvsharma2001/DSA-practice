public class MinimumDistanceBetweenTwoNodes {
     public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
     public static Node LCA(Node root, int p, int q){
        if(root == null){
            return null;
        }
        if (root.data == p || root.data == q) {
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
    public static int LcaDistance(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = LcaDistance(root.left, n);
        int rightDist = LcaDistance(root.right, n);

        if(leftDist == -1  && rightDist == -1){
            return -1;
        }else if( leftDist == -1){
            return rightDist + 1;
        }else{
            return leftDist + 1;
        }
    }
    public static int MinDistance(Node root, int n1, int n2){
        Node lca = LCA(root, n1, n2);
        int leftDist = LcaDistance(lca, n1);
        int rightDist = LcaDistance(lca, n2);
        return leftDist + rightDist;
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


       System.out.println(MinDistance(root, 4, 7));
    }
}
