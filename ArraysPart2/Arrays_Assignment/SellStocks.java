package ArraysPart2.Arrays_Assignment;

public class SellStocks {
    public static int stocks(int[] prices){
        int maxProfit=Integer.MIN_VALUE;
        int buyPrice=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]>=buyPrice){
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);

            }else{
                buyPrice=prices[i];
            }
        }if(maxProfit<=0){
            return 0;
        }
        return maxProfit;

   }
    public static void main(String args[]){
        int []prices={7,6,4,3,1};
        System.out.println(stocks(prices));
    }
}
