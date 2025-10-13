// package LowerBound;

public class Optimal {
    public static void main(String[] args) {
        int[] nums = new int[]{1 ,2 ,3 ,4,5 ,6 ,  7, 8,9};
        int target = 3;
        int n =  nums.length;
        int low = 0 ; 
        int high = n-1;
        int ans = n;

        while (low <=high) {
           int mid = (low+high)/2;

           if(nums[mid] >= target){
            //this may be ans
            ans = mid;
            high = mid-1;

           }else{

             low = mid+1;

           }

        }


        System.out.println("index : "+ ans);
    }
    
}
