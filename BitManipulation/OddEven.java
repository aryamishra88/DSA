package BitManipulation;

public class OddEven {
    public static void checkOddEven(int n){
        int bitmask=1;
        if((n&bitmask)==1){

            System.out.println(n+" is odd");
        }else{
             System.out.println(n+" is even");
        }

    }
    public static void main(String arg[]){
        checkOddEven(3);
        checkOddEven(4);
        checkOddEven(7);

    }

}
