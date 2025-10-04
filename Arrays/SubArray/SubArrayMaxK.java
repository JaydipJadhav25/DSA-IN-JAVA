import java.util.HashMap;
import java.util.Map;

public class SubArrayMaxK {
    public static void main(String[] args) {
            int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 1000;

        Map<Integer, Integer> map = new HashMap<>();
        // Initialize map with prefix sum 0 having a count of 1
        map.put(0, 1);
        
        int count = 0;
        int prefixSum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            // 1. Calculate the current prefix sum
            prefixSum += arr[i];
            
            // 2. Calculate the sum we need to "remove"
            int remove = prefixSum - k;
            
            // 3. Check if 'remove' sum exists and add its frequency to the count
            count += map.getOrDefault(remove, 0);
            
            // 4. Update the map with the current prefix sum's frequency
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        System.out.println("Final Map of Prefix Sum Frequencies: " + map);
        System.out.println("Number of subarrays with sum " + k + ": " + count);



        
    }
}

