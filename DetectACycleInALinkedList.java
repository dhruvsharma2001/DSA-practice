public class DetectACycleInALinkedList {
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
        Node slow = head;
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

    public static void main(String args[]) {
        DetectACycleInALinkedList.iscycle();
        DetectACycleInALinkedList.print();
    }
}
