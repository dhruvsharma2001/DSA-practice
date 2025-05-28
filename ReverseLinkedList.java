public class ReverseLinkedList {
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

    public static void Reverse() {
        // create a new node
        Node prev = null;
        Node curr = head = tail;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
     
    }

    public static void main(String args[]) {
        ReverseLinkedList.Reverse();
        ReverseLinkedList.Reverse();
        ReverseLinkedList.print();
    }
}
