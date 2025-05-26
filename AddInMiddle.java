public class AddInMiddle {
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
     public static void addfirst(int data){
        //step1=create new node
        Node newnode =  new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }

        //step 2
        newnode.next= head;//link

        //step 3
        head=newnode;

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void AddMiddleInLinkedlist(int idx,int data) {
           if(idx==0){
            addfirst(data);

        }
        Node newnode=new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp =temp.next;
            i++;
        }

        //i=idx-1; temp ->prev
        newnode.next=temp.next;
        temp.next=newnode;
    }

    public static void main(String args[]) {
        AddInMiddle.AddMiddleInLinkedlist(1,2);
        AddInMiddle.AddMiddleInLinkedlist(2,21);
        AddInMiddle.print();
    }
}
