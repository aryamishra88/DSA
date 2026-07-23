package Queues;
import java.util.*;

public class QueueUsingStack {
    static class QueueB{

        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        public static boolean isEmpty(){
            return s1.isEmpty()&&s2.isEmpty();
        }
        public static void push(int x){
            s1.push(x);
        }
        public static int pop(){
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            return s2.pop();
        }
        public static int peek(){
            if(s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
             return s2.peek();
        }

        
    }
    public static void main(String args[]){
        QueueB q=new QueueB();
        q.push(10);
        q.push(20);
        q.push(30);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.pop();
        }
        
    

        
    }
}
        

    
    
    
    

