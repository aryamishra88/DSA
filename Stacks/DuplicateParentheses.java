package Stacks;
import java.util.*;

public class DuplicateParentheses {
    public static Boolean duplicateP(String s){
        Stack <Character> st=new Stack<>();
       
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=')'){
                st.push(ch);


            }else {
                int count=0;
                while(st.peek()!='('){
                    count++;
                    st.pop();
                }
                if(count<1){
                    return true;
                }else{
                    st.pop();
                }
            }
        }
            return false;
    }
    
    public static void main(String args[]){
        String str="((a+b))";
        String str2="(a+b)";
        System.out.println(duplicateP(str2));

    }
    
}
