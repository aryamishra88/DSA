package Queues;
import java.util.*;
public class NonRepeatingLetter {
    public static char [] nonRepeating(String s){
        char ans[]=new char[s.length()];
        int freq[]=new int[26];
        Queue<Character>q=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            q.add(ch);
            freq[s.charAt(i)-'a']++;
            
            
                while(!(q.isEmpty())&&(freq[q.peek()-'a']!=1)){
                    q.remove();
                }
                if(q.isEmpty()){
                    ans[i]='1';
                }else {
                    ans[i]=q.peek();
                }
            
            
        }
        
        
        

        
        return ans;


    }
    public static void main(String args[]){
        String str="aabccxb";
        char []ans=nonRepeating(str);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }

    }
    
}
