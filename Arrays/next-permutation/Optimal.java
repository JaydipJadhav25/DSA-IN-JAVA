

public class Optimal {
     // The custom method that mimics the C++ behavior
    public static void reverse(int[] arr, int start, int end) {
        // Adjust C++-style end (exclusive) to Java-style end (inclusive index)
        int left = start;
        int right = end - 1; 

        while (left < right) {
            // Swap arr[left] and arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers inward
            left++;
            right--;
        }
    }
   public static void main(String[] args) {
      int[] nums = {5, 4, 0, 0};

       int idx = -1;
        int n = nums.length;
        //finde break point
        for(int i = n-2 ; i>=0 ; i--){
            if(nums[i]<nums[i+1]){
                idx = i;
                break;
            }
        }

        //idx -1
        if(idx == -1){
            reverse(nums , 0 , n);
            return;
        }
        //finde larger 
        for(int i=n-1 ; i>=idx ; i--){
            if(nums[i] > nums[idx]){
                //swap
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }

        //rever reaming

        reverse(nums , idx+1 , n);
        return;

 

    
   }
    
}