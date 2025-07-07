public class DeleteNodeInBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }
    }
    
    public static Node FindInorder(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public static Node Delete(Node root, int val) {
        if (root.data < val) {
            root.right = Delete(root.right, val);
        } else if (root.data > val) {
            root.left = Delete(root.left, val);
        } else {// voilla
                // case 1
            if (root.left == null && root.right == null) {
                return null;
            }

            // single child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 both children
            //The inorder successor of a node is the next node in the inorder traversal (i.e., left → root → right).
            //For any node, its inorder successor is the smallest value node in its right subtree.
            Node inOrderSuccessor = FindInorder(root.right);
            root.data = inOrderSuccessor.data;
            root.right = Delete(root.right, inOrderSuccessor.data);

        }
        return root;
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

        System.out.println(Delete(root, 7));

    }
}
