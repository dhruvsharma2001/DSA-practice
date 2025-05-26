public class AddFirst {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
       public static void print(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;

        }
        System.out.println("null");

    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void AddFirstInLinkedlist(int data){
        //create a new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    } 
    public static void main(String args[]){
        AddFirst.AddFirstInLinkedlist(2);
        AddFirst.AddFirstInLinkedlist(21);
        AddFirst.print();
    }
}
