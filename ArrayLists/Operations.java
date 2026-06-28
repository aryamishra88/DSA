package ArrayLists;
import java.util.*;
public class Operations {
    public static void main(String args[]){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);  //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(5);
        System.out.println(list);

        //  Get Operation   -O(1)

        int element=list.get(2);
        System.out.println(element);

        // REmove Element

        list.remove(2);
        System.out.println(list);

        //  Set element at Index

        list.set(2,10);
        System.out.println(list);

        // Contains Element

        System.out.println(list.contains(1));
        System.out.println(list.contains(11));


        // Size of ArrayList

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();


        //  Reverse of ArrayList

        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }

        System.out.println();

        // Maximum in ArrayList

        int max=Integer.MIN_VALUE;

        for(int i=0;i<list.size();i++){
            // if(max<list.get(i)){
            //     max=list.get(i);
            // }

            max=Math.max(max,list.get(i));
        }
        System.out.println("Maximum element in ArrayList is : "+max);

        // Swap two numbers in ArrayList

        int idx1=1;
        int idx2=3;
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        System.out.println(list);


        //  Sorting an ArrayList

        // Optimized

        // Collection ->Interface
        // Collections ->Class

        // Collections.sort(list) -> Asscending Order
        System.out.println(list);
        Collections.sort(list);  
        System.out.println(list);

        // descending
        Collections.sort(list,Collections.reverseOrder());

        // Comparator -fnx logic

        System.out.println(list);






        

    }

     
    
}
