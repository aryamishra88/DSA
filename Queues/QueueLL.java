package Queues;

public class QueueLL {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class QueueB{
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head==null&&tail==null;
        }
        public static void add(int data){
            Node newNode= new Node(data);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public static int remove(){
            if(head==null){
            return -1;
            }
            int result=head.data;
            if(head==tail){
                head=tail=null;
            }else{
                head=head.next;
            }
            return result;


        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
        public static void main(String args[]){
            QueueB q=new QueueB();
            q.add(1);
            q.add(2);
            q.add(3);
            q.remove();
            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
    
}
