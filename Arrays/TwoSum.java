public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        for(int i = 0 ; i<nums.length ; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        int target = 9;
        int sum  = 0;

         for(int i = 0 ; i<nums.length ; i++){
            //sum of values
            sum +=nums[i];

            //check
            if(sum <= target){
             //update
              nums[i] = i;
            }
        }


         for(int i = 0 ; i<nums.length ; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
