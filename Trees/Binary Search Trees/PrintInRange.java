import java.util.*;

public class PrintInRange {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }
    }
    
    public static void printinrange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printinrange(root.left, k1, k2);
            System.out.println(root.data + " ");
            printinrange(root.right, k1, k2);

        } else if (root.data < k1) {
            printinrange(root.left, k1, k2);

        } else {
            printinrange(root.right, k1, k2);

        }
    }

    public int rangeSumBST(Node root, int low, int high) {
        if (root == null)
            return 0;

        int sum = 0;

        if (root.data > low) {
            sum += rangeSumBST(root.left, low, high);
        }

        if (root.data >= low && root.data <= high) {
            sum += root.data;
        }

        if (root.data < high) {
            sum += rangeSumBST(root.right, low, high);
        }

        return sum;
    }

    private static void helper(Node root, int low, int high, ArrayList<Integer> ans) {
        if (root == null)
            return;

        if (root.data > low) {
            helper(root.left, low, high, ans);
        }

        if (root.data >= low && root.data <= high) {
            ans.add(root.data);
        }

        if (root.data < high) {
            helper(root.right, low, high, ans);
        }
    }

    // Function to return a list of BST elements in a given range.
    public static ArrayList<Integer> printNearNodes(Node root, int low, int high) {
        ArrayList<Integer> ans = new ArrayList<>();
        helper(root, low, high, ans);
        return ans;
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
