public class BuySell {
    public static void main(String[] args) {
        int[] arr = new int[]{7 ,1,5,3,6,4};


        int mini = arr[0];
        int profit = 0;
        for(int i=1; i<arr.length ; i++){
            int cost  = arr[i] - mini;

            //update profit
            profit = Math.max(profit, cost);

            //update mini
            mini = Math.min(mini , arr[i]);//check next
        }


        System.out.println("profit is :"+ profit);
    }
}
