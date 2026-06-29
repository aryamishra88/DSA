package ArrayLists;

public class Assignment_2 {
    public static int following_key(int []nums,int key){
        int maxcount=0;
        int ans=0;
        int freq[]=new int[1001];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==key){
                int target=nums[i+1];
                freq[target]++;
                if(maxcount<freq[target]){
                    maxcount=freq[target];
                    ans=target;
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int []nums={1,100,200,1,100};
        int key=1;
        System.out.println(following_key(nums,key));

    }
    
}
