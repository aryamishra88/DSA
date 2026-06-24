package Strings.StringAssignment;
import java.util.*;;

public class Ques4 {
    public static Boolean anagrams(String first,String second){
        if(first.length()!=second.length()){
            return false;
        }
        int freq1[]=new int[26];
        for(int i=0;i<first.length();i++){
            freq1[first.charAt(i)-'a']++;
        }
        for(int i=0;i<second.length();i++){
            freq1[second.charAt(i)-'a']--;
        }
        for(int num:freq1){
            if(num!=0)return false;

        }

        return true;


        
        }

    
    public static void main(String args[]){
        System.out.println(anagrams("race","care"));

    }
    
}
