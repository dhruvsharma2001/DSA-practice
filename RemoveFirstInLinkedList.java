public class RemoveFirstInLinkedList {
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

    public static int RemoveFirst(int data) {
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
       int val = head.data;
       head = head.next;
       size--;
       return val;
    }

    public static void main(String args[]) {
        RemoveFirstInLinkedList.RemoveFirst(2);
        RemoveFirstInLinkedList.RemoveFirst(21);
        RemoveFirstInLinkedList.print();
    }
}
