package Strings;

public class Sub_string {
    public static String substring(String str,int si,int ei){
        String newStr="";
        for(int i=si;i<=ei;i++){
            newStr+=str.charAt(i);

        }
        return newStr;
    }
    public static void main(String args[]){
        String str="HelloWorld";
        System.out.println(str.substring(0,5));
        System.out.println(substring(str,3,6));
    }
    
}
