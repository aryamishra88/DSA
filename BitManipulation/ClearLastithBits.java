package BitManipulation;

public class ClearLastithBits {
    public static int clear(int n,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }
    public static int clearRange(int n,int i,int j){
        int bitmaskleft=(~0)<<(j+1);
        int bitmaskright=(1<<i)-1;
        int bitmask=bitmaskleft|bitmaskright;
        return n&bitmask;
    }
    public static void main(String arg[]){
        System.out.println(clear(15,2));
        System.out.println(clearRange(10,2,4));
    }
    
}
