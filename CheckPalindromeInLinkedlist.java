public class CheckPalindromeInLinkedlist {
     public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void print() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");

    }

    public static Node head;
    public static Node tail;
    public static int size;
    public static Node findmid(Node head){
    Node slow=head;
    Node fast=head;

    while(fast!=null && fast.next!=null){
        slow = slow.next; //+1
        fast = fast.next.next;// +2
    }

    return slow; //slow is mid
}
    public static boolean Checkpalindrome() {
        if(head == null && head.next == null){
            return true;
        }
        //find mid
        Node midNode = findmid(head);
        //step 2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
               Node right = prev; //right half head
        Node left = head; //left half head

        //step 3 compare left and right half
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

     
    }

    public static void main(String args[]) {
        CheckPalindromeInLinkedlist.Checkpalindrome();
        CheckPalindromeInLinkedlist.print();
    }
}
