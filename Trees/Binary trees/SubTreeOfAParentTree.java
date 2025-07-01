public class SubTreeOfAParentTree {
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
    public static boolean IsSubTree(Node root, Node subRoot){
        if(root ==null ){
            return false;
        }
        if(root.data == subRoot.data){
            if(IsIdentical(root, subRoot)){
                return true;
            }
        }

        boolean leftAns = IsSubTree(root.left,subRoot);//left subtree true
        boolean rightAns = IsSubTree(root.right,subRoot);//right subtree true

        return leftAns || rightAns;
    }
    public static void main(String args[]){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        //        2
        //      /   \
        //    4       5

        System.out.println(IsSubTree(root, subroot));
    }
}
