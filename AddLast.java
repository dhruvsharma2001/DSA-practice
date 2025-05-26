public class AddLast {
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

    public static void AddLastInLinkedlist(int data) {
        // create a new node
        Node newNode = new Node(data);
        size++;
        if (head == tail) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode = tail;
    }

    public static void main(String args[]) {
        AddLast.AddLastInLinkedlist(2);
        AddLast.AddLastInLinkedlist(21);
        AddLast.print();
    }
}
