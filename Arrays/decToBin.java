public class decToBin {
    public static int Binary(int n){
        int bin=0;
        while(n>0){
            int rem=n%2;
            bin=bin*10+rem;
            n/=2;

        }
        return bin;
    }
    public static void main(String args[]){
        System.out.println(Binary(5));

    }
    
}
