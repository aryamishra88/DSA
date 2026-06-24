import java.util.*;
public class Binomial {
    public static int fact(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f*=i;
        }
        return f;
    }
    public static int binomial(int n,int r){
        return fact(n)/(fact(r)*fact(n-r));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n..");
        int n=sc.nextInt();
        System.out.println("Enter the value of r..");
        int r=sc.nextInt();
        System.out.println("Binomial coefficient of number is :"+binomial(n,r));

    }
    
}
