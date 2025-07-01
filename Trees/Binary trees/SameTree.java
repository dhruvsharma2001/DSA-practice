public class SameTree {
     public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean IsIdentical(Node root, Node subRoot){
        if(root == null && subRoot == null){
            return true;
        }else if(root==null || subRoot == null || root.data != subRoot.data){
            return false;
        }
            return IsIdentical(root.left, subRoot.left) && IsIdentical(root.right, subRoot.right);
        
    } 
    public static void main(String args[]){
        Node root = new Node(2);
        root.left = new Node(4);
        root.right = new Node(5);

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        //        2
        //      /   \
        //    4       5

        System.out.println(IsIdentical(root, subroot));
    }
}
