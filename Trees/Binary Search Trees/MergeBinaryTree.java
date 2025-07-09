public class MergeBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;

        }
    }
     public static Node mergeTrees(Node root1, Node root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        Node merged = new Node(root1.data + root2.data);
        merged.left = mergeTrees(root1.left, root2.left);
        merged.right = mergeTrees(root1.right, root2.right);
        return merged;
    }
     public static void main(String args[]){
        
            Node root1 = new Node(2);
            root1.left = new Node(1);
            root1.right = new Node(4);
    
            Node root2 = new Node(9);
            root2.left = new Node(3);
            root2.right = new Node(12);
    
            Node root = mergeTrees(root1, root2);
        }
}
