// package stock;

public class BuyAndSell {
     public static void main(String[] args) {
        int [] prices = {7 ,1 , 5, 3,6, 4};
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        //loop
        for(int i =0 ; i<prices.length;i++){
           if(buyPrice<prices[i]){//profit
            int profile = prices[i] - buyPrice;
              maxProfit = Math.max(maxProfit,profile );
           }else{
            buyPrice = prices[i];
           }
        }

        System.out.println("max Profile is : "+ maxProfit);


     }
}
