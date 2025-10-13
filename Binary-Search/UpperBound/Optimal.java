// package UpperBound;

public class Optimal {

    public static void main(String[] args) {
        int[] nums = new int[]{2,3,6,7,8,8,11,11,12};
        int target = 6;
        int n =  nums.length;
        int low = 0 ; 
        int high = n-1;
        int ans = n;

        while (low <=high) {
           int mid = (low+high)/2;

           if(nums[mid] > target){
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
