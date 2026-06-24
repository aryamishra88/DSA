package ArraysPart2;

public class TrappedRainWater {
    public static int trappedWater(int [] arr){
        int n=arr.length;
        int [] leftmax=new int[arr.length];  //  Auxiliary Arrays
        leftmax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            leftmax[i]=Math.max(leftmax[i-1],arr[i]);
        }
        int rightmax[]=new int[arr.length];   // Auxiliary Arrays
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],arr[i]);
        }
        int water=0;
        for(int i=0;i<arr.length;i++){
            int waterLevel=Math.min(leftmax[i],rightmax[i]);   //   WaterLevel 
            water+=waterLevel-arr[i];

        }
        return water;

    }
    public static void main(String args[]){
        int [] arr={4,2,0,6,3,2,5};
        int totalWaterTrapped=trappedWater(arr);
        System.out.println("Total water trapped is :"+totalWaterTrapped);

    }
}
