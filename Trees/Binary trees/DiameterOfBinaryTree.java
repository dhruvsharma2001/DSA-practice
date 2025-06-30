import java.util.*;
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
    public static int Diameter(Node root){
        if(root == null){
            return 0;
        }
        Stack<Node> s = new Stack<>();
        Map<Node, Integer> map = new HashMap<>();
        int diameter = 0;

        if(root!=null){
            s.push(root);
        }
        while(!s.isEmpty()){
            Node node = s.peek();

            //fill up stack to perform post order
            if(node.left!=null && !map.containsKey(node)){
                s.push(node.left);
            }
            else if(node.right != null && !map.containsKey(node)){
                s.push(node.right);
            }else{
                //process root once left and right
                s.pop();

                int leftDepth = map.getOrDefault(node.left, 0);
                int rightDepth = map.getOrDefault(node, 0);

                map.put(node, 1+ Math.max(leftDepth, rightDepth));
                diameter = Math.max(diameter, leftDepth+rightDepth);

            }
        }
        return diameter;

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

        System.out.println(Diameter(root));
    }
}
