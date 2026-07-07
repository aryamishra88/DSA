package Stacks;

public class StackImplementationLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head=null;
        public static Boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;

        }
        public static int peek(){
            return head.data;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int val=head.data;
            head=head.next;
            return val;
        }

    }
    public static void man(String args[]){
        
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        while(!Stack.isEmpty()){
            System.out.println(Stack.peek());
            Stack.pop();

        }
        
    }
}
