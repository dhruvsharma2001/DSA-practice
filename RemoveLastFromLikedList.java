public class RemoveLastFromLikedList {
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

    public static int RemoveLastInLinkedlist() {
        // create a new node
        if(size ==0){
           System.out.println("ll is empty");
           return Integer.MIN_VALUE;
       }else if(size == 1){
        int val= head.data;
        head = tail=null;
        size=0;
        return val;
       }
       Node prev = head;
       for(int i=0;i<size-2;i++){
        prev = prev.next;
       }
       int val = prev.next.data;
       prev.next = null;
       tail=prev;
       size--;
       return val;

      // [10] → [20] → [30] → null  
      // head = [10], tail = [30], size = 3
      // Calling removeLastInLinkedlist():
      // prev becomes [20]
      // val = 30
      // [20].next = null
      // tail = [20]
      // size = 2
      // returns 30
    }

    public static void main(String args[]) {
        RemoveLastFromLikedList.RemoveLastInLinkedlist();
        RemoveLastFromLikedList.RemoveLastInLinkedlist();
        RemoveLastFromLikedList.print();
    }
}
