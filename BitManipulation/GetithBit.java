package BitManipulation;

public class GetithBit {
    public static int get(int n,int i){
        i=1<<i;
        if((n&i)==0){
            return 0;

        }
        return 1;

    }
    public static void main(String args[]){
        System.out.println(get(10,1));

    }
    
}
