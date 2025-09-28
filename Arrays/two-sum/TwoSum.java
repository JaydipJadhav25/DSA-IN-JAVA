// package two-sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 6, 5,8,11};
        int target = 14;
          
        //1.brute force
        //method -1
        // boolean flag = false;
        // for(int i =0 ; i<arr.length ; i++){
        //      for(int j =0 ; j<arr.length ; j++){
        //         //check each element
        //     if(i == j){
        //         continue;
        //     }else if(arr[i]+arr[j] == target ){
        //         System.out.println("["+i+" "+j+"]");
        //         flag = true;
        //         break;
        //     }
            
        //     }
        //     //exist not check next
        //     if(flag){
        //         break;
        //     }
        // }


         //method -2
        
        // for(int i =0 ; i<arr.length ; i++){
        //      for(int j =i+1; j<arr.length ; j++){
        //      if(arr[i]+arr[j] == target ){
        //         System.out.println("["+i+" "+j+"]");
                
        //         break;
        //     }
            
        //     }
        // }


        //2.better appreoch => using hashmap
        //loop and stro
        // 1. Initialize the map (key: number, value: index)
        Map<Integer, Integer> arrMap = new HashMap<>(); 

    // 2. Iterate through the array
    for (int i = 0; i < arr.length; i++) {
        // Calculate the required complement
        int required = target - arr[i];

        // 3. CHECK: Use containsKey() to see if the complement is already in the map
        if (arrMap.containsKey(required)) { 
            // If the complement is found, a pair exists.
            // You can also retrieve the index: int complementIndex = arrMap.get(required);
            int ele = arrMap.get(required);
            // System.out.println("Yes, a pair sums to the target. and Index is"+  i +" "+ ele);
        }
        
        // 4. ADD: If the complement wasn't found, add the current element and its index to the map
        arrMap.put(arr[i], i);
    }

    // 5. If the loop finishes without finding a pair
    // System.out.println("No, no pair sums to the target.");




    //3.optimal => two pointer
    int left = 0;
    int right = arr.length-1;
    //frist sort
    Arrays.sort(arr);

    while (left != right) {
        //check
        if(arr[left] + arr[right] == target){
            System.out.println("yes"+ left+":"+right);
            break;
        }
        if(arr[left]+arr[right] <target){
            //incress left
            left++;
        }else{
            right--;
        }
    }

    System.out.println("no");

    }
    
}
