class Solution {
    // public static int findeZeros(int[] arr){
    //     int count  = 0;
    //     for(int i= 0; i < arr.length ; i++){
    //         if(arr[i] == 0){
    //             count++;
    //         }
    //     }
    //     //return zero count
    //     return count;
    // }

    public int longestOnes(int[] nums, int k) {
        int  n =nums.length;
        int low = 0;
        int res = 0;

        int[] arr = new int[2];//fron 0 and 1
        
        for(int i =0 ; i < n ; i++){
            //add update in array
            arr[nums[i]]++;

            //finde count of zeros freq 
            int zeroCount =  arr[0];

            //check infomation is corrent or not
            //infomation is not correct
            while(zeroCount  > k){
                // reduces low
                arr[nums[low]]--;
                low++;
                //agin finde count of zeros
               zeroCount = arr[0];
            }
           //calculate len
           int len = i - low +1 ;
           res = Math.max(len , res);
        }

        return res;


    }
}