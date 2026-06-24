package BitManipulation;

public class SetithBit {
    public static int set(int n,int i){
        int bitmask=1<<i;
        n=n|bitmask;
        return n;



    }
    public static  int clear(int n,int i){
        int bitmask=~(1<<i);
        n=n&bitmask;
        return n;


    }
    public static int update(int n,int i,int update){

        // if(update==0){
        //     return clear(n,i);
        // }else{
        //     return set(n,i);
        // }

        n=clear(n,i);
        int bitmask=update<<i;
        return n|bitmask;
    }

    public static void main(String args[]){
        System.out.println(set(10,2));
        System.out.println(clear(10,1));



    }
}
