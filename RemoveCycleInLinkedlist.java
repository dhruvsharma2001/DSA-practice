public class RemoveCycleInLinkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


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
    public static boolean iscycle(){
         Node  slow = head; 
        Node fast = head;
        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;//cycle exist
            }

        }
        return false;//cycle doesnt
    }
    public static void RemoveCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;//cycle exist
            }
        }
            if(cycle==false){
                return;
            }
            //find meeting point
            
            slow=head;
            Node prev = null;//last Node
            while(slow!=fast){
                prev = fast;
                slow = slow.next;
                fast= fast.next;
            }
            prev.next = null;

    }

    public static void main(String args[]) {
        RemoveCycleInLinkedlist.RemoveCycle();
        RemoveCycleInLinkedlist.print();
    }
}
