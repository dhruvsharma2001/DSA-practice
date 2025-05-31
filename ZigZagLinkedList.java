public class ZigZagLinkedList {
      public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
        public static void zigzag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast!= null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;
        }
        Node mid = slow;

        //2nd half reverse
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev = curr;
        curr = next;
         }

         Node left = head;
         Node right = prev;
         Node nextl,nextr;

         //alt merge-zig-zag
         while(left!=null && right!=null){
            nextl=left.next;
            left.next=right;
            nextr=right.next;
            right.next=nextl;

            left = nextl;
            right = nextr;

         }

    }
     public static void main(String args[]) {
        ZigZagLinkedList.zigzag();
    }
}
