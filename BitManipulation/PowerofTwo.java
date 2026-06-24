package BitManipulation;

public class PowerofTwo {
    public static Boolean power(int n){
        if((n&(n-1))==0){
            return true;
        }
        return false;

    }
    public static void main(String args[]){
        System.out.println(power(9));
        System.out.println(power(8));

    }
    
}
