import java.util.*;
public class LeapYear{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.println("Enter the year:");
        year=sc.nextInt();
        String y=(year%4==0&&(year%100!=0||year%400==0))?"Leap Year":"Not Leap Year";
        System.out.println(y);

        
    }
}