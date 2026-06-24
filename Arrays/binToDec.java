public class binToDec {
    public static int  Decimal(int n){
        int dec=0;
        int pow=0;
        while(n>0){
            int m=n%10;
            dec+=m*Math.pow(2,pow);
            n/=10;
            pow++;
        }
        return dec;
    }
    public static void main(String args[]){
        System.out.println(Decimal(101));
    }
}
