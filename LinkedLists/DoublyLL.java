package LinkedLists;

public class DoublyLL {
    
    public class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        

    }
    public void printLinkedList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int removeFirst(){
        if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(head.next==null){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;

    }
    public void  reverse(){
        Node curr=head;
        Node prevs=null;
        Node Next;
        while(curr!=null){
            Next=curr.next;
            curr.next=prevs;
            curr.prev=Next;
            prevs=curr;
            curr=Next;
            


        }
        head=prevs;

    }
    public static void main(String args[]){
        DoublyLL dll=new DoublyLL();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.printLinkedList();
        System.out.println(size);
        dll.removeFirst();
        dll.printLinkedList();
        System.out.println(size);
        dll.reverse();
        dll.printLinkedList();
        
        




    }
}
