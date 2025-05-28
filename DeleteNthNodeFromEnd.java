public class DeleteNthNodeFromEnd {
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

    public static void DeleteNth(int n) {
        //calculate size
       int sz = 0;
       Node temp = head;
       while(temp!=null){
        temp = temp.next;
        sz++;
       }

       if(n == sz){
        head = head.next;
        return;
       }

       int i= 1;
       int itoFind = sz-n;
       Node prev = head;
       while(i<itoFind){
        prev = prev.next;
        i++;
       }
       prev.next = prev.next.next;
       return;
     
    }

    public static void main(String args[]) {
        DeleteNthNodeFromEnd.DeleteNth(2);
        DeleteNthNodeFromEnd.print();
    }
}
