import java.util.*;
public class TopViewOfBinaryTree {
    public static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static class Info{
        int hd;
        Node node;
        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;  //Horizontal distance from root 
        }
    }
    public static ArrayList<Integer> TopView(Node root){  //Using Level Order Traversal
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<Info> q = new LinkedList<Info>();
        Map<Integer, Node> map = new TreeMap<>();

        q.add(new Info(root, 0));
        while(!q.isEmpty()){    //starting of BFS
            Info curr = q.remove(); 

            if(!map.containsKey(curr.hd)){
                map.put(curr.hd, curr.node);
            }

            if(curr.node.left !=null){
                q.add(new Info(curr.node.left, curr.hd-1));
            }
            if(curr.node.right != null){
                q.add(new Info(curr.node.right, curr.hd+1));
            }
        }  //ending of BFS
        for(Map.Entry<Integer, Node> entry:map.entrySet()){
            ans.add(entry.getValue().data);
        }
        return ans;
    }
    public static void main(String[] args) {
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

        System.out.println(TopView(root));
    }
}
