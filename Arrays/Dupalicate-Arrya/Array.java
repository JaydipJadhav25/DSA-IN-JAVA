import java.util.HashSet;
import java.util.Set;

public class Array {
    public static void main(String[] args) {
        int[] nums = {1 ,1 ,2 ,2 ,3 ,3 ,4 ,5 ,6};
        //definde set
        //   Set<Integer> numSet = new HashSet<>();

        //   //add in set
        //   for(int i =0  ; i<nums.length; i++){
        //     //addedi into set
        //     numSet.add(nums[i]);
        //   }

        //   //llop
        //   int idx =0;
        //   for(Integer number : numSet){
        //      nums[idx] = number;
        //      idx++;
        //   }

        //   System.out.println("total uqnie elemt in array : "+ idx);


          //optimal appreoch  => two pointer
          int idx =0 ; //always first element is unuiq

          for(int j=1; j<nums.length ; j++){
            //check each element in array
            if(nums[idx] != nums[j]){
                //this is uniqe
                nums[idx+1] = nums[j];
                idx++;
            }
          }



          //print
          System.out.println("uniqw element is arrray : "+idx+1+2);
          System.out.println("uniqw element is arrray : "+ (idx+1));
          for(int i =0 ; i<nums.length;i++){
            System.out.print(nums[i]+" ");
          }


           //better => sort then check
           
    //        public static int duplicateNumber(int arr[]) {
    //     Arrays.sort(arr);
        
    //     for(int i = 1; i < arr.length; i++) {
    //         if(arr[i] == arr[i-1]) {
    //             return arr[i];  // found duplicate
    //         }
    //     }
        
    //     return -1; // if no duplicate found
    // }



    } 
}
