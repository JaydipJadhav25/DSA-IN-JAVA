public class Optimal {
 public static void main(String[] args) {
    // int [] nums = { 1,0 ,3 ,4, 5, 6,7};
    int [] nums = { 1};
    //  int j =-1;
     
    //  //finde zero index
    //         //check for nonzero
    //     for(int  i =0; i<nums.length;i++){
    //         if(nums[i] == 0){
    //             j=i;
    //             break;
    //         }
    //     }
    //  //non zero return 
    //   if(j == -1){
    //     System.out.println("in array no zero are persent");
    //     return;
    //   }

    //     //check and swap
    //     for(int i =j+1 ; i<nums.length;i++){
    //         //check 
    //         if(nums[i] != 0){
    //             //swap wit hj
    //             int temp = nums[i];
    //             nums[i] = nums[j];
    //             nums[j] = temp;
    //             j++;
    //         }
    //     }


        int j = 0; // Pointer to place the next non-zero element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Swap current element with the element at index j 
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;   // Move j to the next index for placing non-zero
            }
        }

        //print
        for(int  i =0; i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
                

 }   
}
