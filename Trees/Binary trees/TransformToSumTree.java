public class TransformToSumTree {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
      public static int Transform(Node root){
                if(root == null){
                    return 0;
                }
                
                int leftchild = Transform(root.left);
                int rightchild = Transform(root.right);
    
                int data = root.data;

                int newleft = root.left == null? 0 : root.left.data;
                int newright = root.right == null? 0 : root.right.data;
                root.data = newleft + leftchild + newright + rightchild;
                return data;
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


       System.out.println(Transform(root));
    }
}
