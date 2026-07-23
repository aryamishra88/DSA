package Queues;
import java.util.*;
public class InterleavesQueue {
    public static Queue<Integer> interQueue(Queue<Integer> q){
        int size=q.size();
        int n=size/2;
        int i=0;
        Queue<Integer>q1=new ArrayDeque<>();
        while(i!=n){
            int temp=q.remove();
            q1.add(temp);
            i++;
        }
        while(!q1.isEmpty()){
            int temp=q.remove();
            q.add(q1.remove());
            
            q.add(temp);

        }
        return q;
        }
    public static void main(String args[]){
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=1;i<=10;i++){
            q.add(i);
        }
        Queue <Integer>ans=interQueue(q);
        while(!ans.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
    
}
