package LinkedLists;
public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public static Node head;
        public static Node tail;
        public void addFirst(int data){
            // Create newNode
            Node newNode=new Node(data);
            // If LinkedList is nul
            if(head==null){
                head=tail=newNode;
                return;
            }
            //step2 - newNode next =null;
            newNode.next=head;
            // step3 - head=newNode
            head=newNode;
        }



        //     O(n)



        // public void addLast(int data,Node head){
        //     Node newNode=new Node(data);
        //     if(head==null){
        //         head=tail=newNode;
        //         return ;
        //     }
        //     Node temp=head;
        //     while(temp.next!=null){
        //         temp=temp.next;
        //     }
        //     temp.next=newNode;
        // }



        //   O(1)

        public void addLast(int data){
            Node newNode = new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public void printList(){
            if(head==null){
                System.out.println("Linked list is empty..");
                return;
            }
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");

        }

        public void addAtMiddle(int data,int index){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                return;

            }
            int count=0;
            Node temp=head;
            while(count!=index-1){
                temp=temp.next;
                count++;

            }
            
            newNode.next=temp.next;
            temp.next=newNode;
        }
        public static void main(String args[]){
        LinkedList ll=new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.printList();
        ll.addAtMiddle(5, 1);
        ll.printList();
    
    }
}
