package Queues;

public class ArrayCQ {
    static class QueuesB{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        QueuesB(int n){
            arr=new int [n];
            size=n;
            rear=-1;
            front=-1;

        }
        public static boolean isEmpty(){
            return front==-1;
        }

        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return ;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty queue");
                return -1;
            }
            int result=arr[front];
            if(rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }

            
            
            
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String args[]){
        QueuesB q=new QueuesB(5);
        QueuesB.add(1);
        QueuesB.add(2);
        QueuesB.add(3);
        QueuesB.add(4);
        QueuesB.add(5);
        while(!QueuesB.isEmpty()){
            System.out.print(QueuesB.peek() +" ");
            QueuesB.remove();
        }


    }
    
}
