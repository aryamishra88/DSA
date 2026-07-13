package Stacks;
import java.util.*;

public class ValidParenthesis {
    public static Boolean validity(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }else{
                // only closing brackets condition
                if(st.isEmpty()){
                    return false;
                }
                if((st.peek()=='('&&ch==')') // ()

                    ||(st.peek()=='{'&&ch=='}')
                    || (st.peek()=='['&&ch==']')){
                        st.pop();
                    }
                    else{
                        return false;
                    }
            }
              
        
        }
        if(!st.isEmpty()){
            return false;

        }
           
        return true;

    }
    public static void main(String args[]){
        String s="({[(}}})]}())";
        
        System.out.println(validity(s));
        

    }
    
}
