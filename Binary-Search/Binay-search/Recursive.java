// package Binay-search;

public class Recursive {

     public static int  fn(int[] arr , int low , int high , int target){
          
          //base case
          if(low > high) { 
            return -1;
        }

        int mid = (low+high)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] < target){
            return  fn(arr , mid+1 ,  high ,  target);
        }


            return  fn(arr , low , mid -1 ,  target);

     }

    public static void main(String[] args) {
        int[] nums = new int[]{1 ,2 ,3 ,4 ,5 ,6 ,  7, 8,9};
        int target = 90;
          int ans = -1;
        int n = nums.length;
         ans = fn(nums , 0 ,n-1, target);
        System.out.println("index is : "+ ans);
    }
    
}
