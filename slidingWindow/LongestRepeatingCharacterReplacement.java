class Solution {
      
     public int findeMax(int[] nums){
        int max = 0;
        for(int i =0 ; i<nums.length ; i++){
            max = Math.max(nums[i] , max);
        }
        return max;
     }

     public int characterReplacement(String s, int k) {
      int low = 0;
      int n = s.length();
      //define array with size 256
      int[] arr = new int[256];
      int res = 0;
      //loop
      for(int i =0 ; i< n ; i++){
        //add in array
        int curr = s.charAt(i);
        arr[curr]++;
        //finde lenght and diff
        int len = i - low +1;
        int maxCnt = findeMax(arr);
        int diff = len - maxCnt ;

        //diff > k
        while(diff > k){
            //reduce low
         int currChar = s.charAt(low);
         arr[currChar]--;
         low++;
         //agin finde diff
         len = i - low +1 ;
        maxCnt = findeMax(arr);
        diff = len - maxCnt ;

        }

        //now diff <= k
        len = i - low +1;
        res = Math.max(res , len);

      }
      
      return res;
        
    }
}