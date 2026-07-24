package Queues;
import java.util.*;

public class ReverseQueue {
    public static Queue<Integer> reverse(Queue<Integer>q){
        Stack<Integer>s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        return q;
    }
    public static void main(String args[]){
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
     
        q.add(4);
        q.add(5);
        Queue<Integer> ans=reverse(q);
        while(!ans.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }

    }
    
}
