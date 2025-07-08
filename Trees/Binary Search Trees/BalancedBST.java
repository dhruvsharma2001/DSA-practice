public class BalancedBST {
        static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;

        }
    }
    //-----------------PREORDER------------------
    public static void PreOrder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }
    //-------------------BALANCED BST--------------
    public static Node CreateBST(int arr[], int st, int end){
        if(st>end){
            return null;
        }
        int mid =(st+end)/2;
        Node root = new Node(arr[mid]);
        root.left = CreateBST(arr, st, mid-1);
        root.right = CreateBST(arr, mid+1, end);
        return root;
    }
    public static void main(String args[]){
        int arr[] = {3, 5, 6, 8, 10, 11, 12};

        Node root = CreateBST(arr, 0, arr.length-1);
        PreOrder(root);

    }
}
