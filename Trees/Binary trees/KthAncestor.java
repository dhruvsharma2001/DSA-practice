public class KthAncestor {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int Ancestor(Node root, int n, int k){  //POST order DFS
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int leftDist = Ancestor(root.left, n, k);  //step 1 -> first traverse  left subtree
        int rightDist = Ancestor(root.right, n, k);  //step 2 -> then traverse right subtree

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }
        int max = Math.max(leftDist, rightDist);
        if(max+1 == k){
            System.out.println(root.data);  // step 3 -> proccess the root
        }
        return max+1;




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


       System.out.println(Ancestor(root, 4, 2));
    }
}
