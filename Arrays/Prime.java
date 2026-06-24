import java.util.*;
public class Prime {
    public static Boolean isPrime(int n){
        if(n==2){
            return true;
        }
            Boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                    
                }
            }
            
        
        return isPrime;

    }
    public static void primeInRange(int n){
        for(int i=2;i<=n;i++){
                if(isPrime(i)==true){
                    System.out.println(i);
                }
        }
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Primes in range are:");
        primeInRange(num);

        

    }
    
}
