import java.util.*;
public class PrintRootToLeafPath {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }
    }
    
    public static void PrintPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }
    public static void Root2LeafPath(ArrayList<Integer> path, Node root){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right == null){
            PrintPath(path);
        }

        Root2LeafPath(path, root.left);
        Root2LeafPath(path, root.right);
        path.remove(path.size()-1);
    }

    public static void Path(Node root, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> allPaths) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            allPaths.add(new ArrayList<>(path));
        }

        Path(root.left, path, allPaths);
        Path(root.right, path, allPaths);
        path.remove(path.size() - 1);
    }

    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> allPaths = new ArrayList<>();
        ArrayList<Integer> currentPath = new ArrayList<>();

        Path(root, currentPath, allPaths);

        return allPaths;
    }
    
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // 1
        // / \
        // 2 3
        // / \ / \
        // 4 5 6 7

        // Assign references to the nodes you want to pass
        Node p = root.left.left; // Node with value 4
        Node q = root.left.right; // Node with value 5

        System.out.println();

    }
}
